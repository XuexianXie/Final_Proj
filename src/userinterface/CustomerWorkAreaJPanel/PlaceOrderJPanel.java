/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerWorkAreaJPanel;

import Business.EcoSystem;
import Business.Enterprise.CostumeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodEnterprise;
import Business.Network.Network;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xuexianxie
 */


public class PlaceOrderJPanel extends javax.swing.JPanel {

    public JPanel userProcessContainer;
    public UserAccount account;
    public EcoSystem business;
    public Network network;
    public ArrayList<Product> orderList;
    public ArrayList<Product> productList;
    public int subtotal = 0;
    public int balance;
    /**
     * Creates new form ManageOrderJPanel
     */
    public PlaceOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        network = business.findNetwork(account.getCity());
        orderList = new ArrayList<Product>();
        productList = new ArrayList<Product>();
        balance = account.getBalance();
        lblBalance.setText(String.valueOf(balance));
        populateEnterpriseComboBox();
        populateMenu();
        recommand();
    }

    public ArrayList<Product> recommand(){
        ArrayList<Product> rec = new ArrayList<Product>();
        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType().getValue().equals("Costume")){
                CostumeEnterprise cp = (CostumeEnterprise) e;
                for(Product p: cp.getCostumeList()){
                    rec.add(p);
                }
            }
            else if(e.getEnterpriseType().getValue().equals("Food")){
                FoodEnterprise cp = (FoodEnterprise) e;
                for(Product p: cp.getFoodList()){
                    rec.add(p);
                }
            }
        }
        
        for(Product p: rec){
            System.out.print("\n"+"Sorted!!!!!Product: "+ p.getName()+"\n" + "Rate: "+p.getScore());
        }
        
        Collections.sort(rec, new Comparator<Product>() {
            @Override
            public int compare(Product c1, Product c2) {
                return Double.compare(c1.getScore(), c2.getScore());
            }
        });

        System.out.print("\n----------------------------\n");
        Collections.reverse(rec);
        for(Product p: rec){
            System.out.print("Product: "+ p.getName()+"\n" + "Rate: "+p.getScore());
        }
        
        
        StringBuilder sb = new StringBuilder();
        for (Product p : rec)
        {
            sb.append(p.getName());
            sb.append("\t");
        }
        
        lblRecommand.setText(sb.toString());
        return rec;
    }
    
    private void populateEnterpriseComboBox(){
        cbbEnt.removeAllItems();
        
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType().getValue().equals(cbbCat.getSelectedItem().toString())){
                cbbEnt.addItem(e.toString());
            }
            
        }
    }
    
    
    public UserAccount getEnterpriseAdmin(){
        String e = (String) cbbEnt.getSelectedItem();
        Enterprise ent = network.findEnterprise(e);
        System.out.print("Enterprise Type: "+ent.getEnterpriseType().getValue());
        if(ent.getEnterpriseType().getValue().equals("Costume")){
            CostumeEnterprise cp = (CostumeEnterprise) ent;
            UserAccount ua = cp.getUseraccount();
            ua.setEnterpriseName(cp.getName());
            return ua;
        }
        else if(ent.getEnterpriseType().getValue().equals("Food")){
            FoodEnterprise cp = (FoodEnterprise) ent;
            UserAccount ua = cp.getUseraccount();
            ua.setEnterpriseName(cp.getName());
            System.out.print("UA: "+ua.getUsername());
            return ua;
        }
        
        return null;
    }
    
    
    
    
    
    
    
    public void populateMenu(){

        DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        
        model.setRowCount(0);
        String e = (String) cbbEnt.getSelectedItem();
        
        Enterprise ent = network.findEnterprise(e);
        if(ent != null){
            if(ent.getEnterpriseType().getValue().equals("Costume")){
                CostumeEnterprise cp = (CostumeEnterprise) ent;
                productList = cp.getCostumeList();
                for (Product p: cp.getCostumeList()){
                    Object[] row = new Object[3];
                    row[0] = p.getName();
                    row[1] = p.getPrice();
                    model.addRow(row);
                }
            }
            else if(ent.getEnterpriseType().getValue().equals("Food")){
                FoodEnterprise cp = (FoodEnterprise) ent;
                productList = cp.getFoodList();
                for (Product p: cp.getFoodList()){
                    Object[] row = new Object[3];
                    row[0] = p.getName();
                    row[1] = p.getPrice();
                    model.addRow(row);
                }
            }
        }

        
    }
    
    public void populateOrderTable(){

        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        
        model.setRowCount(0);
        for(Product p: orderList){
            Object[] row = new Object[3];
            row[0] = p.getName();
            row[1] = p.getNumber();
            row[2] = p.getPrice();
            System.out.print("populate: "+p.getEnt());
            model.addRow(row);
        }
    }
    
    public Enterprise findEnterprise(String str){
        Enterprise e = network.findEnterprise(str);
        return e;
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
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbbEnt = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbCat = new javax.swing.JComboBox<>();
        cbbCount = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPlace = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblRecommand = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Shopping!");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Count", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(OrderTable);
        if (OrderTable.getColumnModel().getColumnCount() > 0) {
            OrderTable.getColumnModel().getColumn(0).setResizable(false);
            OrderTable.getColumnModel().getColumn(1).setResizable(false);
            OrderTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText(" Shopping Cart");

        cbbEnt.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cbbEnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(MenuTable);
        if (MenuTable.getColumnModel().getColumnCount() > 0) {
            MenuTable.getColumnModel().getColumn(0).setResizable(false);
            MenuTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setText("EnterPrise:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel4.setText("Category: ");

        cbbCat.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cbbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Costume" }));
        cbbCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCatActionPerformed(evt);
            }
        });

        cbbCount.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cbbCount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));

        btnAdd.setBackground(new java.awt.Color(255, 204, 153));
        btnAdd.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/cart.png"))); // NOI18N
        btnAdd.setText("Add to cart");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update Count");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Subtotal:");

        lblSubtotal.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSubtotal.setText("0");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("Resize Count:");

        btnPlace.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnPlace.setForeground(new java.awt.Color(255, 102, 0));
        btnPlace.setText("Place Order");
        btnPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Your Balance:");

        lblBalance.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lblBalance.setText("jLabel8");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setText("Recommand Product:");

        lblRecommand.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lblRecommand.setText("jLabel9");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/cart.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/image/645ae3042ae46a6b29c79f6ec6e1b25.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(cbbEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(cbbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(33, 33, 33)
                                            .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(198, 198, 198)
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbbCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnUpdate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(136, 136, 136))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblRecommand)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblBalance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubtotal)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbbCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(btnUpdate))
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(btnPlace))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRecommand)
                        .addComponent(jLabel8)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        int row = MenuTable.getSelectedRow();
        int Ent_row = cbbEnt.getSelectedIndex();
        int count = cbbCount.getSelectedIndex();
        if(row< 0){
            JOptionPane.showMessageDialog(null, "Please select one item!");
        }
        else{
            
            if(count>0){
                Product p = new Product();
                p.setName(productList.get(row).getName());
                p.setNumber(count);
                boolean flag = false;
                for(Product o: orderList){
                    if(o.getName() == p.getName()){
                        flag = true;
                        JOptionPane.showMessageDialog(null, "Please don't select the same item!");
                    }
                }
                if(flag == false){
                    p.setEnt(findEnterprise(cbbEnt.getItemAt(Ent_row)));
                    p.setPrice(productList.get(row).getPrice()*count);
                    orderList.add(p);
                    subtotal += p.getPrice();
                    cbbCount.setSelectedIndex(0);
                    populateOrderTable();
                    lblSubtotal.setText("$ "+String.valueOf(subtotal));
                }

            }

        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceActionPerformed
        // TODO add your handling code here:
        
        boolean placable = true;
        
        if(!orderList.isEmpty()){
            
            Enterprise e = orderList.get(0).getEnt();
            for(Product p: orderList){
                if(p.getEnt()!=e){
                    placable = false;
                    break;
                }

            }
            // No other Enterprise
            if(placable == true){
                if(subtotal <= balance){
                    UserAccount admin = getEnterpriseAdmin();

                    WorkRequest wr = new WorkRequest();
                    ArrayList<Product> orderList_copy = new ArrayList<Product>(orderList);
                    wr.setOrderList(orderList_copy);



                    wr.setCustomer(account);
                    wr.setEnterprise(admin);
                    wr.setStatus("Placed Order");
                    wr.setPrice(subtotal);
                    WorkQueue wq = business.getWorkQueue();
                    wq.add(wr);

                    business.setWorkQueue(wq);


                    account.minusBalance(subtotal);
                    
                    lblBalance.setText(String.valueOf(account.getBalance()));
                    orderList.clear();
                    subtotal =0;
                    cbbCount.setSelectedIndex(0);
                    lblSubtotal.setText("$ "+String.valueOf(subtotal));
                    populateOrderTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Your remain balance is not enough! Please reload your balance!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Select one Enterprise product!");
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Please order something before place order!");
        }


    }//GEN-LAST:event_btnPlaceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int row = OrderTable.getSelectedRow();
        int count = cbbCount.getSelectedIndex();
        // one product price
        int price = 0;
        if(row< 0){
            JOptionPane.showMessageDialog(null, "Please select one item!");
        }
        else{
            
            if(count>0){
                
                
                Product p = orderList.get(row);
                int old_count = p.getNumber();
                p.setNumber(count);
                for(Product prod: productList){
                    if(prod.getName().equals(p.getName())){
                        price = prod.getPrice();
                    }
                }
                
                
                subtotal -= price*old_count;
                subtotal += price*count;
                p.setPrice(price*count);
                
                lblBalance.setText(String.valueOf(balance));
                lblSubtotal.setText("$ "+String.valueOf(subtotal));
                cbbCount.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Update count Successfully!");
                populateOrderTable();
            }

        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = OrderTable.getSelectedRow();
        if(row< 0){
            JOptionPane.showMessageDialog(null, "Please select one item!");
        }
        else{
            Product p= orderList.get(row);
            orderList.remove(p);
            subtotal -= p.getPrice();
            lblSubtotal.setText("$ "+String.valueOf(subtotal));
            cbbCount.setSelectedIndex(0);
            populateOrderTable();
            JOptionPane.showMessageDialog(null, "Delete Successfully!");
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCatActionPerformed
        // TODO add your handling code here:
        populateEnterpriseComboBox();
        populateMenu();
    }//GEN-LAST:event_cbbCatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MenuTable;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPlace;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbCat;
    private javax.swing.JComboBox<String> cbbCount;
    private javax.swing.JComboBox<String> cbbEnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblRecommand;
    private javax.swing.JLabel lblSubtotal;
    // End of variables declaration//GEN-END:variables
}
