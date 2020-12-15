/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManagerRole;


import userinterface.PlatformManagerRole.*;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Enterprise.DeliveryCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author BY
 */
public class ViewDeliverymanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomerJPanel
     */
    DeliveryMan a;
    private JPanel userProcessContainer;
    private DeliveryCompanyEnterprise Denterprise;
    private DeliveryManDirectory custD;
    private Enterprise enterprise;
    
    public ViewDeliverymanJPanel(JPanel UserProcessContainer,DeliveryMan a, DeliveryManDirectory custD,Enterprise enterprise) {
        initComponents();
        this.a = a;
        this.enterprise = enterprise;
        //this.Denterprise = Denterprise;
        DeliveryCompanyEnterprise Denterprise = (DeliveryCompanyEnterprise)enterprise;
        this.custD = custD;
        this.userProcessContainer = UserProcessContainer;
        userTextField.setText(a.getUsername());
        passTextField.setText(a.getPassword());
        telTextField.setText(a.getTel());
        nameTextField.setText(a.getName());
        savebtn.setEnabled(false);
        updatebtn.setEnabled(true); 
        
    }    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtn = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));

        backbtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/back.png"))); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        Header.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 102, 0));
        Header.setText("View A Delivery Man");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel2.setText("Username:");

        userTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        userTextField.setToolTipText("unqiue numeric string ");
        userTextField.setEnabled(false);

        savebtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        nameTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        nameTextField.setToolTipText("unqiue numeric string ");
        nameTextField.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setText("Name:");

        telTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        telTextField.setToolTipText("unqiue numeric string ");
        telTextField.setEnabled(false);
        telTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setText("Tel:");

        passTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        passTextField.setToolTipText("unqiue numeric string ");
        passTextField.setEnabled(false);
        passTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(Header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(savebtn)
                        .addGap(45, 45, 45)
                        .addComponent(updatebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(55, 55, 55)
                                    .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(53, 53, 53)
                                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(updatebtn))
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1]; 
//[!]the last component in the container, new and refresh table
        manageDeliverymanJPanel manage = (manageDeliverymanJPanel) component;
        manage.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        // parent container layout is passed to previous
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String user = userTextField.getText();
        String tel = telTextField.getText();
        String pass = passTextField.getText();
        String name = nameTextField.getText();
        String ss= "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p1 = Pattern.compile(ss);
        Pattern p2 =Pattern.compile("\\d{6}");
        Pattern p3 = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[?!@#$%&*]).[A-Za-z\\d?!@#$%&*]{6,}");  
        if(!name.equals(a.getName())){
            for(DeliveryMan u:custD.getdList()){
                if(name.equals(u.getName())){
                JOptionPane.showMessageDialog(null, "This Delivery Man name has been used","Warning", JOptionPane.WARNING_MESSAGE);
                name = ""; //represent the same 
                return;
                }
            }
        }
        
        if(!user.equals(a.getUsername())){
        //在这个enterprise里:all useraccount unique username 在这个enterprise里
        for(UserAccount u: enterprise.getUserAccountDirectory().getUserAccountList()){
            if(user.equals(u.getUsername())){
                JOptionPane.showMessageDialog(null, "This username has been used","Warning", JOptionPane.WARNING_MESSAGE);
                user = ""; //represent the same 
                return;
            }
        }
        }
        if(p1.matcher(name).matches()){
            JOptionPane.showMessageDialog(null, "Please input the name of correct format.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(name.equals("") || tel.equals("") ||user.equals("")||pass.equals("")){ // if user don't input any of the text field
            JOptionPane.showMessageDialog(null, "Please add a Delivery Man with all of these information.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if( !p2.matcher(tel).matches()){
            JOptionPane.showMessageDialog(null, "Please input telephone number with 6 digits.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(p1.matcher(user).matches()){
            JOptionPane.showMessageDialog(null, "Please input user name of correct format.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if( !p3.matcher(pass).matches()){
            JOptionPane.showMessageDialog(null, "Please input password at least 6 digits and contain at least one letter, one digit and one special character ?!@#$%&*" ,"Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            a.setName(name);
            a.setTel(tel);
            a.setPassword(pass);
            a.setUsername(user);
            enterprise.getEmployeeDirectory().updateEmployee(a, name);
            enterprise.getUserAccountDirectory().updateUserAccount(user, pass);
            savebtn.setEnabled(false);
            updatebtn.setEnabled(true);
            JOptionPane.showMessageDialog(null, "The delivery man information updated successfully!");      
            
        }
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        userTextField.setEnabled(true);
        nameTextField.setEnabled(true);
        passTextField.setEnabled(true);
        telTextField.setEnabled(true);
        savebtn.setEnabled(true);
        updatebtn.setEnabled(false);
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void telTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telTextFieldActionPerformed

    private void passTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passTextField;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField telTextField;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
