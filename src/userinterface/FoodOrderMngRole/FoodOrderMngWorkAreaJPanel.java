/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodOrderMngRole;
import Business.EcoSystem;
import Business.Enterprise.CostumeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodEnterprise;
import Business.Organization.CostumeOrderMng;
import Business.Organization.FoodOrderMng;
import Business.Organization.Organization;
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
 * @author apple
 */
public class FoodOrderMngWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private FoodOrderMng FoodOrderMng;
    
    public ArrayList<WorkRequest> orderList;
    public Enterprise enterprise;
    public FoodEnterprise foodEnterprise;
    public WorkQueue wq;
    public WorkRequest wr;
    /**
     * Creates new form CostumeOrderMngWorkAreaJPanel
     */
    public FoodOrderMngWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Enterprise enterprise, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.FoodOrderMng = (FoodOrderMng)organization;
        foodEnterprise = (FoodEnterprise)enterprise;
        orderList = new ArrayList<WorkRequest>();
        wq = business.getWorkQueue();
        
        for(WorkRequest wr: wq.getWorkRequestList()){          
            if(wr.getOrderList().get(0).getEnt() == foodEnterprise){
                if(wr.getType() != null){
                    if(wr.getStatus().equals("Placed Order")){
                        orderList.add(wr);
                    }
                    else if(wr.getStatus().equals("Send_Back")){
                        orderList.add(wr);
                    }
                    
                }
                else{
                    if(wr.getStatus().equals("Placed Order")){
                        orderList.add(wr);
                    }
                }
                
            }
        }
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        
        
        model.setRowCount(0);
        for(WorkRequest w: orderList){
            Object[] row = new Object[5];
            row[0] = w.getCustomer();
            row[1] = w.getRequestDate();
            row[2] = w.getStatus();
            row[3] = w.getType();
            row[4] = w.getPrice();
            System.out.print("WR SIZE: "+w.getOrderList().size());
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

        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Food Order Table");

        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer", "Order Time", "Status", "Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OrderTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btnView)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnView)
                .addContainerGap(156, Short.MAX_VALUE))
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
            userinterface.FoodOrderMngRole.OrderDetailJPanel pop = new userinterface.FoodOrderMngRole.OrderDetailJPanel(userProcessContainer, business, userAccount, foodEnterprise, wr);
            userProcessContainer.add("WorkRequestJPanel", pop);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            

        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

