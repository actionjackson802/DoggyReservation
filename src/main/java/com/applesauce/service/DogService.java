package com.applesauce.service;

import com.applesauce.model.Dog;
import com.applesauce.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JacksonChang408 on 5/19/2016.
 */
@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAllDogs(){
        return dogRepository.findAll();
    }

    public Dog addDog(Dog dog){
        dogRepository.save(dog);
        return dog;
    }
}