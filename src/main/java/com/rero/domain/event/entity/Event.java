package com.rero.domain.event.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long eventNo;

    private String eventName;
}
