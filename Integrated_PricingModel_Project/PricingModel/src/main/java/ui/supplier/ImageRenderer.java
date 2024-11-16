/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.supplier;

import javax.swing.table.TableCellRenderer;

/**
 * @author Prapti Sanghavi
 * Due Date - 13th October 2024
 */
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.ImageIcon;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        if (value != null && value instanceof ImageIcon) {
            label.setIcon((ImageIcon) value);
        }
        return label;
    }
}
