package com.filghtTicketSimulator.week4.controller;

import com.filghtTicketSimulator.week4.entity.Ticket;
import com.filghtTicketSimulator.week4.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @PostMapping("/save")
    public ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket){
        Ticket addTicket = ticketService.addTicket(ticket);
        return new ResponseEntity<Ticket>(addTicket, HttpStatus.CREATED);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id){
        Ticket ticketById = ticketService.ticketById(id);
        return new ResponseEntity<Ticket>(ticketById, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTicketById(@PathVariable Long id){
        ticketService.deleteTicketById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
