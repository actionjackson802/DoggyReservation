package com.applesauce.repository;

/**
 * Created by JacksonChang408 on 5/17/2016.
 */
import java.util.List;
import com.applesauce.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    //public Customer findByFirstName(String firstName);
    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
    public Customer findByEmail(String email);
}