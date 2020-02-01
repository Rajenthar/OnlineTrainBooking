package main.java.onlinebooking.domain;

public class Book {
    private String trainNo;
    private String fromStation;
    private String toStation;
    private String date;
    private String trainName;
    private int fare;
    private String[] bookedSeats;
    private String startTime;
    private String endTime;
    private String availableNumberOfSeats;

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

    public String getAvailableNumberOfSeats() {
        return availableNumberOfSeats;
    }

    public void setAvailableNumberOfSeats(String availableNumberOfSeats) {
        this.availableNumberOfSeats = availableNumberOfSeats;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getStringBookedSeats() {
        String str = "";
        // iterating over an array
        for (int i = 0; i < bookedSeats.length; i++) {

            // accessing each element of array
            str = str.concat(bookedSeats[i]).concat(",");
        }
        return str.substring(0,str.length()-1);
    }

    public String getBookedSeats() {

        String str = "";
        // iterating over an array
        for (int i = 0; i < bookedSeats.length; i++) {

            // accessing each element of array
            str = str.concat(bookedSeats[i]).concat(",");
        }
        return str.substring(0,str.length()-1);
    }

    public void setBookedSeats(String[] bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "Book{" +
                "trainNo='" + trainNo + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", date='" + date + '\'' +
                ", trainName='" + trainName + '\'' +
                ", fare=" + fare +
                ", bookedSeats=" + java.util.Arrays.toString(bookedSeats) +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", availableNumberOfSeats='" + availableNumberOfSeats + '\'' +
                '}';
    }
}
