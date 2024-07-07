package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {

    public String createNewNumber(){
        String x = UUID.randomUUID().toString();
        return "Ticket #" + x;
    }
}
