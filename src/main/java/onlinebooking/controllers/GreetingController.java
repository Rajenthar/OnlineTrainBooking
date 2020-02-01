package main.java.onlinebooking.controllers;

import main.java.onlinebooking.domain.Request;
import main.java.onlinebooking.domain.Station;
import main.java.onlinebooking.domain.Train;
import main.java.onlinebooking.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    @Autowired
    private TrainRepository trainRepository;

    @GetMapping("/")
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
}
