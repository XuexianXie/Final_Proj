package Business;

import Business.CustomerManager.CustomerManager;
import Business.CustomerManager.CustomerManagerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Enterprise.DeliveryCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PlatformEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CustomerManagerRole;
import Business.Role.DeliveryManagerRole;
import Business.Role.DeliverManRole;
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
        Network network = system.createAndAddNetwork();
        network.setName("Boston");
        Enterprise p1 = network.getEnterpriseDirectory().createAndAddEnterprise("Boston_platform", Enterprise.EnterpriseType.Platform);
        //Create a network
        Enterprise  d1= network.getEnterpriseDirectory().createAndAddEnterprise("SF", Enterprise.EnterpriseType.DeliveryCompany);
        //create an enterprise
        Organization do1 = d1.getOrganizationDirectory().createOrganization(Organization.Type.Delivery);
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin0!", employee, new SystemAdminRole());
        
        //platform company
        Employee employee1 = p1.getEmployeeDirectory().createEmployee("platform_YUE");
        UserAccount u1 = p1.getUserAccountDirectory().createUserAccount("platform1", "platform1!", employee1, new PlatformManagerRole());
        
        PlatformEnterprise pp1  = (PlatformEnterprise)p1;
        CustomerManagerDirectory cmD = pp1.getCustomerManagerDirectory();
        CustomerManager cm1 = new CustomerManager("Yue","platformM1","platformM1!");
        p1.getEmployeeDirectory().addEmployee(cm1);
        p1.getUserAccountDirectory().createUserAccount("platformM1","platformM1!", cm1, new CustomerManagerRole());
        cmD.createCustomerManager(cm1);
        
        
        //delivery company
        Employee employee2 = d1.getEmployeeDirectory().createEmployee("delivery_YUE");
        UserAccount u2 = d1.getUserAccountDirectory().createUserAccount("delivery1", "delivery1!", employee2, new DeliveryManagerRole());
       
//d1
//new useraccount; new employee加到employee dic; new deliveryman 加到deliveryman dirctory
        DeliveryCompanyEnterprise dd1  = (DeliveryCompanyEnterprise)d1;
        DeliveryManDirectory custD = dd1.getDeliveryManDirectory();
        DeliveryMan dm1 = new DeliveryMan("Elem","136511","deliveryman1","deliveryman1!");
        d1.getEmployeeDirectory().addEmployee(dm1); //dm1 is a employee
        d1.getUserAccountDirectory().createUserAccount("deliveryman1", "deliveryman1!", dm1, new DeliverManRole());
        custD.addDeliveryMan(dm1);
        
        
        
        
        return system;
    }
    
}
