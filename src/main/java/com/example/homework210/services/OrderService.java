package com.example.homework210.services;

import java.util.List;

public interface OrderService {

    void add(List<Integer> ids);

    List<Integer> getAll();

}