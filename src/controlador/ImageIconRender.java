
//Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package controlador;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import javax.swing.JLabel;

import javax.swing.table.TableCellRenderer;

import javax.swing.ImageIcon;

import javax.swing.JTable;


/**
 *
 * @author usuar
 */
public class ImageIconRender extends JLabel implements TableCellRenderer {
        ImageIconRender() {
            setOpaque(true);
            setHorizontalAlignment(JLabel.CENTER);
            setVerticalAlignment(JLabel.CENTER);
        }

@Override
public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    if (value instanceof ImageIcon) {
        setIcon((ImageIcon) value);
        setText(""); 
    } else {
        setText(value.toString());
        setIcon(null);
    }
    return this;
}
}
  

