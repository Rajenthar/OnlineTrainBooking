package main.java.onlinebooking.controllers;

//import main.java.onlinebooking.container.AvailableTrainContainer;
import main.java.onlinebooking.domain.*;
import main.java.onlinebooking.repositories.BookedSeatRepository;
import main.java.onlinebooking.repositories.TicketRepository;
import main.java.onlinebooking.repositories.TrainRepository;
//import main.java.onlinebooking.repositories.TrainRepository;
//import main.java.onlinebooking.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class TrainController {

    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    private BookedSeatRepository bookedSeatRepository;

    @Autowired
    private TicketRepository ticketRepository;

//    @GetMapping("/")
    public String startForm(Model model) {
        List<Train> allTrains = trainRepository.findAll();
        List<String> from = new ArrayList<>();
        List<String> to = new ArrayList<>();
        List<Station> fromStations = new ArrayList<>();
        List<Station> toStations = new ArrayList<>();
        for (Train trn : allTrains){
            if (!from.contains(trn.getFromStation())){
                from.add(trn.getFromStation());
            }
        }
        for (Train trn : allTrains){
            if (!to.contains(trn.getToStation())){
                to.add(trn.getToStation());
            }
        }
        String fromStr = "";
        String toStr = "";

        for (String str : from){
            Station station = new Station();
            station.setTrainStation(str);
            fromStr = fromStr.concat(str).concat(",");
            fromStations.add(station);
        }
        for (String str : to){
            Station station = new Station();
            station.setTrainStation(str);
            toStr= toStr.concat(str).concat(",");
            toStations.add(station);
        }

        model.addAttribute("request", new Request());
        model.addAttribute("FromStr", fromStr.substring(0, fromStr.length()-1));
        model.addAttribute("ToStr", toStr.substring(0, toStr.length()-1));
        return "start";
    }

    @GetMapping("/availableTrains")
    public String getAllTrain(@ModelAttribute Request request, Model model){
        List<AvailableTrain> availableTrains = new ArrayList<>();
        List<Train> availableTrns = trainRepository.findByFromStationAndToStation(request.getFromStation(), request.getToStation());

        for (Train train : availableTrns){
            AvailableTrain availableTrain = new AvailableTrain();
            availableTrain.setEndTime(train.getEndTime());
            availableTrain.setStartTime(train.getStartTime());
            availableTrain.setFromStation(train.getFromStation());
            availableTrain.setToStation(train.getToStation());
            availableTrain.setTrainName(train.getTrainName());
            availableTrain.setFare(train.getFare());
            availableTrain.setTrainNo(train.getTrainNO());
            availableTrain.setDate(request.getDate());

            BookedSeat bookedSeat = bookedSeatRepository.findByTrainNoAndDate(train.getTrainNO(), request.getDate());

            if(bookedSeat != null){
                availableTrain.setAvailableNumberOfSeats(bookedSeat.getAvailableNumberOfSeats());
            } else {
                availableTrain.setAvailableNumberOfSeats(104);
            }
            availableTrains.add(availableTrain);
        }
        model.addAttribute("AvailableTrains", availableTrains);

        return "selectTrain";
    }

    @GetMapping("/check")
    public String getAllTrain(@RequestParam("trainName") String trainName, @RequestParam("trainNo") String trainNo, @RequestParam("date") String date, @RequestParam("fromStation") String fromStation, @RequestParam("toStation") String toStation, @RequestParam("fare") String fare, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime, Model model){
        Book book = new Book();
        book.setTrainName(trainName);
        book.setTrainNo(trainNo);
        book.setDate(date);
        book.setFromStation(fromStation);
        book.setToStation(toStation);
        book.setFare(Integer.parseInt(fare));

        BookedSeat bookedSeat = bookedSeatRepository.findByTrainNoAndDate(Integer.parseInt(trainNo), date);

        book.setStartTime(startTime);
        book.setEndTime(endTime);
        if(bookedSeat != null){
            book.setBookedSeats(bookedSeat.getBookedSeats());
            book.setAvailableNumberOfSeats(String.valueOf(bookedSeat.getAvailableNumberOfSeats()));
        }else {
            String[] stringArray = new String[] {"NA,NA"};
            book.setBookedSeats(stringArray);
            book.setAvailableNumberOfSeats("104");
        }

        model.addAttribute("booking", book);
        System.out.println(book);
        return "booking";
    }

    @PostMapping("/ticket")
    public String showTicket(@RequestParam("trainName") String trainName, @RequestParam("trainNo") String trainNo, @RequestParam("date") String date, @RequestParam("fromStation") String fromStation, @RequestParam("toStation") String toStation, @RequestParam("total") String fare, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime, @RequestParam("user") String Username, @RequestParam("phone") String Phonenumber, @RequestParam("noOfSeats") String Numseats, @RequestParam("seatList") String seats, Model model){
        Ticket ticket = new Ticket();
        ticket.setName(Username);
        ticket.setTrainName(trainName);
        ticket.setTrainNo(trainNo);
        ticket.setFromStation(fromStation);
        ticket.setToStation(toStation);
        ticket.setDate(date);
        ticket.setStartTime(startTime);
        ticket.setEndTime(endTime);
        ticket.setAmount(Integer.parseInt(fare));
        ticket.setPhoneNo(Phonenumber);
        ticket.setNoOfTicket(Integer.parseInt(Numseats));
        ticket.setTicketIds(seats);
        String[] seatL = seats.split(",");

        ticketRepository.save(ticket);

        BookedSeat bookedSeat =  bookedSeatRepository.findByTrainNoAndDate(Integer.parseInt(trainNo), date);
        if (bookedSeat != null){
            bookedSeatRepository.delete(bookedSeat);
            String[] bookedSeats = bookedSeat.getBookedSeats();
            String[] values = seats.split(",");
            String[] finalArray = new String[values.length + bookedSeats.length];
            for (int i=0; i < bookedSeats.length; i++){
                finalArray[i] = bookedSeats[i];
            }
            for (int i=0; i < values.length; i++){
                finalArray[i+bookedSeats.length] = values[i];
            }
            bookedSeat.setBookedSeats(finalArray);
            int availableNoOfSeats = bookedSeat.getAvailableNumberOfSeats();
            bookedSeat.setAvailableNumberOfSeats(availableNoOfSeats - seatL.length);
            bookedSeatRepository.save(bookedSeat);
            System.out.println("Updated successfully into bookedseat Repository");
        } else {
            BookedSeat bookedSeat1 = new BookedSeat();
            bookedSeat1.setTrainNo(Integer.parseInt(trainNo));
            bookedSeat1.setBookedSeats(seats.split(","));
            bookedSeat1.setAvailableNumberOfSeats(104 - seatL.length);
            bookedSeat1.setDate(date);
            bookedSeatRepository.save(bookedSeat1);
            System.out.println("Inserted successfully into bookedseat Repository");
        }

        System.out.println("Successfully inserted");
        model.addAttribute("Ticket", ticket);
        return "ticket";
    }
}