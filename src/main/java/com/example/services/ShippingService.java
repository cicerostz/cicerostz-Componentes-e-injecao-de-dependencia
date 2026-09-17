package com.example.services;

import com.example.entities.Order;
import org.springframework.stereotype.Service;


@Service
public class  ShippingService {

    private Order order;

    public double shippiment(Order order){
        this.order = order;
        if(order.getBasic() < 100.0){
            return order.getBasic() + 20.0;
        } else if(order.getBasic() >= 100.0 && order.getBasic() < 200.0){
            return order.getBasic() + 12.0;
        } else {
            return order.getBasic();
        }
    }

}
