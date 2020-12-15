/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;


import Business.Employee.EmployeeDirectory;
import java.util.ArrayList;

/**
 
 * @author harold
 */
public class CustomerDirectory extends EmployeeDirectory{
    private ArrayList<Customer> cusList;

    public CustomerDirectory() {
        cusList = new ArrayList();
    }

    public ArrayList<Customer> getcusList() {
        return cusList;
    }
    
    public Customer createCustomer(String name){
        Customer cs = new Customer();
        cs.setName(name);
        cusList.add(cs);
        return cs;
    }
    public void removeCustomer(Customer c){
        cusList.remove(c);
    }
    
    public Customer findCus(String name){
        for(Customer r: cusList){
            if(r.getName().equals(name)){
                return r;
            }
        }
        System.out.print("No name in useraccountDirectory");
        return null;
    }
}
