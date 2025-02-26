package edu.eci.cvds.stock.agents;

import edu.eci.cvds.stock.domain.Product;
import org.springframework.stereotype.Component;

@Component
public interface Agent {
    void productNotification(Product product);
}
