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
 * @author apple
 */
public class FoodEnterprise extends Enterprise{
    
//    public ArrayList<ArrayList<String> > aList =  new ArrayList<ArrayList<String> >(); 
    public ArrayList<Product> aList =  new ArrayList<Product>(); 
    public int Enterprise_Balance = 1000;
    public FoodEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Food);
        Product a1 = new Product(); 
//        a1.setEnt(name);
        a1.setName("Food1"); 
        a1.setPrice(12); 
        a1.setNumber(20);
        aList.add(a1);
        Product a2 = new Product(); 
//        a1.setEnt(name);
        a2.setName("Food2"); 
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
    
    public ArrayList<Product> getFoodList(){
        return aList;
    }
    
    public void setFoodList(ArrayList<Product> aList){
        this.aList = aList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

