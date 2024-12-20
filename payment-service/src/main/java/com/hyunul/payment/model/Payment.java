package com.hyunul.payment.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    private Long id;
    private Long reservationId;
    private String paymentMethod;
    private Double amount;
}
