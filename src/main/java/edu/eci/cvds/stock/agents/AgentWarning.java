package edu.eci.cvds.stock.agents;

import edu.eci.cvds.stock.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class AgentWarning implements Agent{
    @Override
    public void productNotification(Product product){
        if (product.getStockQuantity()<5){
            System.out.println("ALERTA!!! El stock del Producto: "+product.getName()+
                    "solo quedan "+product.getStockQuantity()+"unidades.");

    }
}
}
