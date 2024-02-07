
package com.cart.assest.model;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class GradientPanel extends JPanel{

    public GradientPanel() {
        c1 = Color.PINK;
        c2 = Color.CYAN;
        setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, c1, getWidth(), getHeight(), c2);
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.setColor(new Color(255, 255, 255, 0));
        super.paintComponent(g);
    }

    public Color getC1() {
        return c1;
    }

    public void setC1(Color c1) {
        this.c1 = c1;
    }

    public Color getC2() {
        return c2;
    }

    public void setC2(Color c2) {
        this.c2 = c2;
    }
    
    
    
    private Color c1;
    private Color c2; 
}
