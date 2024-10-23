package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OderService {
    @Autowired
    private ShippingService shippingService;

public  double total(Order order){
    return order.getTotalDiscount()+shippingService.shipment(order);
}

}
