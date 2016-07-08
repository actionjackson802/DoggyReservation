package com.applesauce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by JacksonChang408 on 5/19/2016.
 */
public class Dog {

    @Id
    private String id;
    private String name;
    private String sex;
    private int weight;
    private String breed;
    private boolean spayed;
    private String notes;
    private String dogId;
    @DBRef
    private Customer owner;

    public Dog(){

    }

    public Dog(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Dog(String name, String sex, int weight, String breed, boolean spayed, String notes) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.breed = breed;
        this.spayed = spayed;
        this.notes = notes;
        this.dogId = name + breed + weight + sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSpayed() {
        return spayed;
    }

    public void setSpayed(boolean spayed) {
        this.spayed = spayed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDogId() {
        return dogId;
    }

    public void setDogId(String dogId) {
        this.dogId = dogId;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
