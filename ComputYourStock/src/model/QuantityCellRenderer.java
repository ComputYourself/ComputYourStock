/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Anadidathorion
 */
public class QuantityCellRenderer extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        int qty = (int) value;
        setText("" + qty);

        if (qty <= 0) {
            setBackground(Color.RED);
        } else if (qty < 8){
            setBackground(Color.ORANGE);
        } else {
            setBackground(Color.GREEN);
        }

        return this;	
    }

}
