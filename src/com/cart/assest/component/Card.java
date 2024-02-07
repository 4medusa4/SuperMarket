package com.cart.assest.component;

import com.cart.assest.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Card extends javax.swing.JPanel {

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
    }

    public void setData(Model_Card data) {
        label_icon.setIcon(data.getIcon());
        label_title.setText(data.getTitle());
        label_value.setText(data.getValues());
        label_description.setText(data.getDescription());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_icon = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();
        label_value = new javax.swing.JLabel();
        label_description = new javax.swing.JLabel();

        label_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/checkout.png"))); // NOI18N

        label_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_title.setForeground(new java.awt.Color(204, 204, 204));
        label_title.setText("Title");

        label_value.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_value.setForeground(new java.awt.Color(255, 255, 255));
        label_value.setText("Value");

        label_description.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_description.setForeground(new java.awt.Color(204, 204, 204));
        label_description.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_description)
                    .addComponent(label_value)
                    .addComponent(label_title)
                    .addComponent(label_icon))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_title)
                .addGap(18, 18, 18)
                .addComponent(label_value)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(label_description)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents
 protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify                     

    // End of variables declaration                   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_description;
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_value;
    // End of variables declaration//GEN-END:variables
}
