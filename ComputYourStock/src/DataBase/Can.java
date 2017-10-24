/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author Anadidathorion
 */
public class Can extends Product {
    
    public Can(String name, String code) {
        super(name, code);
    }
    
    public Can(String name, String code, float purchasePrice, float sellingPrice, int quantity) {
        super(name, code, purchasePrice, sellingPrice, ProductType.CAN, quantity);
    }

}
