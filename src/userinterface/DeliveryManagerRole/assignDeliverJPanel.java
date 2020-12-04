/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManagerRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Enterprise.DeliveryCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryCompanyOrganization;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BY
 */
public class assignDeliverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form assignDeliverJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    private DeliveryCompanyEnterprise Denterprise;
    
    
    public assignDeliverJPanel(JPanel userProcessContainer, DeliveryCompanyEnterprise Denterprise,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.Denterprise = Denterprise;
        
        this.userAccount = userAccount;
        
        displayTable();
        
        jComboBox1.removeAllItems();
        for (DeliveryMan d : Denterprise.getDeliveryManDirectory().getdList()) {
            jComboBox1.addItem(d.toString());
        }
    }
    public final void displayTable(){
        //
        ArrayList<WorkRequest> pd = new ArrayList();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for(WorkRequest a : userAccount.getWorkQueue().getWorkRequestList()){
            if(a.getStatus().equals("processed") || a.getStatus().equals("received"))
                pd.add(a);
            
        }
        for(WorkRequest a :pd){
            Object row[] = new Object[4];
            //row[0] = vs.getDate();
            row[0] = a.getSender(); 
            //Because we need a object element in row to achieve "delete" operation later.
            row[1] = a;
            row[2] = a.getStatus();
            //?request time 无
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
            row[3] = df.format(a.getRequestDate());
            
            dtm.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Message", "Status", "Request Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Orders Assignment");

        btnAssign.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAssign.setText("Assignment");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Choose a delivery man");

        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAssign)))
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addGap(263, 263, 263))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(backbtn)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedrow = jTable1.getSelectedRow(); // get selected row number
        if(selectedrow >= 0){
            WorkRequest a = (WorkRequest)jTable1.getValueAt(selectedrow, 1);
            String selected =(String) jComboBox1.getSelectedItem();
            //find the combobox selected deliver man name - user account username
            if(a.getStatus().equals("received")){
                JOptionPane.showMessageDialog(null, "The order has assigned to another delivery man.");
        
            }
            //|| a.getReceiver().equals(r)
            //find the user account of the delivery man, add work request on its work queue
            for(UserAccount r:Denterprise.getUserAccountDirectory().getUserAccountList()){
                if(r.getUsername().equals(selected)){
                    r.getWorkQueue().addWorkRequest(a);
                    a.setReceiver(r);
                    a.setStatus("received");
                    JOptionPane.showMessageDialog(null, "The order is assigned to the delivery man.");
                    displayTable();
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select any row.","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btnAssign;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
