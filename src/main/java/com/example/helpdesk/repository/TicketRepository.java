package com.example.helpdesk.repository;

import com.example.helpdesk.model.Ticket;
import com.example.helpdesk.model.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findAllByOrderByCreatedAtDesc();

    List<Ticket> findByStatus(TicketStatus status);
}