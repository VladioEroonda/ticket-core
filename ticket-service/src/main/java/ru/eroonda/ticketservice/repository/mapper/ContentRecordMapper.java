package ru.eroonda.ticketservice.repository.mapper;

import org.jooq.RecordMapper;
import ru.eroonda.ticketservice.model.TicketContent;
import ru.eroonda.ticketservice.tables.records.TicketContentRecord;

public class ContentRecordMapper implements RecordMapper<TicketContentRecord, TicketContent> {
    @Override
    public TicketContent apply(TicketContentRecord record) {
        return RecordMapper.super.apply(record);
    }

    @Override
    public TicketContent map(TicketContentRecord ticketContentRecord) {
        return null;
    }
}
