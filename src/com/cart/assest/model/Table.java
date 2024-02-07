package com.cart.assest.model;

import com.cart.assest.component.TableCell_Status;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class Table extends JTable {

    public Table() {
        color_row_side_1 = new Color(255, 109, 109);
        color_row_side_2 = new Color(40, 150, 220);
        color_raw_selected = new Color(17, 164, 232);
        color_row_shadow = new Color(160, 160, 160);
        color_scrollbar_background = Color.WHITE;
        color_scrollbar_foreground = new Color(48, 144, 216);
        scrollbar_size = new Dimension(8, 8);
        color_mixer = false;
        setRowHeight(50);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader h = new TableHeader(o + "");
                h.setHorizontalAlignment(JLabel.CENTER);
                return h;
            }
        });
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent ce) {
                createShadow();
            }
        });
    }

    private void createShadow() {
        int width = getWidth();
        int height = rowHeight;
        int space = 12;
        int margin = space / 2;
        imageShadow = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = imageShadow.createGraphics();
        g2.fillRect(0, 0, width - margin, height - margin);
        g2.drawImage(new ShadowRenderer(6, 0.3f, color_row_shadow).createShadow(imageShadow), -4, -4, null);
        g2.fillRect(margin, margin, width - space, height - space);
        g2.setComposite(AlphaComposite.Clear);
        g2.fillRect(margin, margin, width - space, height - space);
        g2.dispose();
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) {
        if (has_status && (i1 == status_column)) {
            TableCell_Status cell = new TableCell_Status(getValueAt(i, i1).toString());
            return cell;
        } else {
            String values = "";
            if (getValueAt(i, i1) != null) {
                values = getValueAt(i, i1).toString();
            }
            TableCell cell = new TableCell(values);
            cell.setHorizontalAlignment(JLabel.CENTER);
            return cell;
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int space = 12;
        int margin = space / 2;
        for (int i = 0; i < getRowCount(); i++) {
            int row = i;
            Rectangle r = getCellRect(row, 0, true);
            if (isRowSelected(i)) {
                g2.setColor(color_raw_selected);
                g2.drawRect(margin, r.getLocation().y + margin, getWidth() - margin * 2, rowHeight - space);
            }
            g2.drawImage(imageShadow, 0, r.getLocation().y, null);
            if (color_mixer) {
                if (i % 2 != 0) {
                    g2.setColor(color_row_side_1);
                } else {
                    g2.setColor(color_row_side_2);
                }
            } else {
                g2.setColor(color_row_side_1);
            }
            g2.fillRect(margin, r.getLocation().y + margin, 3, rowHeight - space);
        }
        g2.dispose();
    }

    public void fixTable(JScrollPane scroll) {
        CustomScrollBar scrlBar = new CustomScrollBar();
        scrlBar.setForeground(color_scrollbar_foreground);
        scrlBar.setBackground(color_scrollbar_background);
        scrlBar.setPreferredSize(scrollbar_size);
        scroll.setVerticalScrollBar(scrlBar);
    }

    public Color getColor_row_side_1() {
        return color_row_side_1;
    }

    public void setColor_row_side_1(Color color_row_side_1) {
        this.color_row_side_1 = color_row_side_1;
    }

    public Color getColor_raw_selected() {
        return color_raw_selected;
    }

    public void setColor_raw_selected(Color color_raw_selected) {
        this.color_raw_selected = color_raw_selected;
    }

    public Color getColor_row_shadow() {
        return color_row_shadow;
    }

    public void setColor_row_shadow(Color color_row_shadow) {
        this.color_row_shadow = color_row_shadow;
    }

    public Color getColor_row_side_2() {
        return color_row_side_2;
    }

    public void setColor_row_side_2(Color color_row_side_2) {
        this.color_row_side_2 = color_row_side_2;
    }

    public boolean isColor_mixer() {
        return color_mixer;
    }

    public void setColor_mixer(boolean color_mixer) {
        this.color_mixer = color_mixer;
    }

    public int getStatus_column() {
        return status_column;
    }

    public void setStatus_column(int status_column) {
        this.status_column = status_column;
    }

    public boolean isHas_status() {
        return has_status;
    }

    public void setHas_status(boolean has_status) {
        this.has_status = has_status;
    }

    public Color getColor_scrollbar_background() {
        return color_scrollbar_background;
    }

    public void setColor_scrollbar_background(Color color_scrollbar_background) {
        this.color_scrollbar_background = color_scrollbar_background;
    }

    public Color getColor_scrollbar_foreground() {
        return color_scrollbar_foreground;
    }

    public void setColor_scrollbar_foreground(Color color_scrollbar_foreground) {
        this.color_scrollbar_foreground = color_scrollbar_foreground;
    }

    public Dimension getScrollbar_size() {
        return scrollbar_size;
    }

    public void setScrollbar_size(Dimension scrollbar_size) {
        this.scrollbar_size = scrollbar_size;
    }

    private Color color_row_side_1;
    private Color color_row_side_2;
    private Color color_raw_selected;
    private Color color_row_shadow;
    private Color color_scrollbar_background;
    private Color color_scrollbar_foreground;
    private Dimension scrollbar_size;
    private boolean color_mixer;
    private BufferedImage imageShadow;
    private int status_column;
    private boolean has_status;
}
