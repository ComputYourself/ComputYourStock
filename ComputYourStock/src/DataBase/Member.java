/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anadidathorion   
 */
public class Member {
    protected String firstname;
    protected String surename;
    protected String pseudo;
    protected String mail;
    
    protected String phoneNumber;
    protected String address;
    
    protected float cash;
    protected float authorizedDebt;
     
    protected List<Purchase> purchases;

    public Member(String firstname, String surename, String pseudo, String mail, String phoneNumber, String address) {
        this.firstname = firstname;
        this.surename = surename;
        this.pseudo = pseudo;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.address = address;
        
        purchases = new ArrayList<>();
    }    
    
    public void addPurchase(Purchase purchase) throws Exception{        
        if (cash + authorizedDebt - purchase.getAmount() < 0) {
            throw new Exception("Not enough cash, purchase cancelled");
        }
        
        cash -= purchase.getAmount();
        purchase.validate();
        purchases.add(purchase);        
    }
    
    public void addCash (int amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Adding cash must be positive");
        }
        
        cash += amount;
    }
    
    public void increaseDebt (int amount) throws Exception{
        if (amount < 0) {
            throw new Exception("Increasing debt must be positive");
        }
        
        authorizedDebt += amount;
    }
    
    public void decreaseDebt (int amount) throws Exception{
        if (amount < 0) {
            throw new Exception("Decreasing debt must be positive");
        }
        
        if (authorizedDebt - amount < 0) {
            throw new Exception("Not enough debt to decrease");
        }               
        
        authorizedDebt -= amount;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public float getAuthorizedDebt() {
        return authorizedDebt;
    }

    public void setAuthorizedDebt(float authorizedDebt) {
        this.authorizedDebt = authorizedDebt;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }
    
    
}
