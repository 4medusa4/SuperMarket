package com.cart.view;

import com.cart.assest.model.CustomScrollBar;
import com.cart.assest.utilities.Service;
import com.cart.controller.EmployeeController;
import com.cart.controller.InvoiceController;
import com.cart.controller.ProductController;
import com.cart.controller.ReasonController;
import com.cart.controller.ReportController;
import com.cart.controller.ReturnController;
import com.cart.controller.StockController;
import com.cart.controller.UserController;
import com.cart.controller.SupplierController;
import com.cart.controller.Validator;
import com.cart.model.Employee;
import com.cart.model.Invoice;
import com.cart.model.Product;
import com.cart.model.Reason;
import com.cart.model.Return;
import com.cart.model.Stock;
import com.cart.model.Supplier;
import com.cart.model.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.Timestamp;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import javax.swing.Icon;
import org.jdatepicker.impl.SqlDateModel;

public class Dashboard extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;

    public Dashboard() {
        initComponents();

        DefaultColor = new Color(51, 51, 51);
        ClickedColor = new Color(35, 35, 35);

        home.setBackground(DefaultColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);

        load_home.setVisible(true);
        load_orders.setVisible(false);
        load_productList.setVisible(false);
        load_stock.setVisible(false);
        load_reports.setVisible(false);
        load_addSupplier.setVisible(false);
        load_addUser.setVisible(false);
        load_logout.setVisible(false);

        setExtendedState(Frame.MAXIMIZED_BOTH);

        ImageIcon icon = new ImageIcon("src\\com\\cart\\assest\\icon\\cart_colour.png");
        setIconImage(icon.getImage());

        CustomScrollBar scrlBarVertical = new CustomScrollBar();
        scrlBarVertical.setForeground(new Color(48, 144, 216));
        scrlBarVertical.setBackground(Color.white);
        scrlBarVertical.setPreferredSize(new Dimension(8, 8));
        scrollPanel.setVerticalScrollBar(scrlBarVertical);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_userType = new javax.swing.ButtonGroup();
        menuListItems = new javax.swing.JPanel();
        panel_menuHead = new javax.swing.JPanel();
        label_head = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        label_home = new javax.swing.JLabel();
        orders = new javax.swing.JPanel();
        label_orders = new javax.swing.JLabel();
        productList = new javax.swing.JPanel();
        label_productList = new javax.swing.JLabel();
        stocks = new javax.swing.JPanel();
        label_stock = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        label_reports = new javax.swing.JLabel();
        addSupplier = new javax.swing.JPanel();
        label_barcodes = new javax.swing.JLabel();
        addUser = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        label_logout = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        panel_head = new javax.swing.JPanel();
        card1 = new com.cart.assest.component.Card();
        card2 = new com.cart.assest.component.Card();
        card3 = new com.cart.assest.component.Card();
        card4 = new com.cart.assest.component.Card();
        scrollPanel = new javax.swing.JScrollPane();
        load_panel = new javax.swing.JPanel();
        load_home = new com.cart.assest.model.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_orderHistory = new com.cart.assest.model.Table();
        load_orders = new com.cart.assest.model.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panel_pos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        err_pos = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        txt_invoiceNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_orderProductId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_orderProductName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_orderProductPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_orderProductQuantity = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txt_orderProductDisRate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_orderProductDisAmount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_orderProductTotal = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        label_scan = new javax.swing.JLabel();
        lbl_success = new javax.swing.JLabel();
        btn_scanBarcode = new com.cart.assest.model.CustomButton();
        Buttons = new javax.swing.JPanel();
        btn_orderAdd = new com.cart.assest.model.CustomButton();
        btn_orderDelete = new com.cart.assest.model.CustomButton();
        txt_paidAmount = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btn_pay = new com.cart.assest.model.CustomButton();
        panel_bill = new javax.swing.JPanel();
        PaymentDetails = new javax.swing.JPanel();
        Total = new com.cart.assest.model.PanelBorder();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lbl_totAmount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PayedAmount = new com.cart.assest.model.PanelBorder();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        lbl_paidAmount = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Balance = new com.cart.assest.model.PanelBorder();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lbl_balance = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_order = new com.cart.assest.model.Table();
        jLabel14 = new javax.swing.JLabel();
        load_productList = new com.cart.assest.model.PanelBorder();
        jLabel9 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        viewProduct = new javax.swing.JPanel();
        label_veiwProducts1 = new javax.swing.JLabel();
        newProduct = new javax.swing.JPanel();
        label_newProduct = new javax.swing.JLabel();
        manageProduct = new javax.swing.JPanel();
        label_veiwProducts = new javax.swing.JLabel();
        load_productDetails = new javax.swing.JPanel();
        panel_viewProducts = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        txt_productSearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_productDetails = new com.cart.assest.model.Table();
        panel_newProduct = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        btn_productCancel = new com.cart.assest.model.CustomButton();
        btn_productAdd = new com.cart.assest.model.CustomButton();
        label_scan1 = new javax.swing.JLabel();
        lbl_successAddProduct = new javax.swing.JLabel();
        btn_scanBarcodeAddProduct = new com.cart.assest.model.CustomButton();
        jPanel39 = new javax.swing.JPanel();
        err_newProduct = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txt_productId = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txt_productName = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        cmb_productType = new javax.swing.JComboBox<>();
        jLabel87 = new javax.swing.JLabel();
        txt_proDisRate = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txt_productDescription = new javax.swing.JTextField();
        panel_manageProduccts = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        err_productManage = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        cmb_productIdProduct = new javax.swing.JComboBox<>();
        jLabel82 = new javax.swing.JLabel();
        txt_productNameUpdate = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        cmb_productTypeUpdate = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        txt_proDisRateUpdate = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txt_productDescriptionUpdate = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        customButton8 = new com.cart.assest.model.CustomButton();
        btn_updateProduct = new com.cart.assest.model.CustomButton();
        btn_deleteProduct = new com.cart.assest.model.CustomButton();
        load_stock = new com.cart.assest.model.PanelBorder();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        viewStock = new javax.swing.JPanel();
        label_viewSt = new javax.swing.JLabel();
        newStock = new javax.swing.JPanel();
        label_newSt = new javax.swing.JLabel();
        returnStock = new javax.swing.JPanel();
        label_returnSt = new javax.swing.JLabel();
        load_stockEntry = new javax.swing.JPanel();
        panel_viewStock = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_stockDetails = new com.cart.assest.model.Table();
        jPanel49 = new javax.swing.JPanel();
        txt_stockSearch = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        panel_newStock = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        err_newStock = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_stockId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        date_stockArrival = new com.cart.assest.model.DatePicker();
        jLabel28 = new javax.swing.JLabel();
        cmb_supplierName = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        cmb_productIdStock = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txt_productNameStock = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        date_productExDate = new com.cart.assest.model.DatePicker();
        jLabel31 = new javax.swing.JLabel();
        txt_productPriceStock = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_productQuantityStock = new javax.swing.JSpinner();
        jPanel14 = new javax.swing.JPanel();
        btn_addProductToStock = new com.cart.assest.model.CustomButton();
        btn_scanBarcodeStock = new com.cart.assest.model.CustomButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_stockProduct = new com.cart.assest.model.Table();
        jPanel18 = new javax.swing.JPanel();
        btn_stockSave = new com.cart.assest.model.CustomButton();
        btn_stockDelete = new com.cart.assest.model.CustomButton();
        btn_cancelProductToStock = new com.cart.assest.model.CustomButton();
        panel_returnStock = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        err_returnStock = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txt_productNameReturn = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txt_supplierNameReturn = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        date_productExDateReturn = new com.cart.assest.model.DatePicker();
        jLabel89 = new javax.swing.JLabel();
        txt_productPriceReturn = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        cmb_producctReturnReason = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        txt_producctCurrentQuantityReturn = new javax.swing.JSpinner();
        jLabel69 = new javax.swing.JLabel();
        txt_productReturnQuantity = new javax.swing.JSpinner();
        jPanel22 = new javax.swing.JPanel();
        btn_cancelReturn = new com.cart.assest.model.CustomButton();
        btn_return = new com.cart.assest.model.CustomButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        cmb_stockIdStockReturn = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        cmb_productIdStockReturm = new javax.swing.JComboBox<>();
        load_reports = new com.cart.assest.model.PanelBorder();
        jPanel30 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        date_reportStart = new com.cart.assest.model.DatePicker();
        jLabel56 = new javax.swing.JLabel();
        date_reportEnd = new com.cart.assest.model.DatePicker();
        btn_searchReport = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        panelBorder3 = new com.cart.assest.model.PanelBorder();
        btn_incomeReport = new javax.swing.JLabel();
        panelBorder4 = new com.cart.assest.model.PanelBorder();
        btn_salesReport = new javax.swing.JLabel();
        load_addSupplier = new com.cart.assest.model.PanelBorder();
        jLabel73 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        newSupplier = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        manageSupplier = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        load_supplier = new javax.swing.JPanel();
        panel_newSupplier = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        err_newSupplier = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txt_supllierTPAdd = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txt_supplierEmailAdd = new javax.swing.JTextField();
        btn_saveSupllier = new com.cart.assest.model.CustomButton();
        btn_cancelSupplier = new com.cart.assest.model.CustomButton();
        jLabel85 = new javax.swing.JLabel();
        txt_locationAdd = new javax.swing.JTextField();
        txt_supllierNameAdd = new javax.swing.JTextField();
        panel_manageSupplier = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_supplierData = new com.cart.assest.model.Table();
        jPanel46 = new javax.swing.JPanel();
        btn_deleteSupplier = new com.cart.assest.model.CustomButton();
        jPanel47 = new javax.swing.JPanel();
        txt_supplierSearch = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        load_addUser = new com.cart.assest.model.PanelBorder();
        jLabel62 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        newUser = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        manageUser = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        load_user = new javax.swing.JPanel();
        panel_newUser = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        err_newUser = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txt_empName = new javax.swing.JTextField();
        txt_userPass = new javax.swing.JPasswordField();
        txt_userConPass = new javax.swing.JPasswordField();
        rbtn_admin = new javax.swing.JRadioButton();
        rbtn_normal = new javax.swing.JRadioButton();
        cmb_empId = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        btn_saveUser = new com.cart.assest.model.CustomButton();
        btn_cancelUser = new com.cart.assest.model.CustomButton();
        btn_show = new javax.swing.JButton();
        panel_manageUser = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_userData = new com.cart.assest.model.Table();
        jPanel34 = new javax.swing.JPanel();
        btn_userDelete = new com.cart.assest.model.CustomButton();
        jPanel48 = new javax.swing.JPanel();
        txt_userSearch = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        load_logout = new com.cart.assest.model.PanelBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermarket");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setIconImages(null);
        setType(java.awt.Window.Type.POPUP);

        menuListItems.setBackground(new java.awt.Color(51, 51, 51));
        menuListItems.setForeground(new java.awt.Color(51, 51, 51));
        menuListItems.setPreferredSize(new java.awt.Dimension(275, 482));

        panel_menuHead.setOpaque(false);

        label_head.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_head.setForeground(new java.awt.Color(204, 204, 204));
        label_head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/cart.png"))); // NOI18N
        label_head.setText("Supermarket");

        javax.swing.GroupLayout panel_menuHeadLayout = new javax.swing.GroupLayout(panel_menuHead);
        panel_menuHead.setLayout(panel_menuHeadLayout);
        panel_menuHeadLayout.setHorizontalGroup(
            panel_menuHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_menuHeadLayout.setVerticalGroup(
            panel_menuHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_head, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
        });

        label_home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_home.setForeground(new java.awt.Color(204, 204, 204));
        label_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/home.png"))); // NOI18N
        label_home.setText("Home");
        label_home.setIconTextGap(30);

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_home, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_home, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ordersMousePressed(evt);
            }
        });

        label_orders.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_orders.setForeground(new java.awt.Color(204, 204, 204));
        label_orders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/checkout.png"))); // NOI18N
        label_orders.setText("Sales");
        label_orders.setIconTextGap(30);

        javax.swing.GroupLayout ordersLayout = new javax.swing.GroupLayout(orders);
        orders.setLayout(ordersLayout);
        ordersLayout.setHorizontalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ordersLayout.setVerticalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_orders, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        productList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productListMousePressed(evt);
            }
        });

        label_productList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_productList.setForeground(new java.awt.Color(204, 204, 204));
        label_productList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/productList.png"))); // NOI18N
        label_productList.setText("Product List");
        label_productList.setIconTextGap(30);

        javax.swing.GroupLayout productListLayout = new javax.swing.GroupLayout(productList);
        productList.setLayout(productListLayout);
        productListLayout.setHorizontalGroup(
            productListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productListLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_productList, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productListLayout.setVerticalGroup(
            productListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_productList, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        stocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocksMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stocksMousePressed(evt);
            }
        });

        label_stock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_stock.setForeground(new java.awt.Color(204, 204, 204));
        label_stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/stock.png"))); // NOI18N
        label_stock.setText("Stock");
        label_stock.setIconTextGap(30);

        javax.swing.GroupLayout stocksLayout = new javax.swing.GroupLayout(stocks);
        stocks.setLayout(stocksLayout);
        stocksLayout.setHorizontalGroup(
            stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stocksLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stocksLayout.setVerticalGroup(
            stocksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportsMousePressed(evt);
            }
        });

        label_reports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_reports.setForeground(new java.awt.Color(204, 204, 204));
        label_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/report.png"))); // NOI18N
        label_reports.setText("Reports");
        label_reports.setIconTextGap(30);

        javax.swing.GroupLayout reportsLayout = new javax.swing.GroupLayout(reports);
        reports.setLayout(reportsLayout);
        reportsLayout.setHorizontalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportsLayout.setVerticalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_reports, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        addSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSupplierMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addSupplierMousePressed(evt);
            }
        });

        label_barcodes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_barcodes.setForeground(new java.awt.Color(204, 204, 204));
        label_barcodes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/barcode.png"))); // NOI18N
        label_barcodes.setText("Manage Supplier");
        label_barcodes.setIconTextGap(30);

        javax.swing.GroupLayout addSupplierLayout = new javax.swing.GroupLayout(addSupplier);
        addSupplier.setLayout(addSupplierLayout);
        addSupplierLayout.setHorizontalGroup(
            addSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSupplierLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_barcodes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addSupplierLayout.setVerticalGroup(
            addSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_barcodes, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addUserMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/addUser.png"))); // NOI18N
        jLabel8.setText("Manage User");
        jLabel8.setIconTextGap(30);

        javax.swing.GroupLayout addUserLayout = new javax.swing.GroupLayout(addUser);
        addUser.setLayout(addUserLayout);
        addUserLayout.setHorizontalGroup(
            addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addUserLayout.setVerticalGroup(
            addUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        label_logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_logout.setForeground(new java.awt.Color(204, 204, 204));
        label_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/logout.png"))); // NOI18N
        label_logout.setText("Logout");
        label_logout.setIconTextGap(30);

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuListItemsLayout = new javax.swing.GroupLayout(menuListItems);
        menuListItems.setLayout(menuListItemsLayout);
        menuListItemsLayout.setHorizontalGroup(
            menuListItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menuHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuListItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuListItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reports, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stocks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuListItemsLayout.setVerticalGroup(
            menuListItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuListItemsLayout.createSequentialGroup()
                .addComponent(panel_menuHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(productList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(stocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(menuListItems, java.awt.BorderLayout.WEST);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setLayout(new java.awt.BorderLayout());

        panel_head.setBackground(new java.awt.Color(51, 51, 51));
        panel_head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panel_head.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 10));

        card1.setColor1(new java.awt.Color(255, 128, 134));
        card1.setColor2(new java.awt.Color(255, 51, 102));
        panel_head.add(card1);

        card2.setColor1(new java.awt.Color(255, 128, 134));
        card2.setColor2(new java.awt.Color(255, 51, 102));
        panel_head.add(card2);

        card3.setColor1(new java.awt.Color(255, 128, 134));
        card3.setColor2(new java.awt.Color(255, 51, 102));
        panel_head.add(card3);

        card4.setColor1(new java.awt.Color(255, 128, 134));
        card4.setColor2(new java.awt.Color(255, 51, 102));
        panel_head.add(card4);

        jPanel50.add(panel_head, java.awt.BorderLayout.NORTH);

        scrollPanel.setBackground(new java.awt.Color(102, 102, 102));
        scrollPanel.setBorder(null);

        load_panel.setBackground(new java.awt.Color(102, 102, 102));
        load_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        load_panel.setForeground(new java.awt.Color(51, 51, 51));
        load_panel.setPreferredSize(new java.awt.Dimension(1600, 600));
        load_panel.setLayout(new javax.swing.OverlayLayout(load_panel));

        load_home.setBackground(new java.awt.Color(51, 51, 51));
        load_home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 5));
        load_home.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Today's Sales");
        jLabel1.setPreferredSize(new java.awt.Dimension(172, 60));
        load_home.add(jLabel1, java.awt.BorderLayout.NORTH);

        tbl_orderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_orderHistory.setColor_mixer(true);
        tbl_orderHistory.setColor_row_side_1(new java.awt.Color(204, 153, 0));
        tbl_orderHistory.setColor_row_side_2(new java.awt.Color(204, 51, 0));
        jScrollPane1.setViewportView(tbl_orderHistory);

        load_home.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        load_panel.add(load_home);

        load_orders.setBackground(new java.awt.Color(51, 51, 51));
        load_orders.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Point Of Sale");
        jLabel2.setPreferredSize(new java.awt.Dimension(148, 60));
        load_orders.add(jLabel2, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        panel_pos.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(725, 100));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.GridLayout(0, 2, 0, 10));

        err_pos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        err_pos.setForeground(new java.awt.Color(252, 83, 83));
        err_pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_pos.setText("Error!");
        err_pos.setIconTextGap(10);
        jPanel4.add(err_pos);

        jPanel51.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel51);

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(204, 204, 204));
        jLabel88.setText("Invoice No");
        jPanel4.add(jLabel88);

        txt_invoiceNo.setEditable(false);
        txt_invoiceNo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_invoiceNo.setFocusable(false);
        txt_invoiceNo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txt_invoiceNoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txt_invoiceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_invoiceNoActionPerformed(evt);
            }
        });
        txt_invoiceNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_invoiceNoKeyReleased(evt);
            }
        });
        jPanel4.add(txt_invoiceNo);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Product Id");
        jPanel4.add(jLabel3);

        txt_orderProductId.setEditable(false);
        txt_orderProductId.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_orderProductId.setFocusable(false);
        txt_orderProductId.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txt_orderProductIdCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txt_orderProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_orderProductIdActionPerformed(evt);
            }
        });
        txt_orderProductId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_orderProductIdKeyReleased(evt);
            }
        });
        jPanel4.add(txt_orderProductId);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Product Name");
        jPanel4.add(jLabel4);

        txt_orderProductName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_orderProductName.setFocusable(false);
        jPanel4.add(txt_orderProductName);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Price (Rs. )");
        jPanel4.add(jLabel5);

        txt_orderProductPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_orderProductPrice.setFocusable(false);
        jPanel4.add(txt_orderProductPrice);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Quantity");
        jPanel4.add(jLabel6);

        txt_orderProductQuantity.setModel(new SpinnerNumberModel(0,0,100,1));
        txt_orderProductQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_orderProductQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txt_orderProductQuantityStateChanged(evt);
            }
        });
        jPanel4.add(txt_orderProductQuantity);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Discount Rate (%)");
        jPanel4.add(jLabel7);

        txt_orderProductDisRate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.add(txt_orderProductDisRate);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Discount Amount (Rs. )");
        jPanel4.add(jLabel12);

        txt_orderProductDisAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_orderProductDisAmount.setFocusable(false);
        jPanel4.add(txt_orderProductDisAmount);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Total");
        jPanel4.add(jLabel13);

        txt_orderProductTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_orderProductTotal.setFocusable(false);
        jPanel4.add(txt_orderProductTotal);

        jPanel5.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 5));

        label_scan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_scan.setForeground(new java.awt.Color(255, 255, 255));
        label_scan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_scan.setText("Scan");

        lbl_success.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_success.setForeground(new java.awt.Color(51, 204, 0));
        lbl_success.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/right.png"))); // NOI18N
        lbl_success.setText("Successful...!");

        btn_scanBarcode.setBackground(new java.awt.Color(255, 255, 255));
        btn_scanBarcode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/barcodeReader.png"))); // NOI18N
        btn_scanBarcode.setColor_bottom(new java.awt.Color(255, 255, 255));
        btn_scanBarcode.setColor_mouseOver(new java.awt.Color(255, 204, 204));
        btn_scanBarcode.setColor_mousePressed(new java.awt.Color(255, 255, 255));
        btn_scanBarcode.setColor_top(new java.awt.Color(255, 255, 255));
        btn_scanBarcode.setFocusPainted(false);
        btn_scanBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scanBarcodeActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(label_scan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lbl_success, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btn_scanBarcode, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_scan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(btn_scanBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_success, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_scanBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_success, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_scan)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Buttons.setBackground(new java.awt.Color(51, 51, 51));
        Buttons.setLayout(new java.awt.GridLayout(0, 1, 0, 20));

        btn_orderAdd.setForeground(new java.awt.Color(255, 255, 255));
        btn_orderAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/arrowAdd.png"))); // NOI18N
        btn_orderAdd.setText("Add");
        btn_orderAdd.setToolTipText("Add");
        btn_orderAdd.setColor_mouseOver(new java.awt.Color(0, 204, 255));
        btn_orderAdd.setColor_mousePressed(new java.awt.Color(102, 255, 255));
        btn_orderAdd.setCornerRadious(15);
        btn_orderAdd.setFocusPainted(false);
        btn_orderAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_orderAdd.setIconTextGap(20);
        btn_orderAdd.setPreferredSize(new java.awt.Dimension(72, 30));
        btn_orderAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderAddActionPerformed(evt);
            }
        });
        Buttons.add(btn_orderAdd);

        btn_orderDelete.setForeground(new java.awt.Color(255, 255, 255));
        btn_orderDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/bin.png"))); // NOI18N
        btn_orderDelete.setText("Delete");
        btn_orderDelete.setToolTipText("Delete");
        btn_orderDelete.setColor_mouseOver(new java.awt.Color(255, 51, 51));
        btn_orderDelete.setColor_mousePressed(new java.awt.Color(255, 102, 102));
        btn_orderDelete.setCornerRadious(15);
        btn_orderDelete.setFocusPainted(false);
        btn_orderDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_orderDelete.setIconTextGap(20);
        btn_orderDelete.setPreferredSize(new java.awt.Dimension(72, 30));
        btn_orderDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderDeleteActionPerformed(evt);
            }
        });
        Buttons.add(btn_orderDelete);

        txt_paidAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_paidAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_paidAmount.setToolTipText("");
        txt_paidAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_paidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_paidAmountKeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Paid Amount (Rs. )");

        btn_pay.setBackground(new java.awt.Color(51, 153, 0));
        btn_pay.setForeground(new java.awt.Color(255, 255, 255));
        btn_pay.setText("     Pay     ");
        btn_pay.setToolTipText("Payment Done");
        btn_pay.setColor_bottom(new java.awt.Color(51, 153, 0));
        btn_pay.setColor_mouseOver(new java.awt.Color(204, 255, 204));
        btn_pay.setColor_mousePressed(new java.awt.Color(51, 102, 0));
        btn_pay.setColor_rippleEffect(new java.awt.Color(153, 255, 102));
        btn_pay.setColor_top(new java.awt.Color(51, 204, 0));
        btn_pay.setCornerRadious(30);
        btn_pay.setFocusPainted(false);
        btn_pay.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_pay.setGradientEffect(true);
        btn_pay.setRippleEffect(true);
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_paidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_pay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_paidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel2.add(jPanel9);

        panel_pos.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(panel_pos);

        panel_bill.setBackground(new java.awt.Color(51, 51, 51));
        panel_bill.setLayout(new java.awt.BorderLayout(0, 5));

        PaymentDetails.setBackground(new java.awt.Color(51, 51, 51));
        PaymentDetails.setPreferredSize(new java.awt.Dimension(745, 120));
        PaymentDetails.setLayout(new java.awt.GridLayout(0, 3, 5, 0));

        Total.setBackground(new java.awt.Color(204, 204, 204));
        Total.setForeground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Rs. ");

        lbl_totAmount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_totAmount.setForeground(new java.awt.Color(51, 51, 51));
        lbl_totAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_totAmount.setText("Amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_totAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_totAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/price.png"))); // NOI18N
        jLabel16.setText("Total Amount");

        javax.swing.GroupLayout TotalLayout = new javax.swing.GroupLayout(Total);
        Total.setLayout(TotalLayout);
        TotalLayout.setHorizontalGroup(
            TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TotalLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TotalLayout.setVerticalGroup(
            TotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TotalLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        PaymentDetails.add(Total);

        PayedAmount.setBackground(new java.awt.Color(204, 204, 204));
        PayedAmount.setForeground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Rs. ");

        lbl_paidAmount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_paidAmount.setForeground(new java.awt.Color(51, 51, 51));
        lbl_paidAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_paidAmount.setText("Amount");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_paidAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_paidAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/coinsColor.png"))); // NOI18N
        jLabel23.setText("Paid Amount");

        javax.swing.GroupLayout PayedAmountLayout = new javax.swing.GroupLayout(PayedAmount);
        PayedAmount.setLayout(PayedAmountLayout);
        PayedAmountLayout.setHorizontalGroup(
            PayedAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayedAmountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PayedAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PayedAmountLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PayedAmountLayout.setVerticalGroup(
            PayedAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PayedAmountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PaymentDetails.add(PayedAmount);

        Balance.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Rs. ");

        lbl_balance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_balance.setForeground(new java.awt.Color(51, 51, 51));
        lbl_balance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_balance.setText("Amount");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_balance, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/Balance.png"))); // NOI18N
        jLabel24.setText("Balance");

        javax.swing.GroupLayout BalanceLayout = new javax.swing.GroupLayout(Balance);
        Balance.setLayout(BalanceLayout);
        BalanceLayout.setHorizontalGroup(
            BalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BalanceLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BalanceLayout.setVerticalGroup(
            BalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BalanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PaymentDetails.add(Balance);

        panel_bill.add(PaymentDetails, java.awt.BorderLayout.SOUTH);

        jLabel15.setPreferredSize(new java.awt.Dimension(10, 10));
        panel_bill.add(jLabel15, java.awt.BorderLayout.LINE_END);

        tbl_order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item No", "Item Name", "Price (Rs.)", "Quantity", "Discount Rate (%)", "Discount (Rs. )", "Total (Rs. )"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_order.setColor_mixer(true);
        tbl_order.setColor_row_shadow(new java.awt.Color(51, 51, 51));
        tbl_order.setColor_row_side_1(new java.awt.Color(204, 153, 0));
        tbl_order.setColor_row_side_2(new java.awt.Color(204, 51, 0));
        jScrollPane2.setViewportView(tbl_order);

        panel_bill.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.add(panel_bill);

        load_orders.add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel14.setPreferredSize(new java.awt.Dimension(10, 10));
        load_orders.add(jLabel14, java.awt.BorderLayout.LINE_START);

        load_panel.add(load_orders);

        load_productList.setBackground(new java.awt.Color(51, 51, 51));
        load_productList.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Product List");
        jLabel9.setPreferredSize(new java.awt.Dimension(137, 60));
        load_productList.add(jLabel9, java.awt.BorderLayout.NORTH);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setLayout(new java.awt.GridLayout(0, 3, 1, 0));

        viewProduct.setBackground(new java.awt.Color(51, 51, 51));
        viewProduct.setPreferredSize(new java.awt.Dimension(226, 40));
        viewProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewProductMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewProductMousePressed(evt);
            }
        });
        viewProduct.setLayout(new java.awt.BorderLayout());

        label_veiwProducts1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_veiwProducts1.setForeground(new java.awt.Color(204, 204, 204));
        label_veiwProducts1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_veiwProducts1.setText("View Product");
        viewProduct.add(label_veiwProducts1, java.awt.BorderLayout.CENTER);

        jPanel20.add(viewProduct);

        newProduct.setBackground(new java.awt.Color(51, 51, 51));
        newProduct.setPreferredSize(new java.awt.Dimension(226, 40));
        newProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newProductMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newProductMousePressed(evt);
            }
        });
        newProduct.setLayout(new java.awt.BorderLayout());

        label_newProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_newProduct.setForeground(new java.awt.Color(204, 204, 204));
        label_newProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_newProduct.setText("Add New Product");
        newProduct.add(label_newProduct, java.awt.BorderLayout.CENTER);

        jPanel20.add(newProduct);

        manageProduct.setBackground(new java.awt.Color(51, 51, 51));
        manageProduct.setPreferredSize(new java.awt.Dimension(226, 40));
        manageProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageProductMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProductMousePressed(evt);
            }
        });
        manageProduct.setLayout(new java.awt.BorderLayout());

        label_veiwProducts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_veiwProducts.setForeground(new java.awt.Color(204, 204, 204));
        label_veiwProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_veiwProducts.setText("Manage Products");
        manageProduct.add(label_veiwProducts, java.awt.BorderLayout.CENTER);

        jPanel20.add(manageProduct);

        jPanel15.add(jPanel20, java.awt.BorderLayout.NORTH);

        load_productDetails.setBackground(new java.awt.Color(51, 51, 51));
        load_productDetails.setLayout(new javax.swing.OverlayLayout(load_productDetails));

        panel_viewProducts.setBackground(new java.awt.Color(51, 51, 51));
        panel_viewProducts.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(51, 51, 51)));
        panel_viewProducts.setLayout(new java.awt.BorderLayout());

        jPanel37.setPreferredSize(new java.awt.Dimension(1108, 50));

        txt_productSearch.setBackground(new java.awt.Color(51, 51, 51));
        txt_productSearch.setForeground(new java.awt.Color(255, 255, 255));
        txt_productSearch.setToolTipText("Search");
        txt_productSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_productSearchMousePressed(evt);
            }
        });
        txt_productSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_productSearchKeyReleased(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/searchBlack.png"))); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_productSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(666, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_productSearch)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_viewProducts.add(jPanel37, java.awt.BorderLayout.NORTH);

        tbl_productDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_productDetails.setShowGrid(false);
        jScrollPane7.setViewportView(tbl_productDetails);

        panel_viewProducts.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        load_productDetails.add(panel_viewProducts);

        panel_newProduct.setBackground(new java.awt.Color(51, 51, 51));
        panel_newProduct.setLayout(new java.awt.BorderLayout());

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 100, 150, 100, new java.awt.Color(51, 51, 51)));
        jPanel29.setPreferredSize(new java.awt.Dimension(714, 200));

        btn_productCancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_productCancel.setText("Cancel");
        btn_productCancel.setCornerRadious(15);
        btn_productCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_productCancel.setPreferredSize(new java.awt.Dimension(80, 30));

        btn_productAdd.setForeground(new java.awt.Color(255, 255, 255));
        btn_productAdd.setText("Add");
        btn_productAdd.setCornerRadious(15);
        btn_productAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_productAdd.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_productAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productAddActionPerformed(evt);
            }
        });

        label_scan1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_scan1.setForeground(new java.awt.Color(255, 255, 255));
        label_scan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_scan1.setText("Scan");

        lbl_successAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_successAddProduct.setForeground(new java.awt.Color(51, 204, 0));
        lbl_successAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/right.png"))); // NOI18N
        lbl_successAddProduct.setText("Successful...!");

        btn_scanBarcodeAddProduct.setBackground(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/barcodeReader.png"))); // NOI18N
        btn_scanBarcodeAddProduct.setColor_bottom(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeAddProduct.setColor_mouseOver(new java.awt.Color(255, 204, 204));
        btn_scanBarcodeAddProduct.setColor_mousePressed(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeAddProduct.setColor_top(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeAddProduct.setFocusPainted(false);
        btn_scanBarcodeAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scanBarcodeAddProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_scan1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(btn_scanBarcodeAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_successAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(btn_productCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_productAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_productAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_productCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_scanBarcodeAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_successAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_scan1))))
        );

        panel_newProduct.add(jPanel29, java.awt.BorderLayout.PAGE_END);

        jPanel39.setBackground(new java.awt.Color(51, 51, 51));
        jPanel39.setPreferredSize(new java.awt.Dimension(1063, 100));

        err_newProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        err_newProduct.setForeground(new java.awt.Color(252, 83, 83));
        err_newProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_newProduct.setText("Error!");
        err_newProduct.setIconTextGap(10);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(err_newProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(err_newProduct)
                .addContainerGap())
        );

        panel_newProduct.add(jPanel39, java.awt.BorderLayout.PAGE_START);

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 200, 10, 200, new java.awt.Color(51, 51, 51)));
        jPanel27.setLayout(new java.awt.GridLayout(0, 2, 10, 40));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Product Id");
        jPanel27.add(jLabel52);

        txt_productId.setBackground(new java.awt.Color(255, 255, 255));
        txt_productId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productId.setForeground(new java.awt.Color(51, 51, 51));
        txt_productId.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productId.setPreferredSize(new java.awt.Dimension(0, 50));
        txt_productId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_productIdKeyReleased(evt);
            }
        });
        jPanel27.add(txt_productId);

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("Product Name");
        jPanel27.add(jLabel53);

        txt_productName.setBackground(new java.awt.Color(255, 255, 255));
        txt_productName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productName.setForeground(new java.awt.Color(51, 51, 51));
        txt_productName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productName.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel27.add(txt_productName);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("Category");
        jPanel27.add(jLabel54);

        cmb_productType.setBackground(new java.awt.Color(255, 255, 255));
        cmb_productType.setForeground(new java.awt.Color(51, 51, 51));
        cmb_productType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category", "Bakery.", "Beverage.", "Nonfood & Pharmacy.", "Produce & Floral.", "Deli.", "Prepared Foods.", "Meat.", "Seafood.", "Dairy", "Center Store", "Private Label", "Multicultural" }));
        cmb_productType.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        cmb_productType.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel27.add(cmb_productType);

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(204, 204, 204));
        jLabel87.setText("Discount Rate (%)");
        jPanel27.add(jLabel87);

        txt_proDisRate.setBackground(new java.awt.Color(255, 255, 255));
        txt_proDisRate.setForeground(new java.awt.Color(51, 51, 51));
        txt_proDisRate.setText("0");
        txt_proDisRate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_proDisRate.setPreferredSize(new java.awt.Dimension(0, 50));
        txt_proDisRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_proDisRateKeyReleased(evt);
            }
        });
        jPanel27.add(txt_proDisRate);

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setText("Description (Optional)");
        jPanel27.add(jLabel59);

        txt_productDescription.setBackground(new java.awt.Color(255, 255, 255));
        txt_productDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productDescription.setForeground(new java.awt.Color(51, 51, 51));
        txt_productDescription.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productDescription.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel27.add(txt_productDescription);

        panel_newProduct.add(jPanel27, java.awt.BorderLayout.CENTER);

        load_productDetails.add(panel_newProduct);

        panel_manageProduccts.setBackground(new java.awt.Color(51, 51, 51));
        panel_manageProduccts.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setPreferredSize(new java.awt.Dimension(986, 100));

        err_productManage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        err_productManage.setForeground(new java.awt.Color(252, 83, 83));
        err_productManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_productManage.setText("Error!");
        err_productManage.setIconTextGap(10);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(err_productManage, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(err_productManage)
                .addContainerGap())
        );

        panel_manageProduccts.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel40.setBackground(new java.awt.Color(51, 51, 51));
        jPanel40.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 200, 10, 200, new java.awt.Color(51, 51, 51)));
        jPanel40.setPreferredSize(new java.awt.Dimension(604, 500));
        jPanel40.setLayout(new java.awt.GridLayout(0, 2, 10, 40));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(204, 204, 204));
        jLabel81.setText("Product Id");
        jPanel40.add(jLabel81);

        cmb_productIdProduct.setBackground(new java.awt.Color(255, 255, 255));
        cmb_productIdProduct.setForeground(new java.awt.Color(51, 51, 51));
        cmb_productIdProduct.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        cmb_productIdProduct.setPreferredSize(new java.awt.Dimension(0, 50));
        cmb_productIdProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_productIdProductActionPerformed(evt);
            }
        });
        jPanel40.add(cmb_productIdProduct);

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(204, 204, 204));
        jLabel82.setText("Product Name");
        jPanel40.add(jLabel82);

        txt_productNameUpdate.setBackground(new java.awt.Color(255, 255, 255));
        txt_productNameUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productNameUpdate.setForeground(new java.awt.Color(51, 51, 51));
        txt_productNameUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productNameUpdate.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel40.add(txt_productNameUpdate);

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(204, 204, 204));
        jLabel83.setText("Catergory");
        jPanel40.add(jLabel83);

        cmb_productTypeUpdate.setBackground(new java.awt.Color(255, 255, 255));
        cmb_productTypeUpdate.setForeground(new java.awt.Color(51, 51, 51));
        cmb_productTypeUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_productTypeUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        cmb_productTypeUpdate.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel40.add(cmb_productTypeUpdate);

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(204, 204, 204));
        jLabel86.setText("Discount Rate (%)");
        jPanel40.add(jLabel86);

        txt_proDisRateUpdate.setBackground(new java.awt.Color(255, 255, 255));
        txt_proDisRateUpdate.setForeground(new java.awt.Color(51, 51, 51));
        txt_proDisRateUpdate.setText("0");
        txt_proDisRateUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel40.add(txt_proDisRateUpdate);

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(204, 204, 204));
        jLabel84.setText("Description");
        jPanel40.add(jLabel84);

        txt_productDescriptionUpdate.setBackground(new java.awt.Color(255, 255, 255));
        txt_productDescriptionUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productDescriptionUpdate.setForeground(new java.awt.Color(51, 51, 51));
        txt_productDescriptionUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productDescriptionUpdate.setPreferredSize(new java.awt.Dimension(0, 50));
        jPanel40.add(txt_productDescriptionUpdate);

        panel_manageProduccts.add(jPanel40, java.awt.BorderLayout.CENTER);

        jPanel41.setBackground(new java.awt.Color(51, 51, 51));
        jPanel41.setPreferredSize(new java.awt.Dimension(986, 200));

        customButton8.setForeground(new java.awt.Color(255, 255, 255));
        customButton8.setText("Cancel");
        customButton8.setCornerRadious(15);
        customButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customButton8.setPreferredSize(new java.awt.Dimension(80, 30));

        btn_updateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateProduct.setText("Update");
        btn_updateProduct.setCornerRadious(15);
        btn_updateProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_updateProduct.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_updateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateProductActionPerformed(evt);
            }
        });

        btn_deleteProduct.setBackground(new java.awt.Color(245, 20, 60));
        btn_deleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/bin_tinny.png"))); // NOI18N
        btn_deleteProduct.setColor_mouseOver(new java.awt.Color(214, 15, 50));
        btn_deleteProduct.setColor_mousePressed(new java.awt.Color(245, 78, 107));
        btn_deleteProduct.setCornerRadious(60);
        btn_deleteProduct.setFocusPainted(false);
        btn_deleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_deleteProduct.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_deleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap(636, Short.MAX_VALUE)
                .addComponent(customButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_updateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_deleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_updateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        panel_manageProduccts.add(jPanel41, java.awt.BorderLayout.SOUTH);

        load_productDetails.add(panel_manageProduccts);

        jPanel15.add(load_productDetails, java.awt.BorderLayout.CENTER);

        load_productList.add(jPanel15, java.awt.BorderLayout.CENTER);

        load_panel.add(load_productList);

        load_stock.setBackground(new java.awt.Color(51, 51, 51));
        load_stock.setPreferredSize(new java.awt.Dimension(1800, 1000));
        load_stock.setLayout(new java.awt.BorderLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Stock Entry");
        jLabel26.setPreferredSize(new java.awt.Dimension(137, 60));
        load_stock.add(jLabel26, java.awt.BorderLayout.NORTH);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        jPanel10.setLayout(new java.awt.GridLayout(0, 3, 1, 10));

        viewStock.setBackground(new java.awt.Color(51, 51, 51));
        viewStock.setPreferredSize(new java.awt.Dimension(269, 40));
        viewStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewStockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewStockMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewStockMousePressed(evt);
            }
        });
        viewStock.setLayout(new java.awt.BorderLayout());

        label_viewSt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_viewSt.setForeground(new java.awt.Color(255, 255, 255));
        label_viewSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_viewSt.setText("View Stock");
        viewStock.add(label_viewSt, java.awt.BorderLayout.CENTER);

        jPanel10.add(viewStock);

        newStock.setBackground(new java.awt.Color(51, 51, 51));
        newStock.setPreferredSize(new java.awt.Dimension(269, 40));
        newStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newStockMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newStockMousePressed(evt);
            }
        });
        newStock.setLayout(new java.awt.BorderLayout());

        label_newSt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_newSt.setForeground(new java.awt.Color(255, 255, 255));
        label_newSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_newSt.setText("New Stock");
        newStock.add(label_newSt, java.awt.BorderLayout.CENTER);

        jPanel10.add(newStock);

        returnStock.setBackground(new java.awt.Color(51, 51, 51));
        returnStock.setPreferredSize(new java.awt.Dimension(269, 40));
        returnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnStockMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                returnStockMousePressed(evt);
            }
        });
        returnStock.setLayout(new java.awt.BorderLayout());

        label_returnSt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_returnSt.setForeground(new java.awt.Color(255, 255, 255));
        label_returnSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_returnSt.setText("Return Stock");
        returnStock.add(label_returnSt, java.awt.BorderLayout.CENTER);

        jPanel10.add(returnStock);

        jPanel8.add(jPanel10, java.awt.BorderLayout.NORTH);

        load_stockEntry.setBackground(new java.awt.Color(51, 51, 51));
        load_stockEntry.setLayout(new javax.swing.OverlayLayout(load_stockEntry));

        panel_viewStock.setBackground(new java.awt.Color(51, 51, 51));
        panel_viewStock.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(51, 51, 51)));
        panel_viewStock.setLayout(new java.awt.BorderLayout());

        tbl_stockDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbl_stockDetails);

        panel_viewStock.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel49.setPreferredSize(new java.awt.Dimension(1108, 50));

        txt_stockSearch.setBackground(new java.awt.Color(51, 51, 51));
        txt_stockSearch.setForeground(new java.awt.Color(255, 255, 255));
        txt_stockSearch.setToolTipText("Search");
        txt_stockSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_stockSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_stockSearchMousePressed(evt);
            }
        });
        txt_stockSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stockSearchKeyReleased(evt);
            }
        });

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/searchBlack.png"))); // NOI18N

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_stockSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addContainerGap(1338, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_stockSearch)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_viewStock.add(jPanel49, java.awt.BorderLayout.NORTH);

        load_stockEntry.add(panel_viewStock);

        panel_newStock.setBackground(new java.awt.Color(51, 51, 51));
        panel_newStock.setPreferredSize(new java.awt.Dimension(1800, 1000));
        panel_newStock.setLayout(new java.awt.GridLayout(0, 2));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(500, 24516));
        jPanel11.setLayout(new java.awt.BorderLayout(10, 30));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 10, new java.awt.Color(51, 51, 51)));
        jPanel13.setLayout(new java.awt.GridLayout(0, 2, 10, 20));

        err_newStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        err_newStock.setForeground(new java.awt.Color(252, 83, 83));
        err_newStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_newStock.setText("Error!");
        err_newStock.setIconTextGap(10);
        jPanel13.add(err_newStock);
        jPanel13.add(jLabel18);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Stock Id");
        jPanel13.add(jLabel27);

        txt_stockId.setEditable(false);
        txt_stockId.setBackground(new java.awt.Color(255, 255, 255));
        txt_stockId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_stockId.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_stockId.setFocusable(false);
        txt_stockId.setPreferredSize(new java.awt.Dimension(64, 30));
        txt_stockId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stockIdActionPerformed(evt);
            }
        });
        jPanel13.add(txt_stockId);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Date");
        jPanel13.add(jLabel34);

        date_stockArrival.setBackground(new java.awt.Color(255, 255, 255));
        date_stockArrival.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        date_stockArrival.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel13.add(date_stockArrival);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Supplier Name");
        jPanel13.add(jLabel28);

        cmb_supplierName.setBackground(new java.awt.Color(255, 255, 255));
        cmb_supplierName.setForeground(new java.awt.Color(51, 51, 51));
        cmb_supplierName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABC Supplier" }));
        cmb_supplierName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        cmb_supplierName.setPreferredSize(new java.awt.Dimension(103, 30));
        jPanel13.add(cmb_supplierName);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Product Id");
        jPanel13.add(jLabel29);

        cmb_productIdStock.setBackground(new java.awt.Color(255, 255, 255));
        cmb_productIdStock.setForeground(new java.awt.Color(51, 51, 51));
        cmb_productIdStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "123", "124" }));
        cmb_productIdStock.setPreferredSize(new java.awt.Dimension(72, 30));
        cmb_productIdStock.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_productIdStockItemStateChanged(evt);
            }
        });
        cmb_productIdStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_productIdStockActionPerformed(evt);
            }
        });
        jPanel13.add(cmb_productIdStock);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Product Name");
        jPanel13.add(jLabel30);

        txt_productNameStock.setEditable(false);
        txt_productNameStock.setBackground(new java.awt.Color(255, 255, 255));
        txt_productNameStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productNameStock.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productNameStock.setFocusable(false);
        txt_productNameStock.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel13.add(txt_productNameStock);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Expired Date");
        jPanel13.add(jLabel35);

        date_productExDate.setBackground(new java.awt.Color(255, 255, 255));
        date_productExDate.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        date_productExDate.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel13.add(date_productExDate);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Price (Rs. )");
        jPanel13.add(jLabel31);

        txt_productPriceStock.setBackground(new java.awt.Color(255, 255, 255));
        txt_productPriceStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productPriceStock.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productPriceStock.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel13.add(txt_productPriceStock);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Quantity");
        jPanel13.add(jLabel32);

        txt_orderProductQuantity.setModel(new SpinnerNumberModel(0,0,100,1));
        txt_productQuantityStock.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_productQuantityStock.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel13.add(txt_productQuantityStock);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));

        btn_addProductToStock.setForeground(new java.awt.Color(255, 255, 255));
        btn_addProductToStock.setText("Add");
        btn_addProductToStock.setCornerRadious(15);
        btn_addProductToStock.setFocusPainted(false);
        btn_addProductToStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_addProductToStock.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_addProductToStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProductToStockActionPerformed(evt);
            }
        });

        btn_scanBarcodeStock.setBackground(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/barcodeReader.png"))); // NOI18N
        btn_scanBarcodeStock.setColor_bottom(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeStock.setColor_mouseOver(new java.awt.Color(255, 204, 204));
        btn_scanBarcodeStock.setColor_mousePressed(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeStock.setColor_top(new java.awt.Color(255, 255, 255));
        btn_scanBarcodeStock.setFocusPainted(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_scanBarcodeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 661, Short.MAX_VALUE)
                .addComponent(btn_addProductToStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_addProductToStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btn_scanBarcodeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel14, java.awt.BorderLayout.SOUTH);

        panel_newStock.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setAlignmentX(0.0F);
        jPanel12.setPreferredSize(new java.awt.Dimension(1500, 506));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel17.setLayout(new java.awt.BorderLayout());

        tbl_stockProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tbl_stockProduct);

        jPanel17.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));

        btn_stockSave.setForeground(new java.awt.Color(255, 255, 255));
        btn_stockSave.setText("Save");
        btn_stockSave.setCornerRadious(15);
        btn_stockSave.setFocusPainted(false);
        btn_stockSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_stockSave.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_stockSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stockSaveActionPerformed(evt);
            }
        });

        btn_stockDelete.setForeground(new java.awt.Color(255, 255, 255));
        btn_stockDelete.setText("Delete");
        btn_stockDelete.setCornerRadious(15);
        btn_stockDelete.setFocusPainted(false);
        btn_stockDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_stockDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_stockDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stockDeleteActionPerformed(evt);
            }
        });

        btn_cancelProductToStock.setBackground(new java.awt.Color(102, 102, 102));
        btn_cancelProductToStock.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelProductToStock.setText("Cancel");
        btn_cancelProductToStock.setCornerRadious(15);
        btn_cancelProductToStock.setFocusPainted(false);
        btn_cancelProductToStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelProductToStock.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_cancelProductToStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelProductToStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(702, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancelProductToStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(btn_stockDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_stockSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_stockSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_stockDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelProductToStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel18, java.awt.BorderLayout.SOUTH);

        panel_newStock.add(jPanel12);

        load_stockEntry.add(panel_newStock);

        panel_returnStock.setBackground(new java.awt.Color(51, 51, 51));
        panel_returnStock.setLayout(new java.awt.BorderLayout());

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 300, 1, 300, new java.awt.Color(51, 51, 51)));
        jPanel25.setPreferredSize(new java.awt.Dimension(406, 500));
        jPanel25.setLayout(new java.awt.GridLayout(0, 2, 0, 10));

        err_returnStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        err_returnStock.setForeground(new java.awt.Color(252, 83, 83));
        err_returnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_returnStock.setText("Error!");
        err_returnStock.setIconTextGap(10);
        jPanel25.add(err_returnStock);
        jPanel25.add(jLabel22);

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(204, 204, 204));
        jLabel91.setText("Product Name");
        jLabel91.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(jLabel91);

        txt_productNameReturn.setBackground(new java.awt.Color(255, 255, 255));
        txt_productNameReturn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productNameReturn.setForeground(new java.awt.Color(51, 51, 51));
        txt_productNameReturn.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(txt_productNameReturn);

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(204, 204, 204));
        jLabel68.setText("Supplier Name");
        jLabel68.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(jLabel68);

        txt_supplierNameReturn.setBackground(new java.awt.Color(255, 255, 255));
        txt_supplierNameReturn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_supplierNameReturn.setForeground(new java.awt.Color(51, 51, 51));
        txt_supplierNameReturn.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(txt_supplierNameReturn);

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(204, 204, 204));
        jLabel70.setText("Expired date");
        jLabel70.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(jLabel70);

        date_productExDateReturn.setBackground(new java.awt.Color(255, 255, 255));
        date_productExDateReturn.setForeground(new java.awt.Color(51, 51, 51));
        jPanel25.add(date_productExDateReturn);

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 204, 204));
        jLabel89.setText("Price");
        jLabel89.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(jLabel89);

        txt_productPriceReturn.setBackground(new java.awt.Color(255, 255, 255));
        txt_productPriceReturn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_productPriceReturn.setForeground(new java.awt.Color(51, 51, 51));
        txt_productPriceReturn.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(txt_productPriceReturn);

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 204, 204));
        jLabel71.setText("Reason");
        jLabel71.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(jLabel71);

        cmb_producctReturnReason.setBackground(new java.awt.Color(255, 255, 255));
        cmb_producctReturnReason.setForeground(new java.awt.Color(51, 51, 51));
        jPanel25.add(cmb_producctReturnReason);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("Quantity");
        jLabel50.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(jLabel50);

        txt_producctCurrentQuantityReturn.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(txt_producctCurrentQuantityReturn);

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(204, 204, 204));
        jLabel69.setText("Return Quantity");
        jLabel69.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(jLabel69);

        txt_productReturnQuantity.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel25.add(txt_productReturnQuantity);

        panel_returnStock.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setPreferredSize(new java.awt.Dimension(833, 200));

        btn_cancelReturn.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelReturn.setText("Cancel");
        btn_cancelReturn.setCornerRadious(15);
        btn_cancelReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelReturn.setPreferredSize(new java.awt.Dimension(80, 30));

        btn_return.setForeground(new java.awt.Color(255, 255, 255));
        btn_return.setText("Return");
        btn_return.setCornerRadious(15);
        btn_return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_return.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(1126, Short.MAX_VALUE)
                .addComponent(btn_cancelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        panel_returnStock.add(jPanel22, java.awt.BorderLayout.PAGE_END);

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 50));
        jPanel26.setLayout(new java.awt.GridLayout(0, 7, 20, 10));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("Stock Id");
        jLabel51.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel26.add(jLabel51);

        cmb_stockIdStockReturn.setBackground(new java.awt.Color(255, 255, 255));
        cmb_stockIdStockReturn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_stockIdStockReturn.setForeground(new java.awt.Color(51, 51, 51));
        cmb_stockIdStockReturn.setPreferredSize(new java.awt.Dimension(0, 30));
        cmb_stockIdStockReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_stockIdStockReturnActionPerformed(evt);
            }
        });
        jPanel26.add(cmb_stockIdStockReturn);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Product Id");
        jLabel48.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel26.add(jLabel48);

        cmb_productIdStockReturm.setBackground(new java.awt.Color(255, 255, 255));
        cmb_productIdStockReturm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_productIdStockReturm.setForeground(new java.awt.Color(51, 51, 51));
        cmb_productIdStockReturm.setPreferredSize(new java.awt.Dimension(0, 30));
        cmb_productIdStockReturm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_productIdStockReturmActionPerformed(evt);
            }
        });
        jPanel26.add(cmb_productIdStockReturm);

        panel_returnStock.add(jPanel26, java.awt.BorderLayout.NORTH);

        load_stockEntry.add(panel_returnStock);

        jPanel8.add(load_stockEntry, java.awt.BorderLayout.CENTER);

        load_stock.add(jPanel8, java.awt.BorderLayout.CENTER);

        load_panel.add(load_stock);

        load_reports.setBackground(new java.awt.Color(51, 51, 51));
        load_reports.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(51, 51, 51)));
        load_reports.setLayout(new java.awt.BorderLayout());

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));
        jPanel30.setLayout(new java.awt.BorderLayout(0, 20));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 204, 204));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Reports");
        jLabel60.setPreferredSize(new java.awt.Dimension(172, 60));
        jPanel30.add(jLabel60, java.awt.BorderLayout.NORTH);

        jPanel32.setLayout(new java.awt.BorderLayout());

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setPreferredSize(new java.awt.Dimension(810, 30));
        jPanel28.setLayout(new java.awt.GridLayout(0, 5, 20, 0));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setText("First Date");
        jLabel55.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel55.setPreferredSize(new java.awt.Dimension(0, 40));
        jPanel28.add(jLabel55);

        date_reportStart.setForeground(new java.awt.Color(51, 51, 51));
        jPanel28.add(date_reportStart);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 204, 204));
        jLabel56.setText("Last Date");
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel56.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel28.add(jLabel56);

        date_reportEnd.setForeground(new java.awt.Color(51, 51, 51));
        jPanel28.add(date_reportEnd);

        btn_searchReport.setBackground(new java.awt.Color(0, 102, 204));
        btn_searchReport.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_searchReport.setForeground(new java.awt.Color(204, 204, 204));
        btn_searchReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/search.png"))); // NOI18N
        btn_searchReport.setText("search");
        btn_searchReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 10, true));
        btn_searchReport.setBorderPainted(false);
        btn_searchReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_searchReport.setFocusPainted(false);
        jPanel28.add(btn_searchReport);

        jPanel32.add(jPanel28, java.awt.BorderLayout.NORTH);

        jPanel31.setBackground(new java.awt.Color(51, 51, 51));
        jPanel31.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 10, 10, new java.awt.Color(51, 51, 51)));
        jPanel31.setLayout(new java.awt.GridLayout(0, 1, 0, 50));

        panelBorder3.setBackground(new java.awt.Color(204, 204, 204));
        panelBorder3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelBorder3.setLayout(new java.awt.BorderLayout());

        btn_incomeReport.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_incomeReport.setForeground(new java.awt.Color(51, 51, 51));
        btn_incomeReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_incomeReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/income.png"))); // NOI18N
        btn_incomeReport.setText("Income Report");
        btn_incomeReport.setIconTextGap(100);
        btn_incomeReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_incomeReportMouseClicked(evt);
            }
        });
        panelBorder3.add(btn_incomeReport, java.awt.BorderLayout.CENTER);

        jPanel31.add(panelBorder3);

        panelBorder4.setBackground(new java.awt.Color(204, 204, 204));
        panelBorder4.setLayout(new java.awt.BorderLayout());

        btn_salesReport.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_salesReport.setForeground(new java.awt.Color(51, 51, 51));
        btn_salesReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_salesReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/Sales.png"))); // NOI18N
        btn_salesReport.setText("Stock Availability");
        btn_salesReport.setIconTextGap(45);
        btn_salesReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salesReportMouseClicked(evt);
            }
        });
        panelBorder4.add(btn_salesReport, java.awt.BorderLayout.CENTER);

        jPanel31.add(panelBorder4);

        jPanel32.add(jPanel31, java.awt.BorderLayout.CENTER);

        jPanel30.add(jPanel32, java.awt.BorderLayout.CENTER);

        load_reports.add(jPanel30, java.awt.BorderLayout.CENTER);

        load_panel.add(load_reports);

        load_addSupplier.setBackground(new java.awt.Color(51, 51, 51));
        load_addSupplier.setLayout(new java.awt.BorderLayout());

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(204, 204, 204));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Add New User");
        jLabel73.setPreferredSize(new java.awt.Dimension(172, 60));
        load_addSupplier.add(jLabel73, java.awt.BorderLayout.NORTH);

        jPanel44.setBackground(new java.awt.Color(51, 51, 51));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setLayout(new java.awt.GridLayout(0, 2, 1, 0));

        newSupplier.setBackground(new java.awt.Color(51, 51, 51));
        newSupplier.setPreferredSize(new java.awt.Dimension(564, 40));
        newSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newSupplierMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newSupplierMousePressed(evt);
            }
        });
        newSupplier.setLayout(new java.awt.BorderLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("NewSupplier");
        jLabel47.setPreferredSize(new java.awt.Dimension(43, 25));
        newSupplier.add(jLabel47, java.awt.BorderLayout.CENTER);

        jPanel38.add(newSupplier);

        manageSupplier.setBackground(new java.awt.Color(51, 51, 51));
        manageSupplier.setPreferredSize(new java.awt.Dimension(564, 40));
        manageSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageSupplierMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSupplierMousePressed(evt);
            }
        });
        manageSupplier.setLayout(new java.awt.BorderLayout());

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Manage Supplier");
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel49.setPreferredSize(new java.awt.Dimension(43, 25));
        manageSupplier.add(jLabel49, java.awt.BorderLayout.CENTER);

        jPanel38.add(manageSupplier);

        jPanel44.add(jPanel38, java.awt.BorderLayout.NORTH);

        load_supplier.setBackground(new java.awt.Color(51, 51, 51));
        load_supplier.setPreferredSize(new java.awt.Dimension(1800, 1000));
        load_supplier.setLayout(new javax.swing.OverlayLayout(load_supplier));

        panel_newSupplier.setBackground(new java.awt.Color(51, 51, 51));
        panel_newSupplier.setPreferredSize(new java.awt.Dimension(1800, 1000));
        panel_newSupplier.setLayout(new java.awt.BorderLayout());

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setPreferredSize(new java.awt.Dimension(1806, 80));

        err_newSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        err_newSupplier.setForeground(new java.awt.Color(252, 83, 83));
        err_newSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_newSupplier.setText("Error!");
        err_newSupplier.setIconTextGap(10);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(err_newSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1133, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(err_newSupplier)
                .addGap(20, 20, 20))
        );

        panel_newSupplier.add(jPanel19, java.awt.BorderLayout.NORTH);

        jPanel42.setBackground(new java.awt.Color(51, 51, 51));
        jPanel42.setPreferredSize(new java.awt.Dimension(250, 552));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jLabel74.setBackground(new java.awt.Color(51, 51, 51));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/supplier.png"))); // NOI18N
        jLabel74.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel74.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 1, 1, 20, new java.awt.Color(51, 51, 51)));
        jPanel42.add(jLabel74, java.awt.BorderLayout.CENTER);

        panel_newSupplier.add(jPanel42, java.awt.BorderLayout.LINE_START);

        jPanel45.setBackground(new java.awt.Color(51, 51, 51));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 20));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 204, 204));
        jLabel75.setText("Supplier Name");
        jLabel75.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 204, 204));
        jLabel76.setText("Contact Number");
        jLabel76.setPreferredSize(new java.awt.Dimension(200, 30));

        txt_supllierTPAdd.setBackground(new java.awt.Color(255, 255, 255));
        txt_supllierTPAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_supllierTPAdd.setForeground(new java.awt.Color(51, 51, 51));
        txt_supllierTPAdd.setPreferredSize(new java.awt.Dimension(64, 30));
        txt_supllierTPAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_supllierTPAddKeyReleased(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(204, 204, 204));
        jLabel80.setText("Email Address");
        jLabel80.setPreferredSize(new java.awt.Dimension(200, 30));

        txt_supplierEmailAdd.setBackground(new java.awt.Color(255, 255, 255));
        txt_supplierEmailAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_supplierEmailAdd.setForeground(new java.awt.Color(51, 51, 51));
        txt_supplierEmailAdd.setPreferredSize(new java.awt.Dimension(64, 30));
        txt_supplierEmailAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_supplierEmailAddKeyReleased(evt);
            }
        });

        btn_saveSupllier.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveSupllier.setText("Save");
        btn_saveSupllier.setCornerRadious(15);
        btn_saveSupllier.setFocusPainted(false);
        btn_saveSupllier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_saveSupllier.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_saveSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveSupllierActionPerformed(evt);
            }
        });

        btn_cancelSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelSupplier.setText("Cancel");
        btn_cancelSupplier.setCornerRadious(15);
        btn_cancelSupplier.setFocusPainted(false);
        btn_cancelSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelSupplier.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 204, 204));
        jLabel85.setText("Location");
        jLabel85.setPreferredSize(new java.awt.Dimension(200, 30));

        txt_locationAdd.setBackground(new java.awt.Color(255, 255, 255));
        txt_locationAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_locationAdd.setForeground(new java.awt.Color(51, 51, 51));
        txt_locationAdd.setPreferredSize(new java.awt.Dimension(64, 30));

        txt_supllierNameAdd.setBackground(new java.awt.Color(255, 255, 255));
        txt_supllierNameAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_supllierNameAdd.setForeground(new java.awt.Color(51, 51, 51));
        txt_supllierNameAdd.setPreferredSize(new java.awt.Dimension(64, 30));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_locationAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_supllierTPAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_supplierEmailAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                        .addGap(0, 388, Short.MAX_VALUE)
                        .addComponent(btn_cancelSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_saveSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_supllierNameAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(500, 500, 500))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_supllierNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_supllierTPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_supplierEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_locationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saveSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(461, Short.MAX_VALUE))
        );

        panel_newSupplier.add(jPanel45, java.awt.BorderLayout.CENTER);

        load_supplier.add(panel_newSupplier);

        panel_manageSupplier.setBackground(new java.awt.Color(51, 51, 51));
        panel_manageSupplier.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 200, 100, 200, new java.awt.Color(51, 51, 51)));
        panel_manageSupplier.setLayout(new java.awt.BorderLayout());

        tbl_supplierData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tbl_supplierData);

        panel_manageSupplier.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jPanel46.setBackground(new java.awt.Color(51, 51, 51));
        jPanel46.setPreferredSize(new java.awt.Dimension(728, 60));

        btn_deleteSupplier.setBackground(new java.awt.Color(245, 20, 60));
        btn_deleteSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/bin.png"))); // NOI18N
        btn_deleteSupplier.setColor_mouseOver(new java.awt.Color(214, 15, 50));
        btn_deleteSupplier.setColor_mousePressed(new java.awt.Color(245, 78, 107));
        btn_deleteSupplier.setCornerRadious(50);
        btn_deleteSupplier.setFocusPainted(false);
        btn_deleteSupplier.setPreferredSize(new java.awt.Dimension(45, 45));
        btn_deleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(1349, Short.MAX_VALUE)
                .addComponent(btn_deleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(btn_deleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_manageSupplier.add(jPanel46, java.awt.BorderLayout.PAGE_END);

        jPanel47.setBackground(new java.awt.Color(51, 51, 51));
        jPanel47.setPreferredSize(new java.awt.Dimension(728, 50));

        txt_supplierSearch.setBackground(new java.awt.Color(51, 51, 51));
        txt_supplierSearch.setForeground(new java.awt.Color(255, 255, 255));
        txt_supplierSearch.setToolTipText("Search");
        txt_supplierSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_supplierSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_supplierSearchKeyReleased(evt);
            }
        });

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/searchBlack.png"))); // NOI18N

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(958, Short.MAX_VALUE)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_supplierSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_supplierSearch)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_manageSupplier.add(jPanel47, java.awt.BorderLayout.NORTH);

        load_supplier.add(panel_manageSupplier);

        jPanel44.add(load_supplier, java.awt.BorderLayout.CENTER);

        load_addSupplier.add(jPanel44, java.awt.BorderLayout.CENTER);

        load_panel.add(load_addSupplier);

        load_addUser.setBackground(new java.awt.Color(51, 51, 51));
        load_addUser.setPreferredSize(new java.awt.Dimension(1800, 1000));
        load_addUser.setLayout(new java.awt.BorderLayout());

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 204, 204));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Add New User");
        jLabel62.setPreferredSize(new java.awt.Dimension(172, 60));
        load_addUser.add(jLabel62, java.awt.BorderLayout.NORTH);

        jPanel43.setBackground(new java.awt.Color(51, 51, 51));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setLayout(new java.awt.GridLayout(0, 2, 1, 0));

        newUser.setBackground(new java.awt.Color(51, 51, 51));
        newUser.setPreferredSize(new java.awt.Dimension(564, 40));
        newUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newUserMousePressed(evt);
            }
        });
        newUser.setLayout(new java.awt.BorderLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("New USer");
        jLabel33.setPreferredSize(new java.awt.Dimension(43, 25));
        newUser.add(jLabel33, java.awt.BorderLayout.CENTER);

        jPanel36.add(newUser);

        manageUser.setBackground(new java.awt.Color(51, 51, 51));
        manageUser.setPreferredSize(new java.awt.Dimension(564, 40));
        manageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserMousePressed(evt);
            }
        });
        manageUser.setLayout(new java.awt.BorderLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Manage User");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel36.setPreferredSize(new java.awt.Dimension(43, 25));
        manageUser.add(jLabel36, java.awt.BorderLayout.CENTER);

        jPanel36.add(manageUser);

        jPanel43.add(jPanel36, java.awt.BorderLayout.NORTH);

        load_user.setBackground(new java.awt.Color(51, 51, 51));
        load_user.setLayout(new javax.swing.OverlayLayout(load_user));

        panel_newUser.setBackground(new java.awt.Color(51, 51, 51));
        panel_newUser.setPreferredSize(new java.awt.Dimension(1800, 1000));
        panel_newUser.setLayout(new java.awt.BorderLayout());

        jPanel33.setBackground(new java.awt.Color(51, 51, 51));
        jPanel33.setPreferredSize(new java.awt.Dimension(250, 552));
        jPanel33.setLayout(new java.awt.BorderLayout());

        jLabel61.setBackground(new java.awt.Color(51, 51, 51));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/account.png"))); // NOI18N
        jLabel61.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel33.add(jLabel61, java.awt.BorderLayout.CENTER);

        panel_newUser.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setPreferredSize(new java.awt.Dimension(1800, 80));

        err_newUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        err_newUser.setForeground(new java.awt.Color(252, 83, 83));
        err_newUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_newUser.setText("Error!");
        err_newUser.setIconTextGap(10);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(err_newUser, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1129, 1129, 1129))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(err_newUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panel_newUser.add(jPanel21, java.awt.BorderLayout.NORTH);

        jPanel35.setBackground(new java.awt.Color(51, 51, 51));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 204, 204));
        jLabel63.setText("Employee Id");
        jLabel63.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 204, 204));
        jLabel64.setText("Employee Name");
        jLabel64.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 204, 204));
        jLabel65.setText("Account Type");
        jLabel65.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(204, 204, 204));
        jLabel66.setText("Password");
        jLabel66.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(204, 204, 204));
        jLabel67.setText("ConfirmPasswrd");
        jLabel67.setPreferredSize(new java.awt.Dimension(200, 30));

        txt_empName.setBackground(new java.awt.Color(255, 255, 255));
        txt_empName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_empName.setForeground(new java.awt.Color(51, 51, 51));
        txt_empName.setPreferredSize(new java.awt.Dimension(0, 30));

        txt_userPass.setBackground(new java.awt.Color(255, 255, 255));
        txt_userPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_userPass.setForeground(new java.awt.Color(51, 51, 51));
        txt_userPass.setEchoChar('\u25cf');
        txt_userPass.setPreferredSize(new java.awt.Dimension(0, 30));

        txt_userConPass.setBackground(new java.awt.Color(255, 255, 255));
        txt_userConPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_userConPass.setForeground(new java.awt.Color(51, 51, 51));
        txt_userConPass.setEchoChar('\u25cf');
        txt_userConPass.setPreferredSize(new java.awt.Dimension(0, 30));

        rbtn_admin.setBackground(new java.awt.Color(51, 51, 51));
        grp_userType.add(rbtn_admin);
        rbtn_admin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_admin.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_admin.setText("Admin");
        rbtn_admin.setFocusPainted(false);
        rbtn_admin.setPreferredSize(new java.awt.Dimension(100, 30));
        rbtn_admin.setActionCommand("Admin");

        rbtn_normal.setBackground(new java.awt.Color(51, 51, 51));
        grp_userType.add(rbtn_normal);
        rbtn_normal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_normal.setForeground(new java.awt.Color(255, 255, 255));
        rbtn_normal.setSelected(true);
        rbtn_normal.setText("Normal");
        rbtn_normal.setFocusPainted(false);
        rbtn_normal.setPreferredSize(new java.awt.Dimension(100, 30));
        rbtn_normal.setActionCommand("Normal");

        cmb_empId.setBackground(new java.awt.Color(255, 255, 255));
        cmb_empId.setForeground(new java.awt.Color(51, 51, 51));
        cmb_empId.setPreferredSize(new java.awt.Dimension(0, 30));
        cmb_empId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_empIdActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(204, 204, 204));
        jLabel72.setText("User Name");
        jLabel72.setPreferredSize(new java.awt.Dimension(200, 30));

        txt_userName.setBackground(new java.awt.Color(255, 255, 255));
        txt_userName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(51, 51, 51));
        txt_userName.setPreferredSize(new java.awt.Dimension(0, 30));

        btn_saveUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveUser.setText("Save");
        btn_saveUser.setCornerRadious(15);
        btn_saveUser.setFocusPainted(false);
        btn_saveUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_saveUser.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_saveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveUserActionPerformed(evt);
            }
        });

        btn_cancelUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelUser.setText("Cancel");
        btn_cancelUser.setCornerRadious(15);
        btn_cancelUser.setFocusPainted(false);
        btn_cancelUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelUser.setPreferredSize(new java.awt.Dimension(80, 30));

        btn_show.setBackground(new java.awt.Color(51, 51, 51));
        btn_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/show.png"))); // NOI18N
        btn_show.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_show.setContentAreaFilled(false);
        btn_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_show.setFocusPainted(false);
        btn_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_showMouseClicked(evt);
            }
        });
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_empName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_userPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_userConPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_empId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createSequentialGroup()
                        .addComponent(rbtn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtn_normal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 322, Short.MAX_VALUE))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(btn_cancelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_saveUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(503, 503, 503))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_empId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_normal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_userPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_userConPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saveUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(346, Short.MAX_VALUE))
        );

        panel_newUser.add(jPanel35, java.awt.BorderLayout.CENTER);

        load_user.add(panel_newUser);

        panel_manageUser.setBackground(new java.awt.Color(51, 51, 51));
        panel_manageUser.setBorder(javax.swing.BorderFactory.createMatteBorder(50, 200, 100, 200, new java.awt.Color(51, 51, 51)));
        panel_manageUser.setPreferredSize(new java.awt.Dimension(1800, 1000));
        panel_manageUser.setLayout(new java.awt.BorderLayout());

        tbl_userData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tbl_userData);

        panel_manageUser.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel34.setBackground(new java.awt.Color(51, 51, 51));
        jPanel34.setPreferredSize(new java.awt.Dimension(728, 60));

        btn_userDelete.setBackground(new java.awt.Color(245, 20, 60));
        btn_userDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/bin.png"))); // NOI18N
        btn_userDelete.setColor_mouseOver(new java.awt.Color(214, 15, 50));
        btn_userDelete.setColor_mousePressed(new java.awt.Color(245, 78, 107));
        btn_userDelete.setCornerRadious(50);
        btn_userDelete.setFocusPainted(false);
        btn_userDelete.setPreferredSize(new java.awt.Dimension(45, 45));
        btn_userDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(1349, Short.MAX_VALUE)
                .addComponent(btn_userDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(btn_userDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_manageUser.add(jPanel34, java.awt.BorderLayout.PAGE_END);

        jPanel48.setBackground(new java.awt.Color(51, 51, 51));
        jPanel48.setPreferredSize(new java.awt.Dimension(728, 50));

        txt_userSearch.setBackground(new java.awt.Color(51, 51, 51));
        txt_userSearch.setForeground(new java.awt.Color(255, 255, 255));
        txt_userSearch.setToolTipText("Search");
        txt_userSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_userSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_userSearchKeyReleased(evt);
            }
        });

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/searchBlack.png"))); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap(699, Short.MAX_VALUE)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_userSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_userSearch)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_manageUser.add(jPanel48, java.awt.BorderLayout.NORTH);

        load_user.add(panel_manageUser);

        jPanel43.add(load_user, java.awt.BorderLayout.CENTER);

        load_addUser.add(jPanel43, java.awt.BorderLayout.CENTER);

        load_panel.add(load_addUser);

        load_logout.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout load_logoutLayout = new javax.swing.GroupLayout(load_logout);
        load_logout.setLayout(load_logoutLayout);
        load_logoutLayout.setHorizontalGroup(
            load_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1598, Short.MAX_VALUE)
        );
        load_logoutLayout.setVerticalGroup(
            load_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        load_panel.add(load_logout);

        scrollPanel.setViewportView(load_panel);

        jPanel50.add(scrollPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel50, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1838, 966));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        home.setBackground(ClickedColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);


    }//GEN-LAST:event_homeMousePressed

    private void ordersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMousePressed
        home.setBackground(DefaultColor);
        orders.setBackground(ClickedColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_ordersMousePressed

    private void productListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListMousePressed
        home.setBackground(DefaultColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(ClickedColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_productListMousePressed

    private void stocksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocksMousePressed
        home.setBackground(DefaultColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(ClickedColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_stocksMousePressed

    private void reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMousePressed
        home.setBackground(DefaultColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(ClickedColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_reportsMousePressed

    private void addSupplierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSupplierMousePressed
        home.setBackground(DefaultColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(ClickedColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_addSupplierMousePressed

    private void addUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMousePressed
        home.setBackground(DefaultColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(ClickedColor);
        logout.setBackground(DefaultColor);
    }//GEN-LAST:event_addUserMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        home.setBackground(DefaultColor);
        orders.setBackground(DefaultColor);
        productList.setBackground(DefaultColor);
        stocks.setBackground(DefaultColor);
        reports.setBackground(DefaultColor);
        addSupplier.setBackground(DefaultColor);
        addUser.setBackground(DefaultColor);
        logout.setBackground(ClickedColor);
    }//GEN-LAST:event_logoutMousePressed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        load_home.setVisible(true);
        load_orders.setVisible(false);
        load_productList.setVisible(false);
        load_stock.setVisible(false);
        load_reports.setVisible(false);
        load_addSupplier.setVisible(false);
        load_addUser.setVisible(false);
        load_logout.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseClicked
        load_home.setVisible(false);
        load_orders.setVisible(true);
        load_productList.setVisible(false);
        load_stock.setVisible(false);
        load_reports.setVisible(false);
        load_addSupplier.setVisible(false);
        load_addUser.setVisible(false);
        load_logout.setVisible(false);
        txt_invoiceNo.setText(Service.getNextId(InvoiceController.getLastInvoice().getInvoiceId() + ""));

        DefaultTableModel dt = (DefaultTableModel) tbl_order.getModel();
        dt.setNumRows(0);
        dt.setColumnCount(0);
        dt.addColumn("Item Id");
        dt.addColumn("Item");
        dt.addColumn("Price(Rs.)");
        dt.addColumn("Quantity");
        dt.addColumn("Discount Amount");
        dt.addColumn("Total(Rs.)");
        lbl_totAmount.setText("0.00");
        productListArray = new ArrayList<>();
        err_pos.setVisible(false);
        lbl_success.setVisible(false);
    }//GEN-LAST:event_ordersMouseClicked

    private void productListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListMouseClicked
        load_home.setVisible(false);
        load_orders.setVisible(false);
        load_productList.setVisible(true);
        load_stock.setVisible(false);
        load_reports.setVisible(false);
        load_addSupplier.setVisible(false);
        load_addUser.setVisible(false);
        load_logout.setVisible(false);

        viewProduct.setBackground(ClickedColor);
        newProduct.setBackground(DefaultColor);
        manageProduct.setBackground(DefaultColor);

        panel_viewProducts.setVisible(true);
        panel_newProduct.setVisible(false);
        panel_manageProduccts.setVisible(false);

    }//GEN-LAST:event_productListMouseClicked

    private void stocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocksMouseClicked
        load_home.setVisible(false);
        load_orders.setVisible(false);
        load_productList.setVisible(false);
        load_stock.setVisible(true);
        load_reports.setVisible(false);
        load_addSupplier.setVisible(false);
        load_addUser.setVisible(false);
        load_logout.setVisible(false);

        viewStock.setBackground(ClickedColor);
        newStock.setBackground(DefaultColor);
        returnStock.setBackground(DefaultColor);

        panel_viewStock.setVisible(true);
        panel_newStock.setVisible(false);
        panel_returnStock.setVisible(false);
    }//GEN-LAST:event_stocksMouseClicked

    private void newStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newStockMousePressed
        newStock.setBackground(ClickedColor);
        viewStock.setBackground(DefaultColor);
        returnStock.setBackground(DefaultColor);
    }//GEN-LAST:event_newStockMousePressed

    private void viewStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStockMousePressed
        newStock.setBackground(DefaultColor);
        viewStock.setBackground(ClickedColor);
        returnStock.setBackground(DefaultColor);
    }//GEN-LAST:event_viewStockMousePressed

    private void returnStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnStockMousePressed
        newStock.setBackground(DefaultColor);
        viewStock.setBackground(DefaultColor);
        returnStock.setBackground(ClickedColor);
    }//GEN-LAST:event_returnStockMousePressed

    private void newStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newStockMouseClicked
        panel_newStock.setVisible(true);
        panel_viewStock.setVisible(false);
        panel_returnStock.setVisible(false);
        err_newStock.setVisible(false);

        SupplierController.loadSupplierName(cmb_supplierName);
        ProductController.loadProduct(cmb_productIdStock);

        Random r = new Random();

        txt_stockId.setText(r.nextInt() + "");

        productListArray = new ArrayList<>();

        DefaultTableModel dt = (DefaultTableModel) tbl_stockProduct.getModel();
        dt.setNumRows(0);
        dt.setColumnCount(0);
        dt.addColumn("Product Id");
        dt.addColumn("Name");
        dt.addColumn("Price(Rs.)");
        dt.addColumn("Quantity");
        dt.addColumn("Expired Date");
        date_productExDate.setInitialDate(Date.valueOf(LocalDate.now()));
        date_stockArrival.setInitialDate(Date.valueOf(LocalDate.now()));
    }//GEN-LAST:event_newStockMouseClicked

    private void viewStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStockMouseClicked
        panel_newStock.setVisible(false);
        panel_viewStock.setVisible(true);
        panel_returnStock.setVisible(false);
        DefaultTableModel dt = (DefaultTableModel) tbl_productDetails.getModel();
        dt.setColumnCount(0);
        dt.addColumn("Stock Id");
        dt.addColumn("Arrival Date");
        dt.addColumn("Supplier No");

        StockController.getStock(tbl_stockDetails, txt_stockSearch.getText());


    }//GEN-LAST:event_viewStockMouseClicked

    private void returnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnStockMouseClicked
        panel_newStock.setVisible(false);
        panel_viewStock.setVisible(false);
        panel_returnStock.setVisible(true);
        StockController.loadStocks(cmb_stockIdStockReturn);
        ProductController.loadProduct(cmb_productIdStockReturm);
        err_returnStock.setVisible(false);
    }//GEN-LAST:event_returnStockMouseClicked

    private void txt_stockIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stockIdActionPerformed

    }//GEN-LAST:event_txt_stockIdActionPerformed

    private void newProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProductMousePressed
        newProduct.setBackground(ClickedColor);
        manageProduct.setBackground(DefaultColor);
        viewProduct.setBackground(DefaultColor);
    }//GEN-LAST:event_newProductMousePressed

    private void manageProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProductMousePressed
        newProduct.setBackground(DefaultColor);
        manageProduct.setBackground(ClickedColor);
        viewProduct.setBackground(DefaultColor);
    }//GEN-LAST:event_manageProductMousePressed

    private void newProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newProductMouseClicked
        panel_newProduct.setVisible(true);
        panel_manageProduccts.setVisible(false);
        panel_viewProducts.setVisible(false);
        lbl_successAddProduct.setVisible(false);
        err_newProduct.setVisible(false);
    }//GEN-LAST:event_newProductMouseClicked

    private void manageProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProductMouseClicked
        panel_newProduct.setVisible(false);
        panel_manageProduccts.setVisible(true);
        panel_viewProducts.setVisible(false);

        txt_productSearch.setBackground(DefaultColor);

        ProductController.loadProduct(cmb_productIdProduct);


    }//GEN-LAST:event_manageProductMouseClicked

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        load_home.setVisible(false);
        load_orders.setVisible(false);
        load_productList.setVisible(false);
        load_stock.setVisible(false);
        load_reports.setVisible(true);
        load_addSupplier.setVisible(false);
        load_addUser.setVisible(false);
        load_logout.setVisible(false);
    }//GEN-LAST:event_reportsMouseClicked

    private void addSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSupplierMouseClicked
        load_home.setVisible(false);
        load_orders.setVisible(false);
        load_productList.setVisible(false);
        load_stock.setVisible(false);
        load_reports.setVisible(false);
        load_addSupplier.setVisible(true);
        load_addUser.setVisible(false);
        load_logout.setVisible(false);
        newSupplier.setBackground(ClickedColor);
        err_newSupplier.setVisible(false);

        panel_newSupplier.setVisible(true);
        panel_manageSupplier.setVisible(false);

    }//GEN-LAST:event_addSupplierMouseClicked

    private void addUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMouseClicked
        load_home.setVisible(false);
        load_orders.setVisible(false);
        load_productList.setVisible(false);
        load_stock.setVisible(false);
        load_reports.setVisible(false);
        load_addSupplier.setVisible(false);
        load_addUser.setVisible(true);
        load_logout.setVisible(false);
        newUser.setBackground(ClickedColor);
        panel_newUser.setVisible(true);
        panel_manageUser.setVisible(false);
        err_newUser.setVisible(false);
        UserController.loadEmployees(cmb_empId);
    }//GEN-LAST:event_addUserMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void txt_productSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_productSearchKeyReleased
        ProductController.getProduct(tbl_productDetails, txt_productSearch.getText());
    }//GEN-LAST:event_txt_productSearchKeyReleased

    private void txt_productSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_productSearchMousePressed
        txt_productSearch.setBackground(ClickedColor);
    }//GEN-LAST:event_txt_productSearchMousePressed

    private void btn_addProductToStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductToStockActionPerformed
        if (Validator.isSelectedIndex(cmb_supplierName.getSelectedIndex())) {
            err_newStock.setText("Supplier Name is required.");
            err_newStock.setVisible(true);
        } else if (Validator.isSelectedIndex(cmb_productIdStock.getSelectedIndex())) {
            err_newStock.setText("Product Id is required.");
            err_newStock.setVisible(true);
        } else if (!Validator.checkDateForEarly(date_productExDate)) {
            err_newStock.setText("Selected date cannot get as a exxpired date.");
            err_newStock.setVisible(true);
        } else if (Validator.isNull(txt_productPriceStock.getText()) || Validator.isEmpty(txt_productPriceStock.getText())) {
            err_newStock.setText("Price is required.");
            err_newStock.setVisible(true);
        } /*else if (Validator.isNull(txt_productQuantityStock.getModel().setValue((Object) 0)) || Validator.isEmpty(txt_productQuantityStock.getModel().setValue((Object) 0))) {
            err_newStock.setText("Price is required.");
            err_newStock.setVisible(true);
        } */ else {
            err_newStock.setVisible(true);
            int productId = Integer.parseInt(cmb_productIdStock.getSelectedItem() + "");
            String productName = txt_productNameStock.getText();
            java.sql.Date exDate = java.sql.Date.valueOf(date_productExDate.getDatePicker().getModel().getValue() + "");
            double price = Double.parseDouble(txt_productPriceStock.getText());
            int productStockQuantity = (int) txt_productQuantityStock.getValue();

            Product p = new Product();
            p.setProductId(productId);
            p.setProductName(productName);
            p.setProductPrice(price);
            p.setProductQuantity(productStockQuantity);
            p.setProductExDate(exDate);

            productListArray.add(p);
            ((DefaultTableModel) tbl_stockProduct.getModel()).addRow(
                    new Object[]{p.getProductId(), p.getProductName(), p.getProductPrice(), p.getProductQuantity(), p.getProductExDate()}
            );

            cmb_productIdStock.setSelectedIndex(0);
            txt_productNameStock.setText("");
            date_productExDate.setInitialDate(Date.valueOf(LocalDate.now()));
            txt_productPriceStock.setText("");
            txt_productQuantityStock.setValue(0);
        }


    }//GEN-LAST:event_btn_addProductToStockActionPerformed

    private void viewProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProductMouseClicked
        panel_newProduct.setVisible(false);
        panel_manageProduccts.setVisible(false);
        panel_viewProducts.setVisible(true);

        DefaultTableModel dt = (DefaultTableModel) tbl_productDetails.getModel();
        dt.setColumnCount(0);
        dt.addColumn("Product Id");
        dt.addColumn("Product Name");
        dt.addColumn("Product Type");
        dt.addColumn("Product Description");

        ProductController.getProduct(tbl_productDetails, txt_productSearch.getText());
    }//GEN-LAST:event_viewProductMouseClicked

    private void viewProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProductMousePressed
        newProduct.setBackground(DefaultColor);
        manageProduct.setBackground(DefaultColor);
        viewProduct.setBackground(ClickedColor);
    }//GEN-LAST:event_viewProductMousePressed

    private void btn_stockDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stockDeleteActionPerformed
        if (tbl_stockProduct.getSelectedRowCount() > 0) {
            int[] row_count = tbl_stockProduct.getSelectedRows();
            for (int i = 0; i < row_count.length; i++) {
                if (i > 0) {
                    for (int k = 0; k < row_count.length; k++) {
                        row_count[k] = row_count[k] - 1;
                    }
                }
                int j = row_count[i];
                DefaultTableModel dt = (DefaultTableModel) tbl_stockProduct.getModel();
                int pId = (int) dt.getValueAt(j, 0);
                dt.removeRow(j);

                for (int k = 0; k < productListArray.size(); k++) {
                    Product p = productListArray.get(k);
                    if (p.getProductId() == pId) {
                        productListArray.remove(p);
                    }

                }
            }
        }
    }//GEN-LAST:event_btn_stockDeleteActionPerformed

    private void btn_stockSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stockSaveActionPerformed
        if (JOptionPane.showConfirmDialog(this, "This data can not change after saved. Do you want to recheck?", "Warning", JOptionPane.WARNING_MESSAGE) == JOptionPane.NO_OPTION) {
            int stockId = Integer.parseInt(txt_stockId.getText());
            java.sql.Date date = java.sql.Date.valueOf(date_stockArrival.getDatePicker().getModel().getValue() + "");
            int supplierId = Integer.parseInt(cmb_supplierName.getItemAt(cmb_supplierName.getSelectedIndex()).split("-")[1]);
            Stock stock = new Stock();
            stock.setStockId(stockId);
            stock.setArrivalDate(date);
            stock.setSupplierNo(supplierId);

            stock.setProducts(productListArray);
            StockController stockController = new StockController(stock);
            if (stockController.saveStock()) {
                JOptionPane.showMessageDialog(this, "Successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not saves.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btn_stockSaveActionPerformed

    private void btn_deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteProductActionPerformed
        if (Validator.isSelectedIndex(cmb_productIdProduct.getSelectedIndex())) {
            err_productManage.setText("Product Id is required.");
            err_productManage.setVisible(true);
        } else {
            err_productManage.setVisible(false);
            Product product = new Product();
            product.setProductId(Integer.parseInt(cmb_productIdProduct.getSelectedItem() + ""));
            ProductController productController = new ProductController(product);
            if (productController.deleteProduct()) {
                JOptionPane.showMessageDialog(this, "Successfully deleted.", "Delete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not deleted.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_deleteProductActionPerformed

    private void btn_updateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateProductActionPerformed
        if (Validator.isSelectedIndex(cmb_productIdProduct.getSelectedIndex())) {
            err_productManage.setText("Product Id is required.");
            err_productManage.setVisible(true);
        } else if (Validator.isNull(txt_productNameUpdate.getText()) || Validator.isEmpty(txt_productNameUpdate.getText())) {
            err_productManage.setText("Product Name is required.");
            err_productManage.setVisible(true);
        } else if (Validator.isSelectedIndex(cmb_productTypeUpdate.getSelectedIndex())) {
            err_productManage.setText("Product Type is required.");
            err_productManage.setVisible(true);
        } else if (Validator.isNull(txt_proDisRateUpdate.getText()) || Validator.isEmpty(txt_proDisRateUpdate.getText())) {
            err_productManage.setText("Discount Rate is required.");
            err_productManage.setVisible(true);
        } else {
            err_productManage.setVisible(false);
            Product product = new Product();
            product.setProductId(Integer.parseInt(cmb_productIdProduct.getSelectedItem() + ""));
            product.setProductName(txt_productNameUpdate.getText());
            product.setProductType(cmb_productTypeUpdate.getSelectedItem() + "");
            product.setDiscountRate(Double.parseDouble(txt_proDisRateUpdate.getText()));
            product.setProDescription(txt_productDescriptionUpdate.getText());

            ProductController productController = new ProductController(product);
            if (productController.updateProduct()) {
                JOptionPane.showMessageDialog(this, "Successfully updated.", "Update", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not updated.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_updateProductActionPerformed

    private void btn_productAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productAddActionPerformed
        if (Validator.isNull(txt_productId.getText()) || Validator.isEmpty(txt_productId.getText())) {
            err_newProduct.setText("Product Id is required.");
            err_newProduct.setVisible(true);
        } else if (Validator.isNull(txt_productName.getText()) || Validator.isEmpty(txt_productName.getText())) {
            err_newProduct.setText("Product Name is required.");
            err_newProduct.setVisible(true);
        } else if (Validator.isSelectedIndex(cmb_productType.getSelectedIndex())) {
            err_newProduct.setText("Product Type is required.");
            err_newProduct.setVisible(true);
        } else if (Validator.isNull(txt_proDisRate.getText()) || Validator.isEmpty(txt_proDisRate.getText())) {
            err_newProduct.setText("Discount Rate is required.");
            err_newProduct.setVisible(true);
        } else {
            err_newProduct.setVisible(false);
            Product product = new Product();
            product.setProductId(Integer.parseInt(txt_productId.getText()));
            product.setProductName(txt_productName.getText());
            product.setProductType(cmb_productType.getSelectedItem() + "");
            product.setProDescription(txt_productDescription.getText());

            ProductController productController = new ProductController(product);
            if (productController.saveProduct()) {
                JOptionPane.showMessageDialog(this, "Successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
                lbl_successAddProduct.setVisible(false);
                txt_productId.setText("");
                txt_productName.setText("");
                cmb_productType.setSelectedIndex(0);
                txt_proDisRate.setText("0");
                txt_productDescription.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Not saved.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btn_productAddActionPerformed

    private void btn_cancelProductToStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelProductToStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelProductToStockActionPerformed

    private void btn_saveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveUserActionPerformed
        if (Validator.isSelectedIndex(cmb_empId.getSelectedIndex())) {
            err_newUser.setText("Select a Employee Id.");
            err_newUser.setVisible(true);
        } else if (Validator.isNull(txt_userName.getText()) || Validator.isEmpty(txt_userName.getText())) {
            err_newUser.setText("User Name is required.");
            err_newUser.setVisible(true);
        } else if (Validator.isEmpty(new String (txt_userConPass.getPassword()))) {
            err_newUser.setText("Password is required.");
            err_newUser.setVisible(true);
        } else if ( Validator.isEmpty(new String (txt_userConPass.getPassword()))) {
            err_newUser.setText("Retype the password again to confirm.");
            err_newUser.setVisible(true);
        } else if (!new String(txt_userPass.getPassword()).equals(new String(txt_userConPass.getPassword()))) {
            err_newUser.setText("Password and Confirm password do not match.");
            err_newUser.setVisible(true);
        } else {
            err_newUser.setVisible(false);
            int userId = Integer.parseInt(Service.getNextId(UserController.getLastUser().getUserId() + ""));
            String userName = txt_userName.getText();
            String userType = "nonAdmin";
            if (grp_userType.getSelection().getActionCommand().equals("Admin")) {
                userType = "admin";
            }
            String password = "";

            if (new String(txt_userPass.getPassword()).equals(new String(txt_userConPass.getPassword()))) {
                password = new String(txt_userPass.getPassword());
            }
            int empNo = Integer.parseInt(cmb_empId.getItemAt(cmb_empId.getSelectedIndex()) + "");
            User user = new User(userId, userName, password, userType, empNo);
            UserController userController = new UserController(user);
            if (userController.saveUser()) {
                JOptionPane.showMessageDialog(this, "Successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not saved.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_saveUserActionPerformed

    private void cmb_empIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_empIdActionPerformed
        if (cmb_empId.getSelectedIndex() > 0) {
            txt_empName.setHorizontalAlignment(javax.swing.JTextField.LEADING);
            int selectedItem = Integer.parseInt(cmb_empId.getItemAt(cmb_empId.getSelectedIndex()));
            Employee employee = EmployeeController.getEmployee(selectedItem);
            txt_empName.setText(employee.getEmployeeName());
        } else {
            txt_empName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txt_empName.setText("--------------------");
        }
    }//GEN-LAST:event_cmb_empIdActionPerformed

    private void newUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserMouseClicked

        panel_newUser.setVisible(true);
        panel_manageUser.setVisible(false);
        err_newUser.setVisible(false);

        UserController.loadEmployees(cmb_empId);
    }//GEN-LAST:event_newUserMouseClicked

    private void newUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserMousePressed
        newUser.setBackground(ClickedColor);
        manageUser.setBackground(DefaultColor);
    }//GEN-LAST:event_newUserMousePressed

    private void manageUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMouseClicked
        panel_newUser.setVisible(false);
        panel_manageUser.setVisible(true);

        DefaultTableModel dt = (DefaultTableModel) tbl_userData.getModel();
        dt.setColumnCount(0);
        dt.addColumn("S/No");
        dt.addColumn("User Name");
        dt.addColumn("User Type");
        dt.addColumn("Employee Id");

        UserController.getUser(tbl_userData, txt_userSearch.getText());
    }//GEN-LAST:event_manageUserMouseClicked

    private void manageUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMousePressed
        newUser.setBackground(DefaultColor);
        manageUser.setBackground(ClickedColor);
    }//GEN-LAST:event_manageUserMousePressed

    private void newSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newSupplierMouseClicked
        panel_newSupplier.setVisible(true);
        panel_manageSupplier.setVisible(false);
        err_newSupplier.setVisible(false);
    }//GEN-LAST:event_newSupplierMouseClicked

    private void newSupplierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newSupplierMousePressed
        newSupplier.setBackground(ClickedColor);
        manageSupplier.setBackground(DefaultColor);
    }//GEN-LAST:event_newSupplierMousePressed

    private void manageSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplierMouseClicked
        panel_newSupplier.setVisible(false);
        panel_manageSupplier.setVisible(true);

        DefaultTableModel dt = (DefaultTableModel) tbl_supplierData.getModel();
        dt.setColumnCount(0);
        dt.addColumn("S/No");
        dt.addColumn("Supplier Name");
        dt.addColumn("Contact No");
        dt.addColumn("Email");
        dt.addColumn("Location");

        SupplierController.getSupplpier(tbl_supplierData, txt_supplierSearch.getText());
    }//GEN-LAST:event_manageSupplierMouseClicked

    private void manageSupplierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplierMousePressed
        newSupplier.setBackground(DefaultColor);
        manageSupplier.setBackground(ClickedColor);
    }//GEN-LAST:event_manageSupplierMousePressed

    private void btn_saveSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveSupllierActionPerformed
        if (Validator.isNull(txt_supllierNameAdd.getText()) || Validator.isEmpty(txt_supllierNameAdd.getText())) {
            err_newSupplier.setText("Supplier name is required.");
            err_newSupplier.setVisible(true);
        } else if (Validator.isNull(txt_supllierTPAdd.getText()) || Validator.isEmpty(txt_supllierTPAdd.getText())) {
            err_newSupplier.setText("Contact number is required.");
            err_newSupplier.setVisible(true);
        } else if (Validator.isNull(txt_supplierEmailAdd.getText()) || Validator.isEmpty(txt_supplierEmailAdd.getText())) {
            err_newSupplier.setText("Email Address is required.");
            err_newSupplier.setVisible(true);
        } else if (Validator.isNull(txt_locationAdd.getText()) || Validator.isEmpty(txt_locationAdd.getText())) {
            err_newSupplier.setText("Location is required.");
            err_newSupplier.setVisible(true);
        } else {
            err_newSupplier.setVisible(false);
            Supplier supplier = new Supplier();
            supplier.setSupplierId(Integer.parseInt(Service.getNextId(SupplierController.getLastSupplier().getSupplierId() + "")));
            supplier.setSupplierName(txt_supllierNameAdd.getText());
            supplier.setSupplierTP(txt_supllierTPAdd.getText());
            supplier.setSupplierEmail(txt_supplierEmailAdd.getText());
            supplier.setSupplierLocation(txt_locationAdd.getText());

            SupplierController supplierController = new SupplierController(supplier);
            if (supplierController.saveSupplier()) {
                JOptionPane.showMessageDialog(this, "Successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not saved.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_saveSupllierActionPerformed

    private void txt_supplierSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_supplierSearchKeyReleased
        SupplierController.getSupplpier(tbl_supplierData, txt_supplierSearch.getText());
    }//GEN-LAST:event_txt_supplierSearchKeyReleased

    private void btn_deleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSupplierActionPerformed
        List<Supplier> list = new ArrayList<>();
        if (tbl_supplierData.getSelectedRowCount() > 0) {
            int[] row_count = tbl_supplierData.getSelectedRows();
            for (int i = 0; i < row_count.length; i++) {
                if (i > 0) {
                    for (int k = 0; k < row_count.length; k++) {
                        row_count[k] = row_count[k] - 1;
                    }
                }
                int j = row_count[i];
                DefaultTableModel dt = (DefaultTableModel) tbl_supplierData.getModel();
                int sId = (int) dt.getValueAt(j, 0);
                Supplier supplier = new Supplier();
                supplier.setSupplierId(sId);
                list.add(supplier);
                dt.removeRow(j);
            }
            //  TODO DELETE USER

            boolean flag = true;
            for (int i = 0; i < list.size(); i++) {
                Supplier s = list.get(i);
                SupplierController sc = new SupplierController(s);
                if (!sc.deleteSupplier()) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(this, "Not deleted.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_deleteSupplierActionPerformed

    private void txt_userSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userSearchKeyReleased
        UserController.getUser(tbl_userData, txt_userSearch.getText());
    }//GEN-LAST:event_txt_userSearchKeyReleased

    private void cmb_productIdStockItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_productIdStockItemStateChanged

    }//GEN-LAST:event_cmb_productIdStockItemStateChanged

    private void cmb_productIdStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_productIdStockActionPerformed
        if (cmb_productIdStock.getSelectedIndex() > 0) {
            txt_productNameStock.setHorizontalAlignment(javax.swing.JTextField.LEADING);
            int selectedItem = Integer.parseInt(cmb_productIdStock.getItemAt(cmb_productIdStock.getSelectedIndex()));
            Product product = ProductController.getProduct(selectedItem);
            txt_productNameStock.setText(product.getProductName());
        } else {
            txt_productNameStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txt_productNameStock.setText("--------------------");
        }
    }//GEN-LAST:event_cmb_productIdStockActionPerformed

    private void viewStockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStockMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_viewStockMouseEntered

    private void txt_stockSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_stockSearchMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stockSearchMousePressed

    private void txt_stockSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stockSearchKeyReleased
        StockController.getStock(tbl_stockDetails, txt_stockSearch.getText());
    }//GEN-LAST:event_txt_stockSearchKeyReleased

    private void cmb_productIdProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_productIdProductActionPerformed
        if (cmb_productIdProduct.getSelectedIndex() > 0) {
            int selectedItem = Integer.parseInt(cmb_productIdProduct.getItemAt(cmb_productIdProduct.getSelectedIndex()));
            Product product = ProductController.getProduct(selectedItem);
            txt_productNameUpdate.setText(product.getProductName());
            cmb_productTypeUpdate.setSelectedItem(product.getProductType());
            txt_proDisRateUpdate.setText(product.getDiscountRate() + "");
            txt_productDescriptionUpdate.setText(product.getProDescription());
        } else {
            txt_empName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            txt_empName.setText("--------------------");
        }
    }//GEN-LAST:event_cmb_productIdProductActionPerformed

    private void btn_scanBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scanBarcodeActionPerformed

        lbl_success.setVisible(false);
        Camera camera = new Camera(this, true);
        camera.setLocationRelativeTo(this);
        camera.setVisible(true);
        try {
            int scannedProductId = Integer.parseInt(camera.getCode());
            txt_orderProductId.setText(scannedProductId + "");

            if (ProductController.getProduct(scannedProductId).getProductId() > 0) {
                if (!txt_orderProductId.getText().isEmpty()) {
                    int setId = Integer.parseInt(txt_orderProductId.getText());
                    Product product = ProductController.getProduct(setId);
                    txt_orderProductName.setText(product.getProductName());
                    txt_orderProductPrice.setText(product.getProductPrice() + "");
                    txt_orderProductDisRate.setText(product.getDiscountRate() + "");
                    txt_productDescriptionUpdate.setText(product.getProDescription());
                    lbl_success.setVisible(true);
                } else {
                    txt_orderProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Product not exist in system.", "Error", JOptionPane.ERROR_MESSAGE);
            lbl_success.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            lbl_success.setVisible(false);
        }


    }//GEN-LAST:event_btn_scanBarcodeActionPerformed

    private void txt_orderProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_orderProductIdActionPerformed

    }//GEN-LAST:event_txt_orderProductIdActionPerformed

    private void txt_orderProductIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_orderProductIdKeyReleased


    }//GEN-LAST:event_txt_orderProductIdKeyReleased

    private void txt_orderProductIdCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_orderProductIdCaretPositionChanged

    }//GEN-LAST:event_txt_orderProductIdCaretPositionChanged

    private void txt_invoiceNoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_invoiceNoCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_invoiceNoCaretPositionChanged

    private void txt_invoiceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_invoiceNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_invoiceNoActionPerformed

    private void txt_invoiceNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_invoiceNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_invoiceNoKeyReleased

    private void btn_orderAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderAddActionPerformed

        int productId = Integer.parseInt(txt_orderProductId.getText());
        String productName = txt_orderProductName.getText();
        double price = Double.parseDouble(txt_orderProductPrice.getText());
        int productQuantity = (int) txt_orderProductQuantity.getValue();
        double productDisRate = Double.parseDouble(txt_orderProductDisRate.getText());
        double discountAmount = Double.parseDouble(txt_orderProductDisAmount.getText());
        java.sql.Date exDate = java.sql.Date.valueOf(date_productExDate.getDatePicker().getModel().getValue() + "");
        double total = 0.00;

        Product p = new Product();
        p.setProductId(productId);
        p.setProductName(productName);
        p.setProductPrice(price);
        p.setProductQuantity(productQuantity);
        p.setDiscountRate(productDisRate);
        p.setDiscountAmount(discountAmount);
        p.setProductExDate(exDate);

        productListArray.add(p);
        ((DefaultTableModel) tbl_order.getModel()).addRow(
                new Object[]{p.getProductId(), p.getProductName(), p.getProductPrice(), p.getProductQuantity(), p.getDiscountAmount(), (p.getProductPrice() * p.getProductQuantity() - p.getDiscountRate())}
        );

        if (productListArray != null && !productListArray.isEmpty()) {
            for (int i = 0; i < productListArray.size(); i++) {
                Product x = productListArray.get(i);
                total += x.getProductPrice() * x.getProductQuantity() - x.getDiscountRate();
            }
            lbl_totAmount.setText(total + "");

        } else {
            lbl_totAmount.setText("0.00");
            lbl_paidAmount.setText("0.00");
            lbl_balance.setText("0.00");

        }
        txt_orderProductId.setText("");
        txt_orderProductName.setText("");
        txt_orderProductPrice.setText("");
        txt_orderProductQuantity.getModel().setValue((Object) 0);
        txt_orderProductDisRate.setText("0.00");
        txt_orderProductDisAmount.setText("0.00");
        txt_orderProductTotal.setText("0.00");
        lbl_success.setVisible(false);

    }//GEN-LAST:event_btn_orderAddActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        int invoiceId = Integer.parseInt(txt_invoiceNo.getText());
        Date invoiceDate = Date.valueOf(LocalDate.now());
        Timestamp invoiceTiime = Timestamp.from(Instant.now());
        double total = 0.00;
        for (int i = 0; i < productListArray.size(); i++) {
            Product item = productListArray.get(i);
            total += item.getProductPrice() - item.getDiscountAmount();
        }

        Invoice i = new Invoice();
        i.setInvoiceId(invoiceId);
        i.setInvoiceDate(invoiceDate);
        i.setInvoiceTime(invoiceTiime);
        i.setInvoiceTotal(total);
        i.setUserNo(1);
        i.setProducts(productListArray);

        InvoiceController invoiceController = new InvoiceController(i);
        if (invoiceController.saveInvoice() && StockController.updatetockOnSales(i)) {
            JOptionPane.showMessageDialog(this, "Successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
            txt_paidAmount.setText("");
            ReportController.generate_Billing_Invoice(i.getInvoiceId()+"");
        } else {
            JOptionPane.showMessageDialog(this, "Not saved.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_payActionPerformed

    private void btn_userDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userDeleteActionPerformed

        List<User> list = new ArrayList<>();
        if (tbl_userData.getSelectedRowCount() > 0) {
            int[] row_count = tbl_userData.getSelectedRows();
            for (int i = 0; i < row_count.length; i++) {
                if (i > 0) {
                    for (int k = 0; k < row_count.length; k++) {
                        row_count[k] = row_count[k] - 1;
                    }
                }
                int j = row_count[i];
                DefaultTableModel dt = (DefaultTableModel) tbl_userData.getModel();
                int uId = (int) dt.getValueAt(j, 0);
                User user = new User(uId, "", "", "", 0);
                list.add(user);
                dt.removeRow(j);
            }
            //  TODO DELETE USER

            boolean flag = true;
            for (int i = 0; i < list.size(); i++) {
                User u = list.get(i);
                UserController uc = new UserController(u);
                if (!uc.deleteUser()) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                JOptionPane.showMessageDialog(this, "Not deleted.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_userDeleteActionPerformed

    private void txt_orderProductQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txt_orderProductQuantityStateChanged

        int qty = 0;
        try {
            double disRate = Double.parseDouble(txt_orderProductDisRate.getText());
            qty = (int) txt_orderProductQuantity.getValue();
            double price = Double.parseDouble(txt_orderProductPrice.getText());
            double disAmount = price * (disRate / 100) * qty;
            double total = (price * qty) - disAmount;
            txt_orderProductDisAmount.setText(disAmount + "");
            txt_orderProductTotal.setText(total + "");
        } catch (NumberFormatException e) {
            // JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_txt_orderProductQuantityStateChanged

    private void txt_paidAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paidAmountKeyReleased
        double total = 0.00;
        if (Validator.isPriceVerified(txt_paidAmount.getText())) {
            err_pos.setVisible(false);
            if (productListArray != null && !productListArray.isEmpty()) {
                for (int i = 0; i < productListArray.size(); i++) {
                    Product x = productListArray.get(i);
                    total += x.getProductPrice() * x.getProductQuantity() - x.getDiscountRate();
                }
                lbl_paidAmount.setText(txt_paidAmount.getText());
                double balance = (Double.parseDouble(txt_paidAmount.getText()) - total);
                lbl_balance.setText(balance + "");
            } else {
                lbl_paidAmount.setText(txt_paidAmount.getText());
                lbl_balance.setText(txt_paidAmount.getText());

            }
        } else {
            lbl_paidAmount.setText("#####");
            lbl_balance.setText("#####");
            err_pos.setText("Recheck paid amount feild. Numbers only allowed.");
            err_pos.setVisible(true);
        }

    }//GEN-LAST:event_txt_paidAmountKeyReleased

    private void btn_orderDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderDeleteActionPerformed
        if (tbl_order.getSelectedRowCount() > 0) {
            int[] row_count = tbl_order.getSelectedRows();
            for (int i = 0; i < row_count.length; i++) {
                if (i > 0) {
                    for (int k = 0; k < row_count.length; k++) {
                        row_count[k] = row_count[k] - 1;
                    }
                }
                int j = row_count[i];
                DefaultTableModel dt = (DefaultTableModel) tbl_order.getModel();
                int pId = (int) dt.getValueAt(j, 0);
                dt.removeRow(j);

                for (int k = 0; k < productListArray.size(); k++) {
                    Product p = productListArray.get(k);
                    if (p.getProductId() == pId) {
                        productListArray.remove(p);
                    }

                }
            }
        }
        double total = 0.00;
        if (productListArray != null && !productListArray.isEmpty()) {
            for (int i = 0; i < productListArray.size(); i++) {
                Product x = productListArray.get(i);
                total += x.getProductPrice() * x.getProductQuantity() - x.getDiscountRate();
            }
            lbl_totAmount.setText(total + "");

        } else {
            lbl_totAmount.setText("0.00");
            lbl_paidAmount.setText("0.00");
            lbl_balance.setText("0.00");
        }
    }//GEN-LAST:event_btn_orderDeleteActionPerformed

    private void cmb_stockIdStockReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_stockIdStockReturnActionPerformed
        if (cmb_stockIdStockReturn.getSelectedIndex() > 0) {
            int selectedStockId
                    = Integer.parseInt(cmb_stockIdStockReturn.getItemAt(cmb_stockIdStockReturn.getSelectedIndex()));
            Stock stock = StockController.getStock(selectedStockId);
            Supplier supplier = SupplierController.getSupplier(stock.getSupplierNo());
            List<Reason> listOfReasons = (ArrayList<Reason>) ReasonController.getReturnReasons();
            if (!listOfReasons.isEmpty()) {
                cmb_producctReturnReason.removeAllItems();
                cmb_producctReturnReason.addItem("Select reason of return");
                for (int i = 0; i < listOfReasons.size(); i++) {
                    Reason reason = listOfReasons.get(i);
                    cmb_producctReturnReason.addItem(reason.getReason());
                }
            }
            List<Product> pList = stock.getProducts();
            if (supplier != null) {
                txt_supplierNameReturn.setText(supplier.getSupplierName());
            }
            if (pList != null && !pList.isEmpty()) {
                cmb_productIdStockReturm.removeAllItems();
                cmb_productIdStockReturm.addItem("Select product id");
                for (int i = 0; i < pList.size(); i++) {
                    Product p = pList.get(i);
                    cmb_productIdStockReturm.addItem(p.getProductId() + "");
                }
            }
        }
    }//GEN-LAST:event_cmb_stockIdStockReturnActionPerformed

    private void cmb_productIdStockReturmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_productIdStockReturmActionPerformed

        if (cmb_productIdStockReturm.getSelectedIndex() > 0) {

            int selectedStockId
                    = Integer.parseInt(cmb_stockIdStockReturn.getItemAt(cmb_stockIdStockReturn.getSelectedIndex()));
            int selectedProductId
                    = Integer.parseInt(cmb_productIdStockReturm.getItemAt(cmb_productIdStockReturm.getSelectedIndex()));
            Stock stock = StockController.getStock(selectedStockId);
            List<Product> pList = stock.getProducts();
            for (int i = 0; i < pList.size(); i++) {
                Product p = pList.get(i);
                if (selectedProductId == p.getProductId()) {
                    txt_productNameReturn.setText(p.getProductName());
                    ((SqlDateModel) date_productExDateReturn.getDatePicker().getModel()).
                            setValue(java.sql.Date.valueOf(p.getProductExDate().toString()));
                    txt_productPriceReturn.setText(p.getProductPrice() + "");
                    txt_producctCurrentQuantityReturn.setValue(p.getProductQuantity());
                }
            }
        } else {
            txt_productNameReturn.setText("select product id");
            ((SqlDateModel) date_productExDateReturn.getDatePicker().getModel()).
                    setValue(java.sql.Date.valueOf(LocalDate.now()));
            txt_productPriceReturn.setText("select product id");
            txt_producctCurrentQuantityReturn.setValue(0.00);
        }
    }//GEN-LAST:event_cmb_productIdStockReturmActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed

        if (cmb_producctReturnReason.getSelectedIndex() > 0 && (int) txt_productReturnQuantity.getValue() > 0) {
            int returnId = Integer.parseInt(Service.getNextId(ReturnController.getLastReturn().getReturnId() + ""));
            int stockId = Integer.parseInt(cmb_stockIdStockReturn.getItemAt(cmb_stockIdStockReturn.getSelectedIndex()));
            int productId = Integer.parseInt(cmb_productIdStockReturm.getItemAt(cmb_productIdStockReturm.getSelectedIndex()));
            java.sql.Date returnDate = Date.valueOf(LocalDate.now());
            int returnQuantity = (int) txt_productReturnQuantity.getValue();
            String reason = cmb_producctReturnReason.getItemAt(cmb_producctReturnReason.getSelectedIndex());
            int reasonId = 0;
            List<Reason> listOfReasons = (ArrayList<Reason>) ReasonController.getReturnReasons();
            if (!listOfReasons.isEmpty()) {
                for (int i = 0; i < listOfReasons.size(); i++) {
                    Reason rsn = listOfReasons.get(i);
                    if (reason.equals(rsn.getReason())) {
                        reasonId = rsn.getReasonId();
                    }
                }
            }
            Return rtrn = new Return();
            rtrn.setReturnId(returnId);
            rtrn.setProductId(productId);
            rtrn.setReasonId(reasonId);
            rtrn.setReturnDate(returnDate);
            rtrn.setReturnQuantity(returnQuantity);
            rtrn.setStockId(stockId);
            ReturnController rc = new ReturnController(rtrn);
            if (rc.save() && StockController.updateStockOnReturn(rtrn)) {
                JOptionPane.showMessageDialog(this, "Return saved.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Not Saved.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill the data to make a return.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_returnActionPerformed

    private void btn_scanBarcodeAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scanBarcodeAddProductActionPerformed
        lbl_success.setVisible(false);
        Camera camera = new Camera(this, true);
        camera.setLocationRelativeTo(this);
        camera.setVisible(true);
        try {
            int scannedProductId = Integer.parseInt(camera.getCode());
            txt_productId.setText(scannedProductId + "");

            if (!txt_productId.getText().isEmpty()) {
                int setId = Integer.parseInt(txt_productId.getText());
                lbl_successAddProduct.setVisible(true);

            } else {
                txt_orderProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Barcode not supported.", "Error", JOptionPane.ERROR_MESSAGE);
            lbl_success.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            lbl_success.setVisible(false);
        }
    }//GEN-LAST:event_btn_scanBarcodeAddProductActionPerformed

    private void txt_productIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_productIdKeyReleased
        if (!Validator.allDigits(txt_productId.getText())) {
            err_newProduct.setText("Product Id should have only numbers.");
            err_newProduct.setVisible(true);
        }
        if (Validator.checkLength(txt_productId.getText(), 8)) {
            err_newProduct.setText("Product Id can have maximum of 8 numbers.");
            err_newProduct.setVisible(true);
        } else {
            err_newProduct.setVisible(false);
        }
    }//GEN-LAST:event_txt_productIdKeyReleased

    private void txt_proDisRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_proDisRateKeyReleased
        if (Validator.isDiscountRateVarified(txt_proDisRate.getText())) {
            err_newProduct.setText("Invalid discount rate.");
            err_newProduct.setVisible(true);
        } else {
            err_newProduct.setVisible(false);
        }
    }//GEN-LAST:event_txt_proDisRateKeyReleased

    private void txt_supllierTPAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_supllierTPAddKeyReleased
        if (Validator.isPhoneVerified(txt_supllierTPAdd.getText())) {
            err_newSupplier.setText("Invalid Contact number");
            err_newSupplier.setVisible(true);
        } else {
            err_newSupplier.setVisible(false);
        }
    }//GEN-LAST:event_txt_supllierTPAddKeyReleased

    private void txt_supplierEmailAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_supplierEmailAddKeyReleased
        if (Validator.isEmailVerified(txt_supplierEmailAdd.getText())) {
            err_newSupplier.setText("Invalid Email address");
            err_newSupplier.setVisible(true);
        } else {
            err_newSupplier.setVisible(false);
        }
    }//GEN-LAST:event_txt_supplierEmailAddKeyReleased

    private void btn_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showMouseClicked

        if ((txt_userPass.getEchoChar() == '\u25cf') && (txt_userConPass.getEchoChar() == '\u25cf')) {
            txt_userPass.setEchoChar((char) 0);
            txt_userConPass.setEchoChar((char) 0);
            Icon icon = new ImageIcon("src\\com\\cart\\assest\\icon\\hide.png");
            btn_show.setIcon(icon);

        } else {
            txt_userPass.setEchoChar('\u25cf');
            txt_userConPass.setEchoChar('\u25cf');
            Icon icon = new ImageIcon("src\\com\\cart\\assest\\icon\\show.png");
            btn_show.setIcon(icon);

        }
    }//GEN-LAST:event_btn_showMouseClicked

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_showActionPerformed

    private void btn_incomeReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_incomeReportMouseClicked
        Date dateStart = ((SqlDateModel)date_reportStart.getDatePicker().getModel()).getValue();
        Date dateEnd = ((SqlDateModel)date_reportEnd.getDatePicker().getModel()).getValue();
        if(dateStart.after(dateEnd)) {
            JOptionPane.showMessageDialog(this, "Select date range properly", "Error on input", JOptionPane.ERROR_MESSAGE);
        } else {
            ReportController.generate_Income_Report(dateStart, dateEnd);
        }
    }//GEN-LAST:event_btn_incomeReportMouseClicked

    private void btn_salesReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesReportMouseClicked
        ReportController.generate_Stock_Availability_Report();
    }//GEN-LAST:event_btn_salesReportMouseClicked

    private List<Product> productListArray;
    private User loggedInUser;

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cart.assest.model.PanelBorder Balance;
    private javax.swing.JPanel Buttons;
    private com.cart.assest.model.PanelBorder PayedAmount;
    private javax.swing.JPanel PaymentDetails;
    private com.cart.assest.model.PanelBorder Total;
    private javax.swing.JPanel addSupplier;
    private javax.swing.JPanel addUser;
    private com.cart.assest.model.CustomButton btn_addProductToStock;
    private com.cart.assest.model.CustomButton btn_cancelProductToStock;
    private com.cart.assest.model.CustomButton btn_cancelReturn;
    private com.cart.assest.model.CustomButton btn_cancelSupplier;
    private com.cart.assest.model.CustomButton btn_cancelUser;
    private com.cart.assest.model.CustomButton btn_deleteProduct;
    private com.cart.assest.model.CustomButton btn_deleteSupplier;
    private javax.swing.JLabel btn_incomeReport;
    private com.cart.assest.model.CustomButton btn_orderAdd;
    private com.cart.assest.model.CustomButton btn_orderDelete;
    private com.cart.assest.model.CustomButton btn_pay;
    private com.cart.assest.model.CustomButton btn_productAdd;
    private com.cart.assest.model.CustomButton btn_productCancel;
    private com.cart.assest.model.CustomButton btn_return;
    private javax.swing.JLabel btn_salesReport;
    private com.cart.assest.model.CustomButton btn_saveSupllier;
    private com.cart.assest.model.CustomButton btn_saveUser;
    private com.cart.assest.model.CustomButton btn_scanBarcode;
    private com.cart.assest.model.CustomButton btn_scanBarcodeAddProduct;
    private com.cart.assest.model.CustomButton btn_scanBarcodeStock;
    private javax.swing.JButton btn_searchReport;
    private javax.swing.JButton btn_show;
    private com.cart.assest.model.CustomButton btn_stockDelete;
    private com.cart.assest.model.CustomButton btn_stockSave;
    private com.cart.assest.model.CustomButton btn_updateProduct;
    private com.cart.assest.model.CustomButton btn_userDelete;
    private com.cart.assest.component.Card card1;
    private com.cart.assest.component.Card card2;
    private com.cart.assest.component.Card card3;
    private com.cart.assest.component.Card card4;
    private javax.swing.JComboBox<String> cmb_empId;
    private javax.swing.JComboBox<String> cmb_producctReturnReason;
    private javax.swing.JComboBox<String> cmb_productIdProduct;
    private javax.swing.JComboBox<String> cmb_productIdStock;
    private javax.swing.JComboBox<String> cmb_productIdStockReturm;
    private javax.swing.JComboBox<String> cmb_productType;
    private javax.swing.JComboBox<String> cmb_productTypeUpdate;
    private javax.swing.JComboBox<String> cmb_stockIdStockReturn;
    private javax.swing.JComboBox<String> cmb_supplierName;
    private com.cart.assest.model.CustomButton customButton8;
    private com.cart.assest.model.DatePicker date_productExDate;
    private com.cart.assest.model.DatePicker date_productExDateReturn;
    private com.cart.assest.model.DatePicker date_reportEnd;
    private com.cart.assest.model.DatePicker date_reportStart;
    private com.cart.assest.model.DatePicker date_stockArrival;
    private javax.swing.JLabel err_newProduct;
    private javax.swing.JLabel err_newStock;
    private javax.swing.JLabel err_newSupplier;
    private javax.swing.JLabel err_newUser;
    private javax.swing.JLabel err_pos;
    private javax.swing.JLabel err_productManage;
    private javax.swing.JLabel err_returnStock;
    private javax.swing.ButtonGroup grp_userType;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel label_barcodes;
    private javax.swing.JLabel label_head;
    private javax.swing.JLabel label_home;
    private javax.swing.JLabel label_logout;
    private javax.swing.JLabel label_newProduct;
    private javax.swing.JLabel label_newSt;
    private javax.swing.JLabel label_orders;
    private javax.swing.JLabel label_productList;
    private javax.swing.JLabel label_reports;
    private javax.swing.JLabel label_returnSt;
    private javax.swing.JLabel label_scan;
    private javax.swing.JLabel label_scan1;
    private javax.swing.JLabel label_stock;
    private javax.swing.JLabel label_veiwProducts;
    private javax.swing.JLabel label_veiwProducts1;
    private javax.swing.JLabel label_viewSt;
    private javax.swing.JLabel lbl_balance;
    private javax.swing.JLabel lbl_paidAmount;
    private javax.swing.JLabel lbl_success;
    private javax.swing.JLabel lbl_successAddProduct;
    private javax.swing.JLabel lbl_totAmount;
    private com.cart.assest.model.PanelBorder load_addSupplier;
    private com.cart.assest.model.PanelBorder load_addUser;
    private com.cart.assest.model.PanelBorder load_home;
    private com.cart.assest.model.PanelBorder load_logout;
    private com.cart.assest.model.PanelBorder load_orders;
    private javax.swing.JPanel load_panel;
    private javax.swing.JPanel load_productDetails;
    private com.cart.assest.model.PanelBorder load_productList;
    private com.cart.assest.model.PanelBorder load_reports;
    private com.cart.assest.model.PanelBorder load_stock;
    private javax.swing.JPanel load_stockEntry;
    private javax.swing.JPanel load_supplier;
    private javax.swing.JPanel load_user;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel manageProduct;
    private javax.swing.JPanel manageSupplier;
    private javax.swing.JPanel manageUser;
    private javax.swing.JPanel menuListItems;
    private javax.swing.JPanel newProduct;
    private javax.swing.JPanel newStock;
    private javax.swing.JPanel newSupplier;
    private javax.swing.JPanel newUser;
    private javax.swing.JPanel orders;
    private com.cart.assest.model.PanelBorder panelBorder3;
    private com.cart.assest.model.PanelBorder panelBorder4;
    private javax.swing.JPanel panel_bill;
    private javax.swing.JPanel panel_head;
    private javax.swing.JPanel panel_manageProduccts;
    private javax.swing.JPanel panel_manageSupplier;
    private javax.swing.JPanel panel_manageUser;
    private javax.swing.JPanel panel_menuHead;
    private javax.swing.JPanel panel_newProduct;
    private javax.swing.JPanel panel_newStock;
    private javax.swing.JPanel panel_newSupplier;
    private javax.swing.JPanel panel_newUser;
    private javax.swing.JPanel panel_pos;
    private javax.swing.JPanel panel_returnStock;
    private javax.swing.JPanel panel_viewProducts;
    private javax.swing.JPanel panel_viewStock;
    private javax.swing.JPanel productList;
    private javax.swing.JRadioButton rbtn_admin;
    private javax.swing.JRadioButton rbtn_normal;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel returnStock;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel stocks;
    private com.cart.assest.model.Table tbl_order;
    private com.cart.assest.model.Table tbl_orderHistory;
    private com.cart.assest.model.Table tbl_productDetails;
    private com.cart.assest.model.Table tbl_stockDetails;
    private com.cart.assest.model.Table tbl_stockProduct;
    private com.cart.assest.model.Table tbl_supplierData;
    private com.cart.assest.model.Table tbl_userData;
    private javax.swing.JTextField txt_empName;
    private javax.swing.JTextField txt_invoiceNo;
    private javax.swing.JTextField txt_locationAdd;
    private javax.swing.JTextField txt_orderProductDisAmount;
    private javax.swing.JTextField txt_orderProductDisRate;
    private javax.swing.JTextField txt_orderProductId;
    private javax.swing.JTextField txt_orderProductName;
    private javax.swing.JTextField txt_orderProductPrice;
    private javax.swing.JSpinner txt_orderProductQuantity;
    private javax.swing.JTextField txt_orderProductTotal;
    private javax.swing.JTextField txt_paidAmount;
    private javax.swing.JTextField txt_proDisRate;
    private javax.swing.JTextField txt_proDisRateUpdate;
    private javax.swing.JSpinner txt_producctCurrentQuantityReturn;
    private javax.swing.JTextField txt_productDescription;
    private javax.swing.JTextField txt_productDescriptionUpdate;
    private javax.swing.JTextField txt_productId;
    private javax.swing.JTextField txt_productName;
    private javax.swing.JTextField txt_productNameReturn;
    private javax.swing.JTextField txt_productNameStock;
    private javax.swing.JTextField txt_productNameUpdate;
    private javax.swing.JTextField txt_productPriceReturn;
    private javax.swing.JTextField txt_productPriceStock;
    private javax.swing.JSpinner txt_productQuantityStock;
    private javax.swing.JSpinner txt_productReturnQuantity;
    private javax.swing.JTextField txt_productSearch;
    private javax.swing.JTextField txt_stockId;
    private javax.swing.JTextField txt_stockSearch;
    private javax.swing.JTextField txt_supllierNameAdd;
    private javax.swing.JTextField txt_supllierTPAdd;
    private javax.swing.JTextField txt_supplierEmailAdd;
    private javax.swing.JTextField txt_supplierNameReturn;
    private javax.swing.JTextField txt_supplierSearch;
    private javax.swing.JPasswordField txt_userConPass;
    private javax.swing.JTextField txt_userName;
    private javax.swing.JPasswordField txt_userPass;
    private javax.swing.JTextField txt_userSearch;
    private javax.swing.JPanel viewProduct;
    private javax.swing.JPanel viewStock;
    // End of variables declaration//GEN-END:variables

//    void setLoggedInUser(User loggedInUser) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
}
