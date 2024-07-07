package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ViewTicket {

    private final TicketNumberGenerator generator;
@Autowired
    public ViewTicket(TicketNumberGenerator generator) {
        this.generator = generator;
        System.out.println(newTicket());
    }

    public Ticket newTicket(){
        String ticketNumber = generator.createNewNumber();
        LocalDateTime time = LocalDateTime.now();
        Ticket ticket = new Ticket(ticketNumber,time);
        return ticket;
    }
}
