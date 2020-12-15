package Business;

import Business.CustomerManager.CustomerManager;
import Business.CustomerManager.CustomerManagerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Enterprise.CostumeEnterprise;
import Business.Enterprise.DeliveryCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodEnterprise;
import Business.Enterprise.PlatformEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CostumeOrderMngRole;
import Business.Role.CostumeRetailerMngRole;
import Business.Role.CustomerManagerRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.DeliveryManagerRole;
import Business.Role.FoodOrderMngRole;
import Business.Role.FoodRetailerMngRole;
import Business.Role.PlatformManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        // create sysadmin
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        
        //Create a network
        Network network = system.createAndAddNetwork();
        network.setName("Boston");
        // create a platform 
        Enterprise p1 = network.getEnterpriseDirectory().createAndAddEnterprise("BBX", Enterprise.EnterpriseType.Platform);
        PlatformEnterprise pp1  = (PlatformEnterprise)p1;
        // platform company
        Employee employee1 = pp1.getEmployeeDirectory().createEmployee("platform_YUE");
        UserAccount u1 = pp1.getUserAccountDirectory().createUserAccount("platform1", "platform1", employee1, new PlatformManagerRole());
        
        // platform company
        CustomerManagerDirectory cmD = pp1.getCustomerManagerDirectory();
        CustomerManager cm1 = new CustomerManager("Yue","platformM1","platformM1");
        p1.getEmployeeDirectory().addEmployee(cm1);
        p1.getUserAccountDirectory().createUserAccount("platformM1","platformM1", cm1, new CustomerManagerRole());
        cmD.createCustomerManager(cm1);
        
        
        // Delivery Company
        Enterprise  d1= network.getEnterpriseDirectory().createAndAddEnterprise("Deliver1", Enterprise.EnterpriseType.DeliveryCompany);
        DeliveryCompanyEnterprise dd1  = (DeliveryCompanyEnterprise)d1;
        // create a delivery Organization
        Organization do1 = dd1.getOrganizationDirectory().createOrganization(Organization.Type.Delivery);
        // delivery company
        Employee employee2 = dd1.getEmployeeDirectory().createEmployee("delivery_YUE");
        UserAccount u2 = dd1.getUserAccountDirectory().createUserAccount("delivery1", "delivery1", employee2, new DeliveryManagerRole());
        
        // new useraccount; new employee加到employee dic; new deliveryman 加到deliveryman dirctory
        DeliveryManDirectory custD = dd1.getDeliveryManDirectory();
        DeliveryMan dm1 = new DeliveryMan("Elem","136511","deliveryman1","deliveryman1");
        d1.getEmployeeDirectory().addEmployee(dm1); //dm1 is a employee
        d1.getUserAccountDirectory().createUserAccount("deliveryman1", "deliveryman1", dm1, new DeliverManRole());
        custD.addDeliveryMan(dm1);
        

        
        // Customer        
        Employee cc1 = system.getEmployeeDirectory().createEmployee("c1");
        UserAccount ccc1 = system.getUserAccountDirectory().createUserAccount("c1", "c1", cc1, new CustomerRole());
        ccc1.setName("c1");
        ccc1.setCustomer(true);
        ccc1.setCity("Boston");
        
        
        // Costume Company
        
        Enterprise  ee1= network.getEnterpriseDirectory().createAndAddEnterprise("c", Enterprise.EnterpriseType.Costume);
        CostumeEnterprise ce1  = (CostumeEnterprise) ee1;
        // create a delivery Organization
        Organization co1 = ce1.getOrganizationDirectory().createOrganization(Organization.Type.CostumeSupplier);
        Organization co2 = ce1.getOrganizationDirectory().createOrganization(Organization.Type.CostumeOrderMng);
        // costume supplier
        Employee em1 = co1.getEmployeeDirectory().createEmployee("em1");
        UserAccount ua1 = ce1.getUserAccountDirectory().createUserAccount("em1", "costumes1", em1, new CostumeRetailerMngRole());
        ua1.setName("em1");
        
//        co1.getEmployeeDirectory().addEmployee(em1);
        ce1.setUseraccount(ua1);
        ua1.setEnterpriseName(ee1.getName());
        
        
        
        Employee em2 = co2.getEmployeeDirectory().createEmployee("em2");
        UserAccount ua2 = ce1.getUserAccountDirectory().createUserAccount("em2", "costumes1", em2, new CostumeOrderMngRole());
        ua2.setName("em2");
//        co2.getEmployeeDirectory().addEmployee(em2);
        ce1.setUseraccount(ua2);
        ua2.setEnterpriseName(ee1.getName());
        
        
        
        // Food Company
        
        Enterprise  ee2= network.getEnterpriseDirectory().createAndAddEnterprise("f", Enterprise.EnterpriseType.Food);
        FoodEnterprise fe1  = (FoodEnterprise) ee2;
        // create a delivery Organization
        Organization fo1 = fe1.getOrganizationDirectory().createOrganization(Organization.Type.FoodSupplier);
        Organization fo2 = fe1.getOrganizationDirectory().createOrganization(Organization.Type.FoodOrderMng);
        // costume supplier
        Employee em3 = fo1.getEmployeeDirectory().createEmployee("em3");
        UserAccount ua3 = fe1.getUserAccountDirectory().createUserAccount("em3", "foodsu1", em3, new FoodRetailerMngRole());
        ua3.setName("em3");
        ua3.setEnterpriseName(ee2.getName());
//        fo1.getEmployeeDirectory().addEmployee(em3);
        fe1.setUseraccount(ua3);
        Employee em4 = fo2.getEmployeeDirectory().createEmployee("em4");
        UserAccount ua4 = fe1.getUserAccountDirectory().createUserAccount("em4", "foodsu1", em4, new FoodOrderMngRole());
        ua4.setName("em4");
        ua4.setEnterpriseName(ee2.getName());
        System.out.print("UA Name: "+ ua4.getName());
//        fo2.getEmployeeDirectory().addEmployee(em4);
        fe1.setUseraccount(ua4);
        
        
        return system;
    }
    
}
