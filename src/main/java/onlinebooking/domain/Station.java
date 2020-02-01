package main.java.onlinebooking.domain;

public class Station {
    private String trainStation;

    public String getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(String trainStation) {
        this.trainStation = trainStation;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Station{" +
                "trainStation='" + trainStation + '\'' +
                '}';
    }
}
