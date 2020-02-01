package main.java.onlinebooking.domain;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.util.Random;
import java.time.Instant;

@Document(collection = "bookedseat")
public class BookedSeat {
    @Id
    private String id;
    private int trainNo;
    private String date;
    private String[] bookedSeats; //a,b,a,b a-compartment id   b-seat number
    private int availableNumberOfSeats;

    public BookedSeat() {
        long millis = Instant.now().toEpochMilli();
        System.out.println(millis);
        Random rand = new Random();
        int rnd = rand.nextInt(2500);
        System.out.println(Long.toString(millis) + Integer.toString(rnd));
        this.id = Long.toString(millis) + Integer.toString(rnd);
    }

    public int getAvailableNumberOfSeats() {
        return availableNumberOfSeats;
    }

    public void setAvailableNumberOfSeats(int availableNumberOfSeats) {
        this.availableNumberOfSeats = availableNumberOfSeats;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(String[] bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "BookedSeat{" +
                "id='" + id + '\'' +
                ", trainNo=" + trainNo +
                ", date='" + date + '\'' +
                ", bookedSeats=" + java.util.Arrays.toString(bookedSeats) +
                ", availableNumberOfSeats=" + availableNumberOfSeats +
                '}';
    }
}
