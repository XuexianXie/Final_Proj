/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodRetailerMngRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class FoodSupplier extends Organization{
    
    public FoodSupplier() {
        super(Organization.Type.FoodSupplier.getValue());
    }



    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodRetailerMngRole());
        return roles;
    }

}

