package ru.eroonda.ticketservice.model;

import java.time.LocalDateTime;

public class Ticket {
    private Long id;
    private Long authorId;
    private Long performerId;
    private Long departmentId;
    private String topic;
    private Long contentId;
    private TicketStatus ticketStatus;
    private String tags;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;
    private TicketPriority ticketPriority;
}
