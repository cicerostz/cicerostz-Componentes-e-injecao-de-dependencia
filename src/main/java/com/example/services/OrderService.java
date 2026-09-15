package com.example.services;

import com.example.entities.Order;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
    Order order;

    public double total(Order order) {
        this.order = order;
        double desconto = order.getBasic() * (order.getDiscount() / 100.0);
        return order.getBasic() - desconto;
    }

}
