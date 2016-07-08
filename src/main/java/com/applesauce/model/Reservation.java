package com.applesauce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;

/**
 * Created by JacksonChang408 on 5/19/2016.
 */
public class Reservation {

    @Id
    private String id;
    private Date startDate;
    private Date endDate;
    private Date meetAndGreet;
    private double netAmount;
    @DBRef
    private Customer customer;
    @DBRef
    private List<Dog> dogs;


    public Reservation() {
    }

    public Reservation(Date startDate, Date endDate, Date meetAndGreet, double netAmount, Customer customer, List<Dog> dogs) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.meetAndGreet = meetAndGreet;
        this.netAmount = netAmount;
        this.customer = customer;
        this.dogs = dogs;
    }

    public Reservation(Date startDate, Date endDate, Date meetAndGreet, double netAmount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.meetAndGreet = meetAndGreet;
        this.netAmount = netAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getMeetAndGreet() {
        return meetAndGreet;
    }

    public void setMeetAndGreet(Date meetAndGreet) {
        this.meetAndGreet = meetAndGreet;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

}
