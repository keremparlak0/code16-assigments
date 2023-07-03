package com.filghtTicketSimulator.week4.service;

import com.filghtTicketSimulator.week4.entity.Ticket;
import com.filghtTicketSimulator.week4.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public Ticket addTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    public Ticket ticketById(Long ticketId){
        return ticketRepository.findById(ticketId).get();
    }

    public void deleteTicketById(Long ticketId){
        ticketRepository.deleteById(ticketId);
    }
}
