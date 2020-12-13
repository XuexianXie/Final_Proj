/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PlatformManagerRole;

import Business.CustomerManager.CustomerManager;
import Business.CustomerManager.CustomerManagerDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PlatformEnterprise;
import Business.Role.CustomerManagerRole;
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

public class CreateCustomerManagerJPanel extends javax.swing.JPanel {
    private CustomerManagerDirectory custd;
    private JPanel userProcessContainer;
    private PlatformEnterprise Denterprise;
    private Enterprise enterprise;
    /**
     * Creates new form CreateCustomerManagerJPanel
     */
    public CreateCustomerManagerJPanel(JPanel userProcessContainer,Enterprise enterprise)  {
        initComponents();
        this.enterprise = enterprise;
        Denterprise = (PlatformEnterprise)enterprise;
        //this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        custd = Denterprise.getCustomerManagerDirectory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        userTextField.setToolTipText("unqiue numeric string ");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Password:");

        passwordTextField.setToolTipText("unqiue numeric string ");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Username:");

        nameTextField.setToolTipText("unqiue numeric string ");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Create Customer Manager");

        savebtn.setBackground(new java.awt.Color(255, 153, 51));
        savebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(286, 286, 286))
            .addGroup(layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(backbtn)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(savebtn)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed

        String name = nameTextField.getText();
        //String tel = userTextField.getText();
        String username = userTextField.getText();
        String pass = passwordTextField.getText();
        //name 不能是special char;  tel 只能是6位数字string
        String ss = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p1 = Pattern.compile(ss);
        //Pattern p2 =Pattern.compile("\\d{6}");
        Pattern p3 =Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[?!@#$%&*]).[A-Za-z\\d?!@#$%&*]{6,}");
        ////No: 所有employee里 不重名
        //同role unique name
        for(CustomerManager u:custd.getcList()){
            if(name.equals(u.getName())){
                JOptionPane.showMessageDialog(null, "This Delivery Man name has been used","Warning", JOptionPane.WARNING_MESSAGE);
                name = ""; //represent the same
                return;
            }
        }
        //在这个enterprise里:all useraccount unique username 在这个enterprise里
        for(UserAccount u: enterprise.getUserAccountDirectory().getUserAccountList()){
            if(username.equals(u.getUsername())){
                JOptionPane.showMessageDialog(null, "This username has been used","Warning", JOptionPane.WARNING_MESSAGE);
                username = ""; //represent the same
                return;
            }
        }

        if(p1.matcher(name).matches()){
            JOptionPane.showMessageDialog(null, "Please input the name of correct format.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(name.equals("")||username.equals("") || pass.equals("") ){ // if user don't input any of the text field
            JOptionPane.showMessageDialog(null, "Please add a Delivery Man with all of these information.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(p1.matcher(username).matches()){
            JOptionPane.showMessageDialog(null, "Please input user name of correct format.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if( !p3.matcher(pass).matches()){
            JOptionPane.showMessageDialog(null, "Please input password at least 6 digits and contain at least one letter, one digit and one special character ?!@#$%&*" ,"Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            CustomerManager a = new CustomerManager(name,username,pass);
            custd.createCustomerManager(a);
            Denterprise.getUserAccountDirectory().createUserAccount(username,pass, a, new CustomerManagerRole());
            Denterprise.getEmployeeDirectory().createEmployee(name);
            JOptionPane.showMessageDialog(null,"Customer manager has added successfully!");
            userTextField.setText("");
            nameTextField.setText("");
            
            passwordTextField.setText("");
        }

    }//GEN-LAST:event_savebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //[!]the last component in the container, new and refresh table
        CustomerServiceJPanel manage = (CustomerServiceJPanel) component;
        manage.populateTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        // parent container layout is passed to previous
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
