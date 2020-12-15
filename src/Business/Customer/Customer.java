/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
//import Business.WorkQueue.Order;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author harold
 */
public class Customer extends Employee{
    private String name;
    public int cusid;
    public static int cuscount = 1;
    
    private WorkQueue workQueue;


    public Customer() {
        cusid = cuscount;
   
        cuscount++;

        
        workQueue = new WorkQueue();
        
    }

    public WorkQueue getOrderList() {
        return workQueue;
    }

    public void setOrderList(WorkQueue w) {
        this.workQueue = w;
    }
    
    public WorkRequest findOrderByTime(Date time){
        for(WorkRequest o: workQueue.getWorkRequestList()){
            if(o.getRequestDate().compareTo(time) == 0){
                return o;
            }
        }
        return null;
    }


    @Override
    public int getId() {
        return cusid;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
