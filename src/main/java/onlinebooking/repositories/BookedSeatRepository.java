package main.java.onlinebooking.repositories;

import java.util.List;

import main.java.onlinebooking.domain.BookedSeat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bookedseat")
public interface BookedSeatRepository extends MongoRepository<BookedSeat, String> {

    public List<BookedSeat> findByDate(String date);
    public BookedSeat findByTrainNoAndDate(int trainNo, String date);


}
