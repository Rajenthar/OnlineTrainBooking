package main.java.onlinebooking.repositories;

import java.util.List;
import main.java.onlinebooking.domain.Ticket;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ticket")
public interface TicketRepository extends MongoRepository<Ticket, String> {

    public Ticket findByFromStation(String fromStation);
    public List<Ticket> findByToStation(String toStation);

}
