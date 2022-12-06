/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Employee;

import java.util.ArrayList;

/**
 *
 * @author tiyasha
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employeeList.add(employee);
        return employee;
    }
}
