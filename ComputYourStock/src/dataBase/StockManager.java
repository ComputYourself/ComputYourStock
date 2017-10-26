/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import dataBase.object.Can;
import dataBase.object.Product;
import dataBase.object.Snack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Anadidathorion
 */
public final class StockManager {
    private static Map<String, Product> products;
    
    private StockManager() {
        
    }
    
    public static void init() {
        products = new HashMap<>();
        populate();
        // Find objects in DB
    }
    
    public static int size() {
        return products.size();
    }
    
    public static List<Product> getStock() {
        return new ArrayList<Product>( products.values());
    }
    
    private static void populate() {
        Product tmp = new Can("Coca", "00001", 0.3f, 0.6f, 20);
        products.put(tmp.getCode(), tmp);
        tmp = new Can("Mojito", "00002", 0.3f, 0.6f, 0);
        products.put(tmp.getCode(), tmp);
        tmp = new Can("Sprite", "00004", 0.3f, 0.6f, 4);
        products.put(tmp.getCode(), tmp);
        tmp = new Snack("Twix", "00003", 0.3f, 0.5f, 20);
        products.put(tmp.getCode(), tmp);
        tmp = new Snack("Mars", "00005", 0.3f, 0.5f, 20);
        products.put(tmp.getCode(), tmp);
    }
}
