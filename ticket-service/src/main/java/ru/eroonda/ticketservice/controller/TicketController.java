package ru.eroonda.ticketservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eroonda.ticketservice.service.TicketService;

@Slf4j
@RestController
@RequestMapping //(value = "/test/")
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @GetMapping
    public ResponseEntity<String> getTicket() {
        return ResponseEntity.ok("Ticket Service");
    }

    @GetMapping("/test/")
    public ResponseEntity<String> getTicketTest() {
        return ResponseEntity.ok("Ticket Service2");
    }
}
