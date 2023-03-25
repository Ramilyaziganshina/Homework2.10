package com.example.homework210.controllers;

import com.example.homework210.entities.Order;
import com.example.homework210.services.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RestController
@RequestMapping("/store/order")
@Scope(WebApplicationContext.SCOPE_SESSION)
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Order> add(@RequestParam("ids") List<Integer> ids) {
        return orderService.add(ids);
    }

    @GetMapping("/get")
    public List<Order> get() {
        return orderService.getAll();
    }
}