/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManagerRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Enterprise.DeliveryCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JPanel;

/**
 *
 * @author BY
 */
public class CreateDeliverymanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomerJPanel
     */
    private DeliveryManDirectory custd;
    private JPanel userProcessContainer;
    private DeliveryCompanyEnterprise Denterprise;
    private Enterprise enterprise;
    //private Organization organization;
    
    public CreateDeliverymanJPanel(JPanel userProcessContainer,DeliveryCompanyEnterprise Denterprise, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.Denterprise = Denterprise;
        //this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        custd = Denterprise.getDeliveryManDirectory();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();

        Header.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 102, 0));
        Header.setText("Add a Delivery Man");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Name:");

        nameTextField.setToolTipText("unqiue numeric string ");

        savebtn.setBackground(new java.awt.Color(255, 153, 51));
        savebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(255, 153, 51));
        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backbtn.setText("< Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Tel:");

        telTextField.setToolTipText("unqiue numeric string ");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Password:");

        passwordTextField.setToolTipText("unqiue numeric string ");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Username:");

        usernameTextField.setToolTipText("unqiue numeric string ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(backbtn)
                .addGap(134, 134, 134)
                .addComponent(Header)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(404, 404, 404))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backbtn)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(savebtn)
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        
        String name = nameTextField.getText();
        String tel = telTextField.getText();
        String username = usernameTextField.getText();
        String pass = passwordTextField.getText();
        //name 不能是special char;  tel 只能是6位数字string      
        String ss = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p1 = Pattern.compile(ss);
        Pattern p2 =Pattern.compile("\\d{6}"); 
        Pattern p3 =Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[?!@#$%&*]).[A-Za-z\\d?!@#$%&*]{6,}"); 
        ////No: 所有employee里 不重名
        //同role unique name
        for(DeliveryMan u:custd.getdList()){
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
        }else if(name.equals("") || tel.equals("") ||username.equals("") || pass.equals("") ){ // if user don't input any of the text field
            JOptionPane.showMessageDialog(null, "Please add a Delivery Man with all of these information.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if( !p2.matcher(tel).matches()){
            JOptionPane.showMessageDialog(null, "Please input telephone number with 6 digits.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(p1.matcher(username).matches()){
            JOptionPane.showMessageDialog(null, "Please input user name of correct format.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if( !p3.matcher(pass).matches()){
            JOptionPane.showMessageDialog(null, "Please input password at least 6 digits and contain at least one letter, one digit and one special character ?!@#$%&*" ,"Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            DeliveryMan a = new DeliveryMan(name,tel,username,pass);
            custd.addDeliveryMan(a);
            Denterprise.getUserAccountDirectory().createUserAccount(username,pass, a, new DeliverManRole());
            Denterprise.getEmployeeDirectory().createEmployee(name);
        //new delivery man add to deliveryman dir, useraccount,employee (organization)
            JOptionPane.showMessageDialog(null,"Delivery Man has added successfully!");
            telTextField.setText("");
            nameTextField.setText("");
            usernameTextField.setText("");
            passwordTextField.setText("");
        }


    }//GEN-LAST:event_savebtnActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField telTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
