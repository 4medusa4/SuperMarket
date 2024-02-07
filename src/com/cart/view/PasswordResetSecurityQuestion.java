package com.cart.view;

import com.cart.controller.LoginController;
import com.cart.controller.Validator;
import com.cart.model.SecurityQuestion;
import com.cart.model.User;
import java.util.List;
import javax.swing.JOptionPane;

public class PasswordResetSecurityQuestion extends javax.swing.JDialog {

    private User loggedInUser;

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public PasswordResetSecurityQuestion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btn_saveSQ = new com.cart.assest.model.CustomButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_securityQuestion = new javax.swing.JComboBox<>();
        txt_answer = new javax.swing.JTextField();
        err_securityQuestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SecurityQuestion");
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btn_saveSQ.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveSQ.setText("Save");
        btn_saveSQ.setCornerRadious(15);
        btn_saveSQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_saveSQ.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_saveSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveSQActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 322, 23, 0);
        jPanel1.add(btn_saveSQ, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/security.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 0, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recovery Policy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 266;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 39);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("These can be used to make sure it's really you signing in or to ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 12, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("reach you if there's suspicious activity in your account.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 12, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        cmb_securityQuestion.setBackground(new java.awt.Color(255, 255, 255));
        cmb_securityQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_securityQuestion.setForeground(new java.awt.Color(51, 51, 51));
        cmb_securityQuestion.setBorder(null);
        cmb_securityQuestion.setPreferredSize(new java.awt.Dimension(80, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 12, 0, 0);
        jPanel1.add(cmb_securityQuestion, gridBagConstraints);

        txt_answer.setBackground(new java.awt.Color(255, 255, 255));
        txt_answer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_answer.setForeground(new java.awt.Color(51, 51, 51));
        txt_answer.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 5, 2, 5));
        txt_answer.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_answer.setPreferredSize(new java.awt.Dimension(80, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 326;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 12, 0, 0);
        jPanel1.add(txt_answer, gridBagConstraints);

        err_securityQuestion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        err_securityQuestion.setForeground(new java.awt.Color(252, 83, 83));
        err_securityQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cart/assest/icon/error.png"))); // NOI18N
        err_securityQuestion.setText("Error!");
        err_securityQuestion.setIconTextGap(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 318;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        jPanel1.add(err_securityQuestion, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(875, 446));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        err_securityQuestion.setVisible(false);
        List<SecurityQuestion> questions = LoginController.getQuestions();
        if (!questions.isEmpty()) {
            cmb_securityQuestion.removeAllItems();
            cmb_securityQuestion.addItem("Select Question...");
            for (int i = 0; i < questions.size(); i++) {
                SecurityQuestion q = questions.get(i);
                cmb_securityQuestion.addItem(q.getQustion());
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_saveSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveSQActionPerformed
        if (Validator.isSelectedIndex(cmb_securityQuestion.getSelectedIndex())) {
            err_securityQuestion.setText("Select a security question.");
            err_securityQuestion.setVisible(true);
        } else if(Validator.isNull(txt_answer.getText()) || Validator.isEmpty(txt_answer.getText())) {
            err_securityQuestion.setText("Your answer is required.");
            err_securityQuestion.setVisible(true);
        } 
        else {
            err_securityQuestion.setText("");
            err_securityQuestion.setVisible(false);
            this.loggedInUser.setSecurityQuestionId(cmb_securityQuestion.getSelectedIndex());
            this.loggedInUser.setAnswer(txt_answer.getText());
            if (LoginController.saveSecurityQuestion(loggedInUser)) {

                Dashboard dashboard = new Dashboard();
                dashboard.setLoggedInUser(loggedInUser);
                dashboard.setVisible(true);
            }
            this.dispose();
        }
    }//GEN-LAST:event_btn_saveSQActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cart.assest.model.CustomButton btn_saveSQ;
    private javax.swing.JComboBox<String> cmb_securityQuestion;
    private javax.swing.JLabel err_securityQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_answer;
    // End of variables declaration//GEN-END:variables
}
