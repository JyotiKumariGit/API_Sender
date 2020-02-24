package com.apitesting.api.Repository;

import com.apitesting.api.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public void saveOrder(Customer orderRequest){
        orderRepository.save(orderRequest);
    }
}