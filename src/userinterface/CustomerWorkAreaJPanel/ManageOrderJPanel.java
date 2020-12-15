/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerWorkAreaJPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xuexianxie
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    public JPanel userProcessContainer;
    public UserAccount account;
    public EcoSystem business;
    public Network network;
    public ArrayList<WorkRequest> orderList;
    public WorkRequest wr = new WorkRequest();
    public WorkQueue wq;
    
    
    /**
     * Creates new form ManageOrderJPanel
     */
    public ManageOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        orderList = new ArrayList<WorkRequest>();
        wq = business.getWorkQueue();
        for(WorkRequest wr: wq.getWorkRequestList()){
            if(wr.getCustomer() == account){
                orderList.add(wr);
            }
        }
        populateOrderTable();
        populateApproveTypeComboBox();
        populateCbbType();
    }
    
    private void populateApproveTypeComboBox(){
        cbbReason.removeAllItems();
        cbbReason.addItem("Wrong item inside");
        cbbReason.addItem("Quality Issue");
    }
    private void populateCbbType(){
        cbbType.removeAllItems();
        cbbType.addItem("Refund");
        cbbType.addItem("Exchange");
    }
    public void populateOrderTable(){

        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        
        
        model.setRowCount(0);
        for(WorkRequest w: orderList){
            Object[] row = new Object[4];
            row[0] = w.getEnterprise();
            row[1] = w.getStatus();
            row[2] = w.getRequestDate();
            row[3] = w.getPrice();
            for(Product p: w.getOrderList()){
                System.out.print(p.getScore());
            }
            
            model.addRow(row);
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
        OrderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cbbReason = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbType = new javax.swing.JComboBox<>();
        btnSend = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise", "Status", "Date", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(OrderTable);
        if (OrderTable.getColumnModel().getColumnCount() > 0) {
            OrderTable.getColumnModel().getColumn(0).setResizable(false);
            OrderTable.getColumnModel().getColumn(1).setResizable(false);
            OrderTable.getColumnModel().getColumn(2).setResizable(false);
            OrderTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Order Table");

        btnView.setText("View Detail");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnCancel.setText("Service");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cbbReason.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbReasonActionPerformed(evt);
            }
        });

        jLabel2.setText("Reason:");

        jLabel3.setText("Refund/Exchange:");

        cbbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSend.setText("Send Package");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("YuGothic", 0, 12)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/back.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(btnBack1)
                            .addGap(258, 258, 258)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnView)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSend)
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbbReason, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbbType, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(jLabel2)
                    .addComponent(cbbReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnCancel)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int row = OrderTable.getSelectedRow();
        if(row< 0){
            JOptionPane.showMessageDialog(null, "Please select one item!");
            
        }
        else{
            
            wr = orderList.get(row);
            if(wr.getStatus().equals("Delivered")){
                WorkRequestJPanel pop = new WorkRequestJPanel(userProcessContainer, account, business, wr);
                userProcessContainer.add("WorkRequestJPanel", pop);

                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Not the review time!");
            }

            
            

        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int row = OrderTable.getSelectedRow();
        if(row< 0){
            JOptionPane.showMessageDialog(null, "Please select one item!");
        }
        else{
            
            wr = orderList.get(row);
            if(wr.getType() == null){
                if(wr.getStatus().equals("Placed Order")){
                    wr.setCus2ent(true);
                    wr.setReason(cbbReason.getSelectedItem().toString());
                    wr.setType(cbbType.getSelectedItem().toString());
                    wr.setStatus("Cancel");
                    populateOrderTable();
                    JOptionPane.showMessageDialog(null, "Submit Service Request Successfully!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "You can cancel your order after place one!");
            }
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbbReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbReasonActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        int row = OrderTable.getSelectedRow();
        if(row< 0){
            JOptionPane.showMessageDialog(null, "Please select one item!");
        }
        else{
            wr = orderList.get(row);
            if(wr.getType() != null){
                if(wr.getStatus().equals("Approved") && wr.getType().equals("approved")){
                    wr.setStatus("Send_Back");
                    populateOrderTable();
                    JOptionPane.showMessageDialog(null, "Send back package Successfully!");
                }else{
                    JOptionPane.showMessageDialog(null, "Refund doesn't need to refund!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "You can not send package right now!");
            }
            

        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);     
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cbbReason;
    private javax.swing.JComboBox<String> cbbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
