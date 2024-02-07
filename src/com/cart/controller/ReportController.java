package com.cart.controller;

import com.cart.model.Database;
import com.cart.model.Report;
import java.io.File;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.view.JasperViewer;

public class ReportController {

    public static void generate_Billing_Invoice(String id) {
        String sql = "SELECT i.*, p.proName, p.proPrice, ip.quantity FROM "
                + "((tbl_invoice i INNER JOIN tbl_invoice_product ip ON i.invId = ip.invNo ) INNER JOIN tbl_product p ON ip.proNo = p.proId) "
                + "WHERE i.invId = '" + id + "'";
        generateReport(new File("src\\com\\cart\\assest\\report\\billing_invoice.jasper").getAbsolutePath(),
                sql,
                null
        );
    }

    public static void generate_Income_Report(Date dateStart, Date dateEnd) {
        String sql = "select invId, invDate, sum(invTotal) as Total from tbl_invoice WHERE invDate BETWEEN '" + dateStart + "' AND '" + dateEnd + "' GROUP BY invDate;";
        generateReport(new File("src\\com\\cart\\assest\\report\\total_income.jasper").getAbsolutePath(),
                sql,
                null
        );
    }

    public static void generate_Stock_Availability_Report() {
        String sql = "SELECT * FROM `tbl_product`;";
        generateReport(new File("src\\com\\cart\\assest\\report\\stock_availability.jrxml").getAbsolutePath(),
                sql,
                null
        );
    }

    private static void generateReport(String path, String sql, Map<String, Object> map) {
        try {
            JasperDesign design = net.sf.jasperreports.engine.xml.JRXmlLoader.load(path);
            JRDesignQuery update = new JRDesignQuery();
            update.setText(sql);
            design.setQuery(update);
            JasperReport newJasperReport = JasperCompileManager.compileReport(design);
            JasperPrint jprint = JasperFillManager.fillReport(newJasperReport, map, Database.getConnection());
            JasperViewer.viewReport(jprint, false);
        } catch (SQLException | JRException | NoClassDefFoundError e) {
            JOptionPane.showMessageDialog(null,
                    "Reporting api has got into some problems.\nError: " + e.getMessage(),
                    "Api error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ReportController() {
    }

    public ReportController(Report report) {
        this.report = report;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    private Report report;
}
