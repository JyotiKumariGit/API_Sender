package com.apitesting.api.Repository;
import com.apitesting.api.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;
import com.apitesting.api.Customer;
import org.springframework.stereotype.Repository;

    @Repository
    public interface OrderRepository extends JpaRepository<Customer, OrderId> {
    }

