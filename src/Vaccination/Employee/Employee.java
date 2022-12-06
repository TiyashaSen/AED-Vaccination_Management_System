/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Employee;

/**
 *
 * @author tiyasha
 */
public class Employee {

    private String employeeName;
    private int employeeId;
    private static int count = 1;

    public Employee() {
        employeeId = count;
        count++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    

    @Override
    public String toString() {
        return employeeName;
    }

}
