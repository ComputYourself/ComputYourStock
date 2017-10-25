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
import java.util.List;

/**
 *
 * @author Anadidathorion
 */
public final class StockManager {
    private static List<Product> products;
    
    private StockManager() {
        
    }
    
    public static void init() {
        products = new ArrayList<>();
        populate();
        // Find objects in DB
    }
    
    public static int size() {
        return products.size();
    }
    
    public static List<Product> getStock() {
        return products;
    }
    
    private static void populate() {
        products.add(new Can("Coca", "00001", 0.3f, 0.6f, 20));
        products.add(new Can("Mojito", "00002", 0.3f, 0.6f, 0));
        products.add(new Can("Sprite", "00003", 0.3f, 0.6f, 4));
        
        products.add(new Snack("Twix", "00004", 0.3f, 0.5f, 20));
        products.add(new Snack("Mars", "00005", 0.3f, 0.5f, 20));
    }
}
