package com.acciojob.GetRide.repository;

import com.acciojob.GetRide.model.Customer;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByEmailId(String emailId);
//    List<Customer> findByName(String name);
    @Query(value = "select * from customer_details where customer_gender = :gender and customer_age >= :age", nativeQuery = true)
    public List<Customer> getAllByGenderAndAgeGreaterThan(String gender, int age);

}
