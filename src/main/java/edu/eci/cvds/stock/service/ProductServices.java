package edu.eci.cvds.stock.service;

import edu.eci.cvds.stock.agents.*;
import edu.eci.cvds.stock.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private List<Agent> agents;
    private List<Product> products;

    public ProductServices(){
        this.products = new ArrayList<>();
    }

    public void updateProductQuantity(String productName, int productQuantity){
        for (Product product : products){
            if (product.getName().equals(productName)) {
                product.setStockQuantity(productQuantity);
            }
            for (Agent agent : agents){
                agent.productNotification(product);
            }
        }
    }
    public void addProduct(String productName, int productQuantity, double price, String description){
        Product product = new Product(productName,productQuantity,price,description);
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }
}
