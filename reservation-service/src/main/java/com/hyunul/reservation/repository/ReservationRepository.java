package com.hyunul.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyunul.reservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
