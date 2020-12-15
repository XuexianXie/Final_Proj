/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerManager;

import Business.Employee.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CustomerManagerDirectory {
    
    private ArrayList<CustomerManager> cList;

    public CustomerManagerDirectory() {
        cList = new ArrayList();
    }

    public ArrayList<CustomerManager> getcList() {
        return cList;
    }
    
    public CustomerManager createCustomerManager(CustomerManager c){
        
        cList.add(c);
        return c;
    }
    public void deleteCustomerManager(CustomerManager c){
         cList.remove(c);
    }
}