package main.java.onlinebooking.repositories;

//import java.util.List;
import main.java.onlinebooking.domain.Compartment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="compartment")
public interface CompartmentRepository extends MongoRepository<Compartment, String> {

    public Compartment findByTrainNo(int trainNo);

}
