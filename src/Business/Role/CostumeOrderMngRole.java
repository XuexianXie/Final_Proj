/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CostumeOrderMngRole.CostumeOrderMngWorkAreaJPanel;

/**
 *
 * @author xuexianxie
 */
public class CostumeOrderMngRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CostumeOrderMngWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }

    @Override
    public JPanel createCustomerWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
