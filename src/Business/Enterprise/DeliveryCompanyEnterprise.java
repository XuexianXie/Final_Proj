/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class DeliveryCompanyEnterprise extends Enterprise {
    private DeliveryManDirectory deliveryManDirectory;
    
    public DeliveryCompanyEnterprise(String name,DeliveryManDirectory deliveryManDirectory){
        super(name,EnterpriseType.DeliveryCompany);
        this.deliveryManDirectory = deliveryManDirectory;
    }

    DeliveryCompanyEnterprise(String name) {
        super(name,EnterpriseType.DeliveryCompany);
        this.deliveryManDirectory = new DeliveryManDirectory();
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
