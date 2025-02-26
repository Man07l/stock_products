package edu.eci.cvds.stock.agents;

import edu.eci.cvds.stock.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class AgentLog implements Agent{
    @Override
    public void productNotification(Product product){
        System.out.println("Producto: " +product.getName()+ "-> "
                +product.getStockQuantity()+"unidades disponibles");
    }
}
