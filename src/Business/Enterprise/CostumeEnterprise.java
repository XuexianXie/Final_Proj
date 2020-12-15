/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Product.Product;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author xuexianxie
 */
public class CostumeEnterprise extends Enterprise{
    
    public ArrayList<Product> aList =  new ArrayList<Product>(); 


    public int Enterprise_Balance = 1000;

    public CostumeEnterprise(String name){
        super(name,EnterpriseType.Costume);
        
        Product a1 = new Product(); 
//        a1.setEnt();
        System.out.print("CostumeEnt: "+name);
        a1.setName("Shirt"); 
        a1.setPrice(12); 
        a1.setNumber(20);
        aList.add(a1);
        Product a2 = new Product(); 
//        a2.setEnt(name);
        a2.setName("Shoes"); 
        a2.setPrice(12); 
        a2.setNumber(20);
        aList.add(a2);
    }

    public int getEnterprise_Balance() {
        return Enterprise_Balance;
    }

    public void setEnterprise_Balance(int Enterprise_Balance) {
        this.Enterprise_Balance = Enterprise_Balance;
    }

    @Override
    public UserAccount getUseraccount() {
        return useraccount;
    }

    @Override
    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }
    
    
    public ArrayList<Product> getCostumeList(){
        return aList;
    }
    
    public void setCostumeList(ArrayList<Product> a){
        aList = a;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
