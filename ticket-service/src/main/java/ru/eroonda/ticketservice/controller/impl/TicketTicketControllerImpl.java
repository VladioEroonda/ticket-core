package ru.eroonda.ticketservice.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eroonda.ticketservice.controller.TicketController;
import ru.eroonda.ticketservice.service.TicketService;

@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class TicketTicketControllerImpl implements TicketController {
    private final TicketService ticketService;

    @GetMapping
    @Override
    public ResponseEntity<String> getTicket() {
        return ResponseEntity.ok("Ticket Service");
    }
}
