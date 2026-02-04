package ru.eroonda.ticketservice.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.eroonda.ticketservice.repository.TicketRepository;
import ru.eroonda.ticketservice.service.TicketService;

@Slf4j
@Service
@RequiredArgsConstructor
public class TicketServiceImpl  implements TicketService {
    private final TicketRepository ticketRepository;
}
