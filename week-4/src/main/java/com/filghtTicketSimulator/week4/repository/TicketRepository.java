package com.filghtTicketSimulator.week4.repository;

import com.filghtTicketSimulator.week4.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
