package com.applesauce.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by JacksonChang408 on 5/17/2016.
 */
public class Customer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String source;

    private List<Dog> dog;
    //private List<Reservation> reservation;

    public Customer() {

    }
    public Customer(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Customer(String firstName, String lastName, String email, String phoneNumber, String source) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.source = source;

        this.dog = new ArrayList<Dog>();
        //this.dog.add(new Dog("Jackson","Male", 45,"Lab", true, "Eats Alot"));
        //this.dog.add(new Dog("Jackson","Male", 45,"Lab", true, "Eats Alot"));
        //this.dog.add(new Dog("Jackson","Male", 45,"Lab", true, "Eats Alot"));
        //this.reservation = new ArrayList<Reservation>();
        //this.reservation.add(new Reservation(new Date(), new Date(), new Date(), 100.15));
        //this.reservation.add(new Reservation(new Date(), new Date(), new Date(), 100.15));
        //this.reservation.add(new Reservation(new Date(), new Date(), new Date(), 100.15));
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Dog> getDog() {
        return dog;
    }

    public void setDog(List<Dog> dog) {
        this.dog = dog;
    }

    public boolean addDog(String name, String sex, int weight, String breed, boolean spayed, String notes){
        return dog.add(new Dog(name,sex,weight,breed,spayed,notes));
    }

    /*public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }*/

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
