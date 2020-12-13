/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    public Employee addEmployee(Employee e){
        employeeList.add(e);
        return e;
    }
    
     public void deleteEmployee(Employee c){
         employeeList.remove(c);
    }
     
    public void updateEmployee(Employee c,String name){
        c.setName(name);
    }
     
}