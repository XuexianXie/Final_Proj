/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author xuexianxie
 */
public class CostumeEnterprise extends Enterprise{
    
    public ArrayList<ArrayList<String> > aList =  new ArrayList<ArrayList<String> >(); 
    public CostumeEnterprise(String name){
        super(name,EnterpriseType.Costume);
        ArrayList<String> a1 = new ArrayList<String>(); 
        a1.add("Shirt"); 
        a1.add("10"); 
        aList.add(a1);
        ArrayList<String> a2 = new ArrayList<String>(); 
        a2.add("Shoes"); 
        a2.add("10"); 
        aList.add(a2);
    }
    
    public ArrayList<ArrayList<String>> getCostumeList(){
        return aList;
    }
    
    public void setCostumeList(ArrayList<ArrayList<String>> a){
        aList = a;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
