
package com.cart.assest.component;

import com.cart.assest.model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {
    private boolean  selected;


    

    public MenuItem(Model_Menu data) {
        
        initComponents();
        setOpaque(false);
        if(data.getType() == Model_Menu.Menutype.MENU) {
            label_icon.setIcon(data.toIcon());
            label_name.setText(data.getName());
        }
        else if(data.getType() == Model_Menu.Menutype.TITLE) {
            label_icon.setText(data.getName());
            label_icon.setFont(new Font("sansserif", 1, 12));
            label_name.setVisible(false);
        }
        else {
            label_name.setText(" ");
        }
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
            repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_icon = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();

        label_name.setText("MenuName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_name)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_name)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(g);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel label_name;
    // End of variables declaration//GEN-END:variables
}
