package com.applesauce.controller;

import com.applesauce.model.Dog;
import com.applesauce.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by JacksonChang408 on 5/19/2016.
 */
@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogService dogService;

    @RequestMapping(value = "/getalldogs", method = RequestMethod.GET)
    public List<Dog> getAllDogs(){
        return dogService.getAllDogs();
    }


    @RequestMapping(value = "/adddog", method = RequestMethod.PUT)
    public Dog addDog(@RequestParam("dogName") String dogName,
                      @RequestParam("dogSex") String dogSex,
                      @RequestParam("dogWeight") int dogWeight,
                      @RequestParam("dogBreed") String dogBreed,
                      @RequestParam("dogSpayed") boolean dogSpayed,
                      @RequestParam("dogNotes") String dogNotes){
        return dogService.addDog(new Dog(dogName,dogSex,dogWeight,dogBreed,dogSpayed,dogNotes));
    }
}
