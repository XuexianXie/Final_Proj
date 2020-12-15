/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerManager;

import Business.DeliveryMan.*;
import Business.Employee.Employee;

/**
 *
 * @author harold
 */
public class CustomerManager extends Employee{
    private String name;
    //private String tel;
    private String username;
    private String password;
    
    public CustomerManager(String name, String username, String password) {
        this.name = name;
        //this.tel = tel;
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

   
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
