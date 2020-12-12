/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.CustomerManager.CustomerManagerDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class PlatformEnterprise extends Enterprise {
    private CustomerManagerDirectory deliveryManDirectory;
    
    public PlatformEnterprise(String name,CustomerManagerDirectory deliveryManDirectory){
        super(name,EnterpriseType.DeliveryCompany);
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public CustomerManagerDirectory getCustomerManagerDirectory() {
        return deliveryManDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
