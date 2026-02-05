package ru.eroonda.ticketservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Ticket-service", description = "Все эндпоинты Ticket-service")
public interface TicketController {
    @Operation(summary = "Gets all tickets", tags = "ticket")
    ResponseEntity<String> getTicket();
}
