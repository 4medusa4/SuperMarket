package com.cart.assest.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Properties;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;

public class DatePicker extends JPanel {

    public Color getColor_fg() {
        return color_fg;
    }

    public void setColor_fg(Color color_fg) {
        this.color_fg = color_fg;
        datePicker.getJFormattedTextField().setForeground(color_fg);
    }

    public Color getColor_bg() {
        return color_bg;
    }

    public void setColor_bg(Color color_bg) {
        this.color_bg = color_bg;
        datePicker.getJFormattedTextField().setBackground(color_bg);
    }

    public DatePicker() {

        color_bg = Color.WHITE;
        color_fg = Color.DARK_GRAY;
        initialDate = Date.valueOf(LocalDate.now());
        model = new SqlDateModel();
        model.setValue(initialDate);
        Properties p = new Properties();
        p.put("text.day", "Day");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl panel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(panel, new JFormattedTextField.AbstractFormatter() {
            @Override
            public Object stringToValue(String text) throws ParseException {
                return null;
            }

            @Override
            public String valueToString(Object value) throws ParseException {
                if (value != null) {
                    Calendar c = (Calendar) value;
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                    return sf.format(c.getTime());
                }
                return "";
            }
        });
        datePicker.getJFormattedTextField().setBackground(color_bg);
        datePicker.getJFormattedTextField().setForeground(color_fg);
        datePicker.getJFormattedTextField().setBorder(new EmptyBorder(5, 1, 5, 1));

        this.setLayout(new BorderLayout());

        this.add(datePicker, BorderLayout.CENTER);
    }

    public JDatePickerImpl getDatePicker() {
        return datePicker;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
        model.setValue(this.initialDate);
    }
    
    private final JDatePickerImpl datePicker;
    private SqlDateModel model;
    private Date initialDate;
    private Color color_fg;
    private Color color_bg;
}
