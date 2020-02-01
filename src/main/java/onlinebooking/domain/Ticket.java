package main.java.onlinebooking.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.util.Random;
import java.time.Instant;



@Document(collection = "ticket")
public class Ticket {

    @Id
    private long id;
    private String name;
    private String fromStation;
    private String toStation;
    private String phoneNo;
    private String date;
    private String startTime;
    private String endTime;
    private int amount;
    private int noOfTicket;
    private String ticketIds;
    private String trainNo;
    private String trainName;

    public Ticket() {
        long millis = Instant.now().toEpochMilli();
        System.out.println(millis);
        Random rand = new Random();
        int rnd = rand.nextInt(2500);
        System.out.println(Long.toString(millis) + Integer.toString(rnd));
        this.id = Long.parseLong(Long.toString(millis) + Integer.toString(rnd));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNoOfTicket() {
        return noOfTicket;
    }

    public void setNoOfTicket(int noOfTicket) {
        this.noOfTicket = noOfTicket;
    }

    public String getTicketIds() {
        return ticketIds;
    }

    public void setTicketIds(String ticketIds) {
        this.ticketIds = ticketIds;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", amount=" + amount +
                ", noOfTicket=" + noOfTicket +
                ", ticketIds='" + ticketIds + '\'' +
                ", trainNo='" + trainNo + '\'' +
                ", trainName='" + trainName + '\'' +
                '}';
    }
}
