/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    
    public enum RoleType{
        
        CostumeRetaierMngRole("CostumeRetaierMngRole"),
        CostumeOrderMngRole("CostumeOrderMngRole"),
        CustomerRole("CustomerRole"),
        FoodRetailerMngRole("FoodRetailerMngRole"),
        FoodOrderMngRole("FoodOrderMngRole"),
        DeliveryManagerRole("DeliveryManagerRole"),
        DeliveryManRole("DeliveryManRole"),
        PlatformManagerRole("PlatformManagerRole"),
        CustomerManagerRole("CustomerManagerRole");
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
    
    public abstract JPanel createCustomerWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}