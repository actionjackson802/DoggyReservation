package com.applesauce.repository;

import com.applesauce.model.Dog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by JacksonChang408 on 5/23/2016.
 */
@Repository
public interface DogRepository extends MongoRepository<Dog, String> {

}