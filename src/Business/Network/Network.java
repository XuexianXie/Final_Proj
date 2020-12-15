/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Product> productDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        productDirectory = new ArrayList<Product>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public ArrayList<Product> getProductDirectory(){
        return productDirectory;
    }
    
    
    
    public Enterprise findEnterprise(String n){
        for(Enterprise e: enterpriseDirectory.getEnterpriseList()){
            if(e.toString().equals(n)){
                return e;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
