package com.hyunul.reservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    private Long id;
    private String user;
    private String item;
    private String reservationDate;
}
