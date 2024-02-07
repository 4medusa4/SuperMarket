package com.cart.view;

import com.cart.controller.LoginController;
import com.cart.controller.UserController;
import com.cart.model.Login;
import com.cart.model.User;
import java.awt.Color;
import java.awt.Image;
import java.util.InputMismatchException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        scaleImage();

        ImageIcon icon = new ImageIcon("src\\com\\cart\\assest\\icon\\cart_colour.png");
        setIconImage(icon.getImage());
        txt_password.setEchoChar('\u25cf');
        err_userName.setVisible(false);
        err_password.setVisible(false);
        //  loginPanel.setBackground(new Color(0, 0, 0, 100)); 
    }

    public void scaleImage() {
        ImageIcon icon = new ImageIcon("src\\com\\cart\\assest\\image\\basket3.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        imgLabel.setIcon(scaledIcon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel2 = new com.cart.assest.model.GradientPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_forPass = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();
        btn_login = new com.cart.assest.model.CustomButton();
        txt_userName = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        err_userName = new javax.swing.JLabel();
        err_password = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        gradientPanel2.setBackground(new java.awt.Color(0, 255, 255));
        gradientPanel2.setC1(new java.awt.Color(255, 51, 153));
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(51, 51, 51));
        loginPanel.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        btn_forPass.setForeground(new java.awt.Color(204, 204, 204));
        btn_forPass.setText("Forgotten Password?");
        btn_forPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_forPass.setContentAreaFilled(false);
        btn_forPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_forPass.setFocusPainted(false);
        btn_forPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_forPassMouseClicked(evt);
            }
        });
        btn_forPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forPassActionPerformed(evt);
            }
        });

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

        btn_login.setBackground(new java.awt.Color(102, 102, 255));
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("L   O   G   I   N");
        btn_login.setColor_bottom(new java.awt.Color(0, 153, 255));
        btn_login.setColor_mouseOver(new java.awt.Color(0, 102, 255));
        btn_login.setColor_mousePressed(new java.awt.Color(153, 204, 255));
        btn_login.setColor_rippleEffect(new java.awt.Color(0, 255, 255));
        btn_login.setColor_top(new java.awt.Color(51, 102, 255));
        btn_login.setCornerRadious(45);
        btn_login.setFocusPainted(false);
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setGradientEffect(true);
        btn_login.setRippleEffect(true);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        txt_userName.setBackground(new java.awt.Color(51, 51, 51));
        txt_userName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(255, 255, 255));
        txt_userName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "User Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_userName.setOpaque(true);
        txt_userName.setPreferredSize(new java.awt.Dimension(64, 50));
        txt_userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_userNameMousePressed(evt);
            }
        });

        txt_password.setBackground(new java.awt.Color(51, 51, 51));
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txt_password.setPreferredSize(new java.awt.Dimension(64, 50));
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passwordMousePressed(evt);
            }
        });

        err_userName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        err_userName.setForeground(new java.awt.Color(252, 83, 83));
        err_userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/errorTinny.png"))); // NOI18N
        err_userName.setText("Error!");
        err_userName.setIconTextGap(10);

        err_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        err_password.setForeground(new java.awt.Color(252, 83, 83));
        err_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/errorTinny.png"))); // NOI18N
        err_password.setText("Error!");
        err_password.setIconTextGap(10);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(err_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_forPass, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(err_password, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(err_userName)
                .addGap(37, 37, 37)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(err_password)
                .addGap(62, 62, 62)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_forPass)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        gradientPanel2.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 30, 540, 550));
        gradientPanel2.add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 521, 440));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supermarket");
        gradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 39, 521, 52));

        btn_close.setBackground(new java.awt.Color(0, 255, 255));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(0, 0, 0));
        btn_close.setText("X");
        btn_close.setToolTipText("Close");
        btn_close.setBorder(null);
        btn_close.setContentAreaFilled(false);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_closeMouseReleased(evt);
            }
        });
        gradientPanel2.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        btn_close.setForeground(Color.red);
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseReleased

    }//GEN-LAST:event_btn_closeMouseReleased

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        btn_close.setForeground(Color.black);
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showMouseClicked
        txt_userName.setBackground(new Color(51, 51, 51));
        txt_password.setBackground(new Color(51, 51, 51));
        if (txt_password.getEchoChar() == '\u25cf') {
            txt_password.setEchoChar((char) 0);
            Icon icon = new ImageIcon("src\\com\\cart\\assest\\icon\\hide.png");
            btn_show.setIcon(icon);

        } else {
            txt_password.setEchoChar('\u25cf');
            Icon icon = new ImageIcon("src\\com\\cart\\assest\\icon\\show.png");
            btn_show.setIcon(icon);

        }
    }//GEN-LAST:event_btn_showMouseClicked

    private void btn_forPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forPassMouseClicked
        txt_password.setBackground(new Color(51, 51, 51));
        txt_password.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btn_forPassMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (txt_userName.getText().isEmpty() || new String(txt_password.getPassword()).isEmpty()) {
            if (txt_userName.getText().isEmpty()) {
                err_userName.setText("Username is required.");
                err_userName.setVisible(true);
            } else {
                err_userName.setText("");
                err_userName.setVisible(false);
            }
            if (new String(txt_password.getPassword()).isEmpty()) {
                err_password.setText("Password is required.");
                err_password.setVisible(true);

            } else {
                err_password.setText("");
                err_password.setVisible(false);
            }
        } else {
            try {
                User loggedInUser = LoginController.login(txt_userName, txt_password);
                if (loggedInUser.getLoginCount() == 1) {
                    PasswordResetSecurityQuestion prsq = new PasswordResetSecurityQuestion(this, true);
                    prsq.setLoggedInUser(loggedInUser);
                    prsq.setLocationRelativeTo(this);
                    this.dispose();
                    prsq.setVisible(true);
                    

                } else {
                    Dashboard dashboard = new Dashboard();
                    dashboard.setLoggedInUser(loggedInUser);
                    this.dispose();
                    dashboard.setVisible(true);
                }
                

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_userNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userNameMousePressed
        txt_userName.setBackground(new Color(35, 35, 35));
        txt_password.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_txt_userNameMousePressed

    private void txt_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMousePressed
        txt_userName.setBackground(new Color(51, 51, 51));
        txt_password.setBackground(new Color(35, 35, 35));
    }//GEN-LAST:event_txt_passwordMousePressed

    private void btn_forPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_forPassActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_showActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_forPass;
    private com.cart.assest.model.CustomButton btn_login;
    private javax.swing.JButton btn_show;
    private javax.swing.JLabel err_password;
    private javax.swing.JLabel err_userName;
    private com.cart.assest.model.GradientPanel gradientPanel2;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
