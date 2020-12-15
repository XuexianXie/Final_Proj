/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CostumeOrderMngRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author xuexianxie
 */
public class CostumeOrderMng extends Organization{
    
    public CostumeOrderMng() {
        super(Organization.Type.CostumeOrderMng.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CostumeOrderMngRole());
        return roles;
    }
}
