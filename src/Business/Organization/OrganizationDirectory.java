/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.CostumeSupplier.getValue())){
            organization = new CostumeSupplier();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CostumeOrderMng.getValue())){
            organization = new CostumeOrderMng();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FoodOrderMng.getValue())){
            organization = new FoodOrderMng();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.FoodSupplier.getValue())){
            organization = new FoodSupplier();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}