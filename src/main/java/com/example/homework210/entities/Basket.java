package com.example.homework210.entities;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
public class Basket {

    private List<Integer> orders = new ArrayList<>();

    public List<Integer> add(List<Integer> ids) {
        orders.addAll(ids);
        return orders;
    }

    public List<Integer> get() {
        return orders;
    }

}