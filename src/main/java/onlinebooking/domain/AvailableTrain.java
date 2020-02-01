package main.java.onlinebooking.domain;

public class AvailableTrain {

    private int trainNo;
    private String fromStation;
    private String toStation;
    private int availableNumberOfSeats;
    private String trainName;
    private int fare;
    private String startTime;
    private String endTime;
    private String date;

    public int getAvailableNumberOfSeats() {
        return availableNumberOfSeats;
    }

    public void setAvailableNumberOfSeats(int availableNumberOfSeats) {
        this.availableNumberOfSeats = availableNumberOfSeats;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
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

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "AvailableTrain{" +
                "trainNo=" + trainNo +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", availableNumberOfSeats=" + availableNumberOfSeats +
                ", trainName='" + trainName + '\'' +
                ", fare=" + fare +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
