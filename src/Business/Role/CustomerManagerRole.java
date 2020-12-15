/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManagerRole.DeliveryManagerWorkAreaJPanel;
import userinterface.PlatformManagerRole.PlatformManagerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class CustomerManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PlatformManagerWorkAreaJPanel(userProcessContainer, account, enterprise, business);
       //CustomerManagerWorkAreaJPanel售后服务的操作
    }

    @Override
    public JPanel createCustomerWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
