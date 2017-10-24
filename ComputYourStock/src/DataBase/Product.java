
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
public abstract class Product {
    protected String name;
    protected String code;
    
    protected float purchasePrice;
    protected float sellingPrice;
    
    protected ProductType type;
    
    protected int quantity;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Product(String name, String code, float purchasePrice, float sellingPrice, ProductType type, int quantity) {
        this.name = name;
        this.code = code;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.type = type;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
