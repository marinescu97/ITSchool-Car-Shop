package com.project.itschool_car_shop.repositories;

import com.project.itschool_car_shop.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByNameAndEmail(String name, String email);

    @Query(value = "SELECT * FROM customers WHERE name = :name AND email = :email", nativeQuery = true)
    List<Customer> findByNameAndEmail2(String name, String email);
}
