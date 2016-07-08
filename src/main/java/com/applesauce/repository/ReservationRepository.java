package com.applesauce.repository;

import com.applesauce.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JacksonChang408 on 6/13/2016.
 */
@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
