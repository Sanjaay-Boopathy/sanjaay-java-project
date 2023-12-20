package com.avslogin.AvsParcel.Repo;

import com.avslogin.AvsParcel.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepositry extends JpaRepository<Customer,Long> {


    Optional<Customer> findCustomerByEmail(String email);


}
