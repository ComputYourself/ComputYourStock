/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anadidathorion
 */
public class Purchase {
    private float amount;
    private Map<Product, Integer> products;
    private Date date;

    public Purchase() {
        products = new HashMap<>();
    }
    
    public void addProduct(Product product, int number) {
        products.put(product, number);
        amount += product.getSellingPrice();
    }
    
    public void validate() {
        date = Date.from(Instant.now());
    }    

    public float getAmount() {
        return amount;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Date getDate() {
        return date;
    }
    
    
}
