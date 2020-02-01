package main.java.onlinebooking.domain;

public class Train {
    private String id;
    private String trainName;
    private int trainNO;
    private String fromStation;
    private String toStation;
    private int fare;
    private String startTime;
    private String endTime;
    private int noOfCompartment;
    private int noOfSeat;

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getTrainNO() {
        return trainNO;
    }

    public void setTrainNO(int trainNO) {
        this.trainNO = trainNO;
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

    public int getNoOfCompartment() {
        return noOfCompartment;
    }

    public void setNoOfCompartment(int noOfCompartment) {
        this.noOfCompartment = noOfCompartment;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", trainName='" + trainName + '\'' +
                ", trainNO=" + trainNO +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", fare=" + fare +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", noOfCompartment=" + noOfCompartment +
                ", noOfSeat=" + noOfSeat +
                '}';
    }
}
