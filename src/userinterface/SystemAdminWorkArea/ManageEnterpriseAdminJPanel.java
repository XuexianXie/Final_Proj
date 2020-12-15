/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Costume;
import static Business.Enterprise.Enterprise.EnterpriseType.DeliveryCompany;
import static Business.Enterprise.Enterprise.EnterpriseType.Food;

import static Business.Enterprise.Enterprise.EnterpriseType.Platform;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CostumeRetailerMngRole;
import Business.Role.DeliveryManagerRole;
import Business.Role.FoodRetailerMngRole;
import Business.Role.PlatformManagerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
        //setPictures("E:\\Documents\\NetBeansProjects\\FinalSampleSkeleton\\FinalSampleSkeleton\\image\\manager.png");
                //
    }
    
    private void setPictures(String path){
        int width = 2000;
        int height = 3000;
// 创建BufferedImage对象

        //ImageIcon image = (ImageIcon) jLabel6.getIcon();
        BufferedImage image;
        try {
            image = ImageIO.read(new File(path));
            Graphics2D g2d = (Graphics2D) image.getGraphics();
                    //image.createGraphics();
            image = g2d.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
            g2d.dispose();
            ImageIcon ii = new ImageIcon(image);
            //jLabel6.setIcon(ii);
        } catch (IOException ex) {
            Logger.getLogger(ManageEnterpriseAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
   
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    try{
                    if(userAccount.getRole().toString().equals("Business.Role.PlatformManagerRole") 
                            || userAccount.getRole().toString().equals("Business.Role.DeliveryManagerRole")
                            || userAccount.getRole().toString().equals("Business.Role.FoodRetailerMngRole")
                            || userAccount.getRole().toString().equals("Business.Role.CostumeRetailerMngRole")
                           ){
                        row[0] = enterprise;
                        row[1] = network;
                        row[2] = userAccount;
                        model.addRow(row);
                    }
                    }catch(Exception ee){
                        row[0] = enterprise;
                        row[1] = network;
                        row[2] = "";
                        model.addRow(row);
                    }
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deleteJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setForeground(new java.awt.Color(255, 102, 0));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Network");

        networkJComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        usernameJTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitJButton.setBackground(new java.awt.Color(255, 204, 102));
        submitJButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 102, 0));
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/finish.png"))); // NOI18N
        submitJButton.setText("Create");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        nameJTextField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        passwordJPasswordField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        backJButton.setBackground(new java.awt.Color(255, 153, 51));
        backJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 153, 0));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 204, 102));
        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Manage Enterprise Manager");

        jLabel8.setBackground(new java.awt.Color(255, 204, 102));
        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel8.setText("Create Enterprise Manager");

        deleteJButton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        deleteJButton.setForeground(new java.awt.Color(255, 102, 0));
        deleteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/delete.png"))); // NOI18N
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/managerrr.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(58, 58, 58)
                                .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(80, 80, 80)
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitJButton)
                        .addGap(303, 303, 303))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(backJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        Network net = (Network) networkJComboBox.getSelectedItem();
        /*
        for (Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println(enter.getName());
            if(enter.getName().equals(enterprise.getName())){
                JOptionPane.showMessageDialog(null, "There should be only one admin for each enterprise in this network, choose another enterprise please.","Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }*/
        
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
        String ss = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p1 = Pattern.compile(ss);
        Pattern p3 =Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[?!@#$%&*]).[A-Za-z\\d?!@#$%&*]{6,}"); 
        
        
        //在all network,all exterprise, all useraccount: username unqiue
        //in all network, all enterprise, all organization, all employee: name unique///？不要也行？
        //for (Network network : system.getNetworkList()) {
            for (Enterprise en : net.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o: en.getOrganizationDirectory().getOrganizationList()){
                    for(Employee e: o.getEmployeeDirectory().getEmployeeList()){
                        if(name.equals(e.getName())){
                            JOptionPane.showMessageDialog(null, "This Delivery Man name has been used","Warning", JOptionPane.WARNING_MESSAGE);
                            name = ""; //represent the same 
                            return;
                        }
                    }
                }
                for (UserAccount u : en.getUserAccountDirectory().getUserAccountList()) {
                    if(username.equals(u.getUsername())){
                        JOptionPane.showMessageDialog(null, "This username has been used","Warning", JOptionPane.WARNING_MESSAGE);
                        username = ""; //represent the same 
                        return;
                    }
                }
            }
        //}    
       
        
        if(p1.matcher(name).matches()){
            JOptionPane.showMessageDialog(null, "Please input the name of correct format.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(name.equals("") || password.equals("") ||username.equals("") ){ // if user don't input any of the text field
            JOptionPane.showMessageDialog(null, "Please add a enterprise manager with all of these information.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(p1.matcher(username).matches()){
            JOptionPane.showMessageDialog(null, "Please input user name of correct format.","Warning", JOptionPane.WARNING_MESSAGE);
        }else if( !p3.matcher(password).matches()){
            JOptionPane.showMessageDialog(null, "Please input password at least 6 digits and contain at least one letter, one digit and one special character ?!@#$%&*" ,"Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
            if(enterprise.getEnterpriseType().equals(DeliveryCompany)){
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new DeliveryManagerRole());
                account.setName(name);
                enterprise.setUseraccount(account);
            }
            if(enterprise.getEnterpriseType().equals(Platform)){
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PlatformManagerRole());
                account.setName(name);
                enterprise.setUseraccount(account);
            }
            if(enterprise.getEnterpriseType().equals(Food)){
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FoodRetailerMngRole());
                account.setName(name);
                enterprise.setUseraccount(account);
            }
            if(enterprise.getEnterpriseType().equals(Costume)){
                UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new CostumeRetailerMngRole());
                account.setName(name);
                enterprise.setUseraccount(account);
            }
            
            
            populateTable();
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        int selectedrow = enterpriseJTable.getSelectedRow(); // get selected row number
        if(selectedrow >= 0){
            Network a = (Network)enterpriseJTable.getValueAt(selectedrow, 1);
            Enterprise en = (Enterprise)enterpriseJTable.getValueAt(selectedrow, 0);
            
            //String tt = (String) enterpriseJTable.getValueAt(selectedrow, 2);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this enterprise manager?","Warning",JOptionPane.YES_NO_OPTION);
            //return int value
            if (dialogResult == JOptionPane.YES_OPTION){
                en.getUserAccountDirectory().getUserAccountList().remove(enterpriseJTable.getValueAt(selectedrow, 2));
                
                /*
                //ecosystem.getUserAccountDirectory().removeUserAccount(a.toString());
                for (Network network : system.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if(enterprise.getName().equals(enterpriseJTable.getValueAt(selectedrow, 0))){
                           //delete the useraccount and employee
                           enterprise.getUserAccountDirectory().removeUserAccount((String) enterpriseJTable.getValueAt(selectedrow, 2));
                           //for(Employee e: enterprise.getEmployeeDirectory().getEmployeeList()){
                               //if(e.get)
                           //}
                           //enterprise.getEmployeeDirectory().deleteEmployee(c);
                           //enterprise.getEmployeeDirectory().getEmployeeList().remove(ui)
                            
                        }
                    }

                }*/

                JOptionPane.showMessageDialog(null,"This enterprise manager has been deleted.");
                populateTable();

            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select any row.","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}