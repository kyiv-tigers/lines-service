package com.tiger.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author Mykola Danyliuk
 */
@Data
@Entity
@Table(schema = "betting", name = "event")
public class Event {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "event_type")
    @Enumerated(EnumType.STRING)
    private EventType type;

    @Column(name = "event_status")
    @Enumerated(EnumType.STRING)
    private EventStatus status;

    @Column(name = "start_time")
    private OffsetDateTime startTime;

}
