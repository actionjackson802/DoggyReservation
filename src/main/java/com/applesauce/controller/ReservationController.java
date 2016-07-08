package com.applesauce.controller;

import com.applesauce.model.Customer;
import com.applesauce.model.Dog;
import com.applesauce.model.Reservation;
import com.applesauce.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by JacksonChang408 on 5/19/2016.
 */
@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reseravtionService;

    @RequestMapping(value = "/getallreservations", method = RequestMethod.GET)
    public List<Reservation> getAllReservations(){
        return reseravtionService.getAllReservations();
    }


    @RequestMapping(value = "/addreservation", method = RequestMethod.PUT)
    public Reservation addReservation(@RequestParam("startDate")@DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date startDate,
                      @RequestParam("endDate") @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date endDate,
                      @RequestParam("meetAndGreet") @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) Date meetAndGreet,
                      @RequestParam("netAmount") double netAmount){


        ArrayList<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("575d161e1fbd0485ddf7e86a","Pepper"));
        return reseravtionService.addReservation(new Reservation(startDate,endDate,meetAndGreet,netAmount,new Customer("575d05ef1fbd74a92b9e377f","Alex","Chang"),dogList));
    }
}