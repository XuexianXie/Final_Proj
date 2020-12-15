/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class WorkRequest {

    private ArrayList<Product> orderList;
    private UserAccount customer;
    private UserAccount Enterprise;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int Price;
    private boolean cus2ent = true;
    private UserAccount deliverman;
    private String type;
    private String reason;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserAccount getDeliverman() {
        return deliverman;
    }

    public void setDeliverman(UserAccount deliverman) {
        this.deliverman = deliverman;
    }

    
    public boolean isCus2ent() {
        return cus2ent;
    }

    public void setCus2ent(boolean cus2ent) {
        this.cus2ent = cus2ent;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public ArrayList<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Product> orderList) {
        this.orderList = orderList;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }
    
    public UserAccount getEnterprise() {
        return Enterprise;
    }

    public void setEnterprise(UserAccount Enterprise) {
        this.Enterprise = Enterprise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate() {
        resolveDate = new Date();
        this.resolveDate = resolveDate;
    }
    
}
