package com.cart.assest.model;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class CustomButton extends JButton {

    private Color color_temp;

    public CustomButton() {
        cornerRadious = 5;
        color_top = new Color(0, 153, 255);
        color_bottom = color_top.darker();
        color_mousePressed = color_top.brighter().brighter();
        color_mouseOver = color_top.brighter();
        color_rippleEffect = color_top.brighter();
        setBackground(color_top);
        rippleEffect = false;
        gradientEffect = false;
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 0, 5, 0));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (rippleEffect) {
                    targetSize = Math.max(getWidth(), getHeight()) * 2;
                    animatSize = 0;
                    pressedPoint = me.getPoint();
                    setAlpha(0.5f);
                    if (animator.isRunning()) {
                        animator.stop();
                    }
                    animator.start();
                } else {
                    if (!gradientEffect && !rippleEffect) {
                        boolean avg = ((color_mousePressed.getRed()
                                + color_mousePressed.getGreen()
                                + color_mousePressed.getBlue()) / 3) < 100;
                        if(!avg)
                            setForeground(Color.WHITE);
                        setBackground(color_mousePressed);
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (!gradientEffect) {
                    color_temp = getBackground();
                    setBackground(color_mouseOver);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!gradientEffect) {
                    setBackground(color_temp);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (!gradientEffect && !rippleEffect) {
                    boolean avg = ((color_mousePressed.getRed()
                                + color_mousePressed.getGreen()
                                + color_mousePressed.getBlue()) / 3) < 50;
                        if(!avg)
                            setForeground(Color.WHITE);
                        setBackground(color_mouseOver);
                }
            }
        });

        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (fraction > 0.5f) {
                    setAlpha(1 - fraction);
                }
                animatSize = fraction * targetSize;
                repaint();
            }
        };
        animator = new Animator(400, target);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        if (gradientEffect) {
            GradientPaint g = new GradientPaint(0, 0, color_top, 0, getHeight(), color_bottom);
            g2.setPaint(g);
        }
        g2.fillRoundRect(0, 0, width, height, cornerRadious, cornerRadious);
        if (rippleEffect && pressedPoint != null) {
            g2.setColor(color_rippleEffect);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
            g2.fillOval((int) (pressedPoint.x - animatSize / 2), (int) (pressedPoint.y - animatSize / 2), (int) animatSize, (int) animatSize);
        }
        g2.dispose();
        grphcs.drawImage(img, 0, 0, null);
        super.paintComponent(grphcs);
    }

    public boolean isGradientEffect() {
        return gradientEffect;
    }

    public void setGradientEffect(boolean gradientEffect) {
        this.gradientEffect = gradientEffect;
    }

    private boolean rippleEffect;
    private boolean gradientEffect;
    private Color color_mouseOver;
    private Color color_mousePressed;
    private Animator animator;
    private int targetSize;
    private float animatSize;
    private Point pressedPoint;
    private float alpha;
    private Color color_rippleEffect;
    private Color color_top;
    private Color color_bottom;
    private int cornerRadious;

    public boolean isRippleEffect() {
        return rippleEffect;
    }

    public void setRippleEffect(boolean rippleEffect) {
        this.rippleEffect = rippleEffect;
    }

    public Color getColor_mouseOver() {
        return color_mouseOver;
    }

    public void setColor_mouseOver(Color color_mouseOver) {
        this.color_mouseOver = color_mouseOver;
    }

    public Color getColor_mousePressed() {
        return color_mousePressed;
    }

    public void setColor_mousePressed(Color color_mousePressed) {
        this.color_mousePressed = color_mousePressed;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public int getCornerRadious() {
        return cornerRadious;
    }

    public void setCornerRadious(int cornerRadious) {
        this.cornerRadious = cornerRadious;
    }

    public Color getColor_rippleEffect() {
        return color_rippleEffect;
    }

    public void setColor_rippleEffect(Color color_rippleEffect) {
        this.color_rippleEffect = color_rippleEffect;
    }

    public Color getColor_top() {
        return color_top;
    }

    public void setColor_top(Color color_top) {
        this.color_top = color_top;
    }

    public Color getColor_bottom() {
        return color_bottom;
    }

    public void setColor_bottom(Color color_bottom) {
        this.color_bottom = color_bottom;
    }
}
