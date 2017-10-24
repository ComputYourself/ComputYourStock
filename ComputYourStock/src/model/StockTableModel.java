/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DataBase.Can;
import DataBase.Product;
import DataBase.Snack;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anadidathorion
 */
public class StockTableModel extends AbstractTableModel{
    
    private List<Product> stock;
    
    private final String [] header = {"Produit", "Code", "Type", "Prix", "Quantité"};

    public StockTableModel() {
        super();
        
        stock = new ArrayList<>();
        
        populate();
    }
    
    @Override
    public int getRowCount() {
        return stock.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }
    
    public String getColumnName(int columnIndex) {
        return header[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return stock.get(rowIndex).getName();
            case 1 :
                return stock.get(rowIndex).getCode();
            case 2 :
                return stock.get(rowIndex).getType();
            case 3 :
                return stock.get(rowIndex).getSellingPrice();
            case 4 :
                return stock.get(rowIndex).getQuantity();
            default :
                return null;
        }    
    }
    
    private void populate() {
        stock.add(new Can("Coca", "00001", 0.3f, 0.6f, 20));
        stock.add(new Can("Mojito", "00002", 0.3f, 0.6f, 0));
        stock.add(new Can("Sprite", "00003", 0.3f, 0.6f, 4));
        
        stock.add(new Snack("Twix", "00004", 0.3f, 0.5f, 20));
        stock.add(new Snack("Mars", "00005", 0.3f, 0.5f, 20));


    }
    
    public List<Product> getStock() {
        return stock;
    }
}
