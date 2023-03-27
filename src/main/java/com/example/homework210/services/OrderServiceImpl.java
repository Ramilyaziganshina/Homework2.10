package com.example.homework210.services;

import com.example.homework210.entities.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> ids) {
        basket.add(ids);
    }

    public List<Integer> getAll() {
        return basket.get();
    }
}