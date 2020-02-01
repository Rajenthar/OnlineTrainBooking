package main.java.onlinebooking.repositories;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import main.java.onlinebooking.domain.Train;

@Document(collection="train")
public interface TrainRepository extends MongoRepository<Train, String>{

    public Train findByFromStation(String fromStation);
    public List<Train> findByToStation(String toStation);
    public List<Train> findByFromStationAndToStation(String fromStation, String toStation);
    public Train findByFromStationAndToStationAndTrainNO(String fromStation, String toStation, String trainNO);
}
