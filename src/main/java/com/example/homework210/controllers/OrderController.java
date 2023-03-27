package com.example.homework210.controllers;

import com.example.homework210.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("ids") List<Integer> ids) {
        orderService.add(ids);
        return "товар добавлен";
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return orderService.getAll();
    }
}