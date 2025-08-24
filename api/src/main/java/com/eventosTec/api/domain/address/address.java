package com.eventosTec.api.domain.address;

import com.eventosTec.api.domain.event.Event;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "address")
@Entity
public class address {
    @Id
    @GeneratedValue
    private UUID ui;

    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}
