package com.cart.controller;

import com.cart.assest.model.Table;
import com.cart.model.Database;
import com.cart.model.Invoice;
import com.cart.model.Product;
import com.cart.model.Return;
import com.cart.model.Stock;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StockController {

    private final Stock stock;

    public Stock getStock() {
        return stock;
    }

    public StockController(Stock product) {
        this.stock = product;
    }

//    public boolean saveStock() {
//        boolean flag = true;
//        String sql1 = "SET AUTOCOMMIT = OFF; "
//                + "START TRANSACTION; "
//                + "INSERT INTO tbl_stock (stockId, arrDate, supNo) VALUES (?, ?, ?)";
//        String sql2 = "UPDATE tbl_product SET proExDate = ?, proPrice = ?, proQuantity = ? WHERE proId = ?";
//        String sql3 = "INSERT INTO tbl_product_stock (proNo, stockNo, quantity) VALUES (?, ?, ?)";
//        String sql_rollback = "ROLLBACK";
//        try ( PreparedStatement pst1 = Database.getConnection().prepareStatement(sql1);  
//                Statement stm = Database.getConnection().createStatement()) {
//            pst1.setInt(1, stock.getStockId());
//            pst1.setDate(2, (Date) stock.getArrivalDate());
//            pst1.setInt(3, stock.getSupplierNo());
//            int results = pst1.executeUpdate();
//            if (flag && results > 0) {
//                pst1.close();
//                try ( PreparedStatement pst2 = Database.getConnection().prepareStatement(sql2);  
//                        PreparedStatement pst3 = Database.getConnection().prepareStatement(sql3)) {
//                    List<Product> pList = stock.getProducts();
//                    for (int j = 0; j < pList.size(); j++) {
//                        Product p = pList.get(j);
//                        pst2.setInt(1, p.getProductId());
//                        pst2.setString(2, p.getProductName());
//                        pst2.setDate(3, (Date) p.getProductExDate());
//                        pst2.setDouble(4, p.getProductPrice());
//                        pst2.setInt(5, p.getProductQuantity());
//                        results = pst2.executeUpdate();
//                        if (flag && results > 0) {
//                            pst3.setInt(1, p.getProductId());
//                            pst3.setInt(2, stock.getStockId());
//                            pst3.setInt(3, p.getProductQuantity());
//                            results = pst3.executeUpdate();
//                            if (flag && results > 0) {
//                                flag = true;
//                            } else {
//                                stm.executeQuery(sql_rollback);
//                                stm.close();
//                            }
//                        } else {
//                            stm.executeQuery(sql_rollback);
//                            stm.close();
//                        }
//                    }
//                    pst2.close();
//                    pst3.close();
//                }
//            } else {
//                stm.executeQuery(sql_rollback);
//                stm.close();
//            }
//        } catch (SQLException e) {
//            flag = false;
//            JOptionPane.showMessageDialog(null, "Type: " + e.getSQLState() + "\n Message: " + e.getMessage());
//        }
//        return flag;
//    }
    public boolean saveStock() {
        boolean i = false;
        String sql1 = "INSERT INTO tbl_stock (stockId, arrDate, supNo) VALUES (?, ?, ?)";
        try ( PreparedStatement pst1 = Database.getConnection().prepareStatement(sql1)) {
            pst1.setInt(1, stock.getStockId());
            pst1.setDate(2, (Date) stock.getArrivalDate());
            pst1.setInt(3, stock.getSupplierNo());
            int results = pst1.executeUpdate();
            i = results > 0;
            if (i) {
                String sql2 = "UPDATE tbl_product SET proExDate = ?, proPrice = ?, proQuantity = ? WHERE proId = ?";
                String sql3 = "INSERT INTO tbl_product_stock (proNo, stockNo, quantity) VALUES (?, ?, ?)";
                PreparedStatement pst2 = Database.getConnection().prepareStatement(sql2);
                PreparedStatement pst3 = Database.getConnection().prepareStatement(sql3);

                List<Product> pList = stock.getProducts();
                for (int j = 0; j < pList.size(); j++) {
                    Product p = pList.get(j);
                    pst2.setDate(1, (Date) p.getProductExDate());
                    pst2.setDouble(2, p.getProductPrice());
                    pst2.setInt(3, p.getProductQuantity());
                    pst2.setInt(4, p.getProductId());
                    results = pst2.executeUpdate();
                    i = results > 0;
                    if (i) {
                        pst3.setInt(1, p.getProductId());
                        pst3.setInt(2, stock.getStockId());
                        pst3.setInt(3, p.getProductQuantity());
                        results = pst3.executeUpdate();
                        i = results > 0;
                    } else {
                        String sqlDel = "DELETE FROM tbl_stock WHERE stockId = ?";
                        PreparedStatement pstDel = Database.getConnection().prepareStatement(sqlDel);
                        pstDel.setInt(1, stock.getStockId());
                        pstDel.executeUpdate();
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Type: " + ex.getSQLState() + "\n Message: " + ex.getMessage());
        }
        return i;
    }
    
    public static boolean updateStockOnReturn(Return rtrn) {
        boolean flag = false;
        String sql_getStockQuantity = "SELECT quantity FROM tbl_product_stock WHERE proNo = ? AND stockNo = ?";
        String sql_updateStock = "UPDATE tbl_product_stock SET quantity = ? WHERE proNo = ? AND stockNo = ?";
        try ( PreparedStatement pst_getStockQuantity = Database.getConnection().prepareStatement(sql_getStockQuantity)) {
            pst_getStockQuantity.setInt(1, rtrn.getProductId());
            pst_getStockQuantity.setInt(2, rtrn.getStockId());
            ResultSet r = pst_getStockQuantity.executeQuery();
            int oldQuantity = -1;
            while (r.next()) {
                oldQuantity = r.getInt(1);
            }
            if (oldQuantity >= 0) {
                int newQuantity = oldQuantity - rtrn.getReturnQuantity();
                try ( PreparedStatement pst_updateStock = Database.getConnection().prepareStatement(sql_updateStock)) {
                    pst_updateStock.setInt(1, newQuantity);
                    pst_updateStock.setInt(2, rtrn.getProductId());
                    pst_updateStock.setInt(3, rtrn.getStockId());
                    if (pst_updateStock.executeUpdate() > 0) {
                        flag = true;
                    }
                    pst_updateStock.close();
                }
            }
            pst_getStockQuantity.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return flag;
    }
    
    public static boolean updatetockOnSales(Invoice invoice) {
        boolean flag = false;
        String sql_getProductQuantity = "SELECT proQuantity FROM tbl_product WHERE proId = ?";
        String sql_updateProduct = "UPDATE tbl_product SET proQuantity = ? WHERE proId = ?";
        try ( PreparedStatement pst_getProductQuantity = Database.getConnection().prepareStatement(sql_getProductQuantity);  PreparedStatement pst_updateProduct = Database.getConnection().prepareStatement(sql_updateProduct)) {
            ArrayList<Product> listOfProducts = (ArrayList<Product>) invoice.getProducts();
            for (int i = 0; i < listOfProducts.size(); i++) {
                Product p = listOfProducts.get(i);
                pst_getProductQuantity.setInt(1, p.getProductId());
                ResultSet r = pst_getProductQuantity.executeQuery();
                int oldQuantity = -1;
                while (r.next()) {
                    oldQuantity = r.getInt(1);
                }
                if (oldQuantity >= 0) {
                    int newQuantity = oldQuantity - p.getProductQuantity();
                    pst_updateProduct.setInt(1, newQuantity);
                    pst_updateProduct.setInt(2, p.getProductId());
                    if (pst_updateProduct.executeUpdate() > 0) {
                        flag = true;
                    }
                }
            }
            pst_updateProduct.close();
            pst_getProductQuantity.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return flag;
    }

    public static Stock getStock(int stockId) {
        Stock s = null;
        String sql1 = "SELECT stockId, arrDate, supNo FROM tbl_stock WHERE stockId = ?";
        String sql2 = "SELECT proNo, stockNo, quantity FROM tbl_product_stock WHERE stockNo = ?";
        String sql3 = "SELECT proId, proName, proType, proQuantity, proPrice, proExDate, proDescription, disRate, proDeleted FROM tbl_product WHERE proId= ?";
        
        try ( PreparedStatement pst_selectStock = Database.getConnection().prepareStatement(sql1);  
                PreparedStatement pst_selectStockProduct = Database.getConnection().prepareStatement(sql2);  
                PreparedStatement pst_selectProduct = Database.getConnection().prepareStatement(sql3)) {
            pst_selectStock.setInt(1, stockId);
            pst_selectStockProduct.setInt(1, stockId);
            
            ResultSet r1 = pst_selectStock.executeQuery();
            
            s = new Stock();
            
            while (r1.next()) {
                s.setStockId(r1.getInt(1));
                s.setArrivalDate(r1.getDate(2));
                s.setSupplierNo(r1.getInt(3));
            }
            
            ResultSet r2 = pst_selectStockProduct.executeQuery();
            List<Product> productList = new ArrayList<>();
            
            while (r2.next()) {
                Product p = new Product();
                p.setProductId(r2.getInt(1));
                p.setProductQuantity(r2.getInt(3));
                productList.add(p);
            }
            
            s.setProducts(productList);
            
            for (int i = 0; i < productList.size(); i++) {
                Product item = productList.get(i);
                pst_selectProduct.setInt(1, item.getProductId());
                ResultSet r3 = pst_selectProduct.executeQuery();
                while(r3.next()){
                    item.setProductId(r3.getInt(1));
                    item.setProductName(r3.getString(2));
                    item.setProductType(r3.getString(3));
                    item.setProductPrice(r3.getDouble(5));
                    item.setProductExDate(r3.getDate(6));
                    item.setProDescription(r3.getString(7));
                    item.setDiscountRate(r3.getDouble(8));
                    item.setProDeleted(r3.getInt(9) > 0);
                }
            }
            pst_selectStock.close();
            pst_selectStockProduct.close();
            pst_selectProduct.close();

        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"\n"+ex.getSQLState());
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"\n"+ex.getSQLState());
            ex.printStackTrace();
        }
        return s;
    }

    private static ResultSet getStockDetails(String txt) throws SQLException {
        Statement stmt = Database.getConnection().createStatement();
        String sql = "";
        if (txt.isEmpty()) {
            sql = "SELECT stockId, arrDate, supNo FROM tbl_stock";
        } else {
            sql = "SELECT stockId, arrDate, supNo FROM tbl_stock "
                    + "WHERE (stockId LIKE '%" + txt + "%' "
                    + "or arrDate LIKE '%" + txt + "%' "
                    + "or supNo LIKE '%" + txt + "%')";
        }
        return stmt.executeQuery(sql);
    }

    public static void getStock(Table table, String txt) {
        table.setHas_status(false);
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        dt.setNumRows(0);

        try ( ResultSet r = StockController.getStockDetails(txt)) {
            if (r.next()) {
                do {
                    dt.addRow(new Object[]{r.getInt(1), r.getDate(2), r.getInt(3)});
                } while (r.next());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //get stock id to combo box
    public static void loadStocks(JComponent obj) {
        if (obj instanceof JComboBox cmb) {

            try ( Statement stmt = Database.getConnection().createStatement()) {
                String sql = "SELECT stockId FROM tbl_stock";
                ResultSet result = stmt.executeQuery(sql);
                cmb.removeAllItems();
                cmb.addItem("Select Stock Id");
                while (result.next()) {
                    cmb.addItem(result.getInt(1) + "");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

}