package ru.eroonda.ticketservice.repository.mapper;

import org.jooq.RecordMapper;
import ru.eroonda.ticketservice.model.Ticket;
import ru.eroonda.ticketservice.tables.records.TicketRecord;

public class TicketRecordMapper implements RecordMapper<TicketRecord, Ticket> {
    @Override
    public Ticket apply(TicketRecord record) {
        return RecordMapper.super.apply(record);
    }

    @Override
    public Ticket map(TicketRecord ticketRecord) {
        return null;
    }
}
