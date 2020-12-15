/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerMngRole;

import Business.CustomerRequst.CustomerRequst;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
//import Business.Role.AdminRole;
import Business.Role.CostumeRetailerMngRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManageCustomerRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    public WorkQueue wq;
    public ArrayList<WorkRequest> orderList;
    public UserAccount enterprise;
    public int Price;
    public WorkRequest wr;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageCustomerRequestJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        wq = system.getWorkQueue();
        orderList = new ArrayList<WorkRequest>();
        
        for(WorkRequest wr: wq.getWorkRequestList()){
            if(wr.getStatus().equals("Cancel")){
                orderList.add(wr);
            }
                
        }
        
        for(WorkRequest wr: orderList){
            System.out.print("\n"+"Customer: "+ wr.getCustomer()+"length of product: "+ wr.getOrderList().size()+"\n");
        }
        
        
        wq = system.getWorkQueue();
        populateTable();
        populateApproveTypeComboBox();
        populateRejectReasonComBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) customerRequestJTable.getModel();
        model.setRowCount(0);
        for(WorkRequest wr: wq.getWorkRequestList()){
            if(wr.getStatus().equals("Cancel")){
                Object[] row = new Object[5];
                row[0] = wr.getCustomer();
                row[1] = wr.getEnterprise();
                enterprise = wr.getEnterprise();
                row[2] = wr.getRequestDate();
                row[3] = wr.getStatus();
                row[4] = wr.getType();
                Price = wr.getPrice();
                model.addRow(row);
            }

        }
        
    }

    private void populateApproveTypeComboBox(){
        approveTypeComboBox.removeAllItems();
        
        approveTypeComboBox.addItem("exchange");
        approveTypeComboBox.addItem("refund");
    }
    
    private void populateRejectReasonComBox() {
        rejectReasonComBox.removeAllItems();
        
        rejectReasonComBox.addItem("past return dates");
        rejectReasonComBox.addItem("Does not meet the return conditions");
        
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
        customerRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        reject = new javax.swing.JButton();
        approve = new javax.swing.JButton();
        approveTypeComboBox = new javax.swing.JComboBox();
        rejectReasonComBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));

        customerRequestJTable.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        customerRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer", "Enterprise", "Time", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerRequestJTable);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        reject.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        reject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/reject.png"))); // NOI18N
        reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectActionPerformed(evt);
            }
        });

        approve.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        approve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/finish.png"))); // NOI18N
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        approveTypeComboBox.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        approveTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        approveTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveTypeComboBoxActionPerformed(evt);
            }
        });

        rejectReasonComBox.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        rejectReasonComBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Approve Type");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Reject Reason");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rejectReasonComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(approveTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(approveTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rejectReasonComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reject, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectActionPerformed
        int index = customerRequestJTable.getSelectedRow();
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Please select one item!");
        }
        else{

            WorkRequest wr = orderList.get(index);
            wr.setStatus("Rejected");
            populateTable();
        }
        
    }//GEN-LAST:event_rejectActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
       int index = customerRequestJTable.getSelectedRow();
       
       if(index < 0){
           JOptionPane.showMessageDialog(null, "Please select one item!");
       }
       else{
            WorkRequest wr = orderList.get(index);
            if(approveTypeComboBox.getSelectedItem() == "exchange"){
                wr.setType("approved");
            }
            else{
                wr.getEnterprise().minusBalance(Price);
                wr.getCustomer().addBalance(Price);
            }
           
           
           wr.setStatus("Approved");
           populateTable();
       }
        
        
    }//GEN-LAST:event_approveActionPerformed

    private void approveTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_approveTypeComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JComboBox approveTypeComboBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable customerRequestJTable;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reject;
    private javax.swing.JComboBox rejectReasonComBox;
    // End of variables declaration//GEN-END:variables


}
