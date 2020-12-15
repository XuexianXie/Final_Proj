/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.CustomerRequst.CustomerRequst;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private UserAccountDirectory useraccountDirectory;
    private ArrayList<CustomerRequst> customerRequstList;

    public EcoSystem(UserAccountDirectory useraccountDirectory, String name) {
        super(name);
        this.useraccountDirectory = useraccountDirectory;
    }
    
    public CustomerRequst createAndAddCustomerRequst(){
        CustomerRequst customerRequst = new CustomerRequst();
        if (customerRequstList == null){
            customerRequstList = new ArrayList<>();
        }
        customerRequstList.add(customerRequst);
        return customerRequst;
    }
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    
   
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        customerRequstList=new ArrayList<CustomerRequst>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public ArrayList<CustomerRequst> getCustomerRequsts() {
        return customerRequstList;
    }
    
    public Network findNetwork(String n){
        for(Network nw: networkList){
            if(nw.toString().equals(n)){
                return nw;
            }
        }
        return null;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    @Override
    public UserAccountDirectory getUserAccountDirectory() {
        
        return userAccountDirectory;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
