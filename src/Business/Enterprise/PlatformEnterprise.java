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
    private CustomerManagerDirectory CusManDirectory;
    
    public PlatformEnterprise(String name,CustomerManagerDirectory CusManDirectory){
        super(name,EnterpriseType.Platform);
        this.CusManDirectory = CusManDirectory;
    }

    public PlatformEnterprise(String name) {
        super(name,EnterpriseType.Platform);
        this.CusManDirectory = new CustomerManagerDirectory();
    }

    public CustomerManagerDirectory getCustomerManagerDirectory() {
        return CusManDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
