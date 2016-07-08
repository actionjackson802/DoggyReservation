package com.applesauce.service;

import com.applesauce.model.Reservation;
import com.applesauce.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JacksonChang408 on 5/19/2016.
 */
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    public Reservation addReservation(Reservation reservation){
        System.out.println(reservation.toString());
        reservationRepository.save(reservation);
        return reservation;
    }
}
