package com.example.homework210.services;

import com.example.homework210.entities.Order;

import java.util.List;

public interface OrderService {

    List<Order> add(List<Integer> ids);

    List<Order> getAll();
}