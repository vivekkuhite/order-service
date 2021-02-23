package com.vivek.learning.aws.orderservice;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(
                new Order(101,"Paratha",4,35),
                new Order(101,"Chicken Masala",1,300),
                new Order(101,"Chicken Biryani",1,250))
                .collect(Collectors.toList());
    }
}
