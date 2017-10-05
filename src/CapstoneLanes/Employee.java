/*
 * Project Name:    Capstone Lanes
 * Group:           Art Anderson, Cory Brighton, Mike Gray, Daniel Okenke
 * Purpose:         Class Container for the Employee Class
 *                  This is a simple class with attribute, constructors and methods
 *                  More advanced classes would use extentions and inheritance
 *                  This class may be instantiated in main() et.al. as a contructed array
 * Help From:       http://algs4.cs.princeton.edu/13stacks/LinkedStack.java.html
 *
 * History:         04/17/2017: AEA: Create the class with fundamental attributes
 *
*/
package CapstoneLanes;

/**
 *
 * @author CTU Capstone II - Group 2
 */
public class Employee {

    // Declare a sequence generator to be used for the Employee ID
    public static int employeeSequence;

    // Declare Application designed Attributes
    int employeeID;                 // Initially set via sequence generator
    String fullName;                // The employee's full name
    String employeeType;            // Employee Type: FTE, Manager, PT
    private String hireDate;        // Initial Hire Date
    private String password;        // Create instance, defaulted, else user set
    private String securityKey;     // Only set by user

    // Contructor Method sets initial values of the instantiated class
    public int Employee(String fullName,
                        String employeeType,
                        String hireDate,
                        String password) {
        this.employeeID   = employeeSequence++;
        this.fullName     = fullName;
        this.employeeType = employeeType;
        this.hireDate     = hireDate;
        this.password     = password;

        return this.employeeID;
    }

    // Setter Methods to post information to the instantiated class
    // Allow for individual update of the employee's password
    public void updatePassword(String password) {
        this.password     = password;
    }

    // Allow for individual update of the employee's security Key
    public void updateSecurityKey(String securityKey) {
        this.securityKey  = securityKey;
    }

    // Getter Methods to retrieve information from the targeted class instance
    // Getter Methods are needed to restrict access to the attribute
    // Use the toString method to "learn" the instance's ID
    // Get the HireDate
    public String getHireDate() {
        return this.hireDate;
    }

    // Password Check, returns Zero if the values match
    public int validatePassword(String password) {
        return (this.password.compareTo(password));
    }

    // Password Check, returns Zero if the values match
    public int validateSecurityKey(String securityKey) {
        return (this.securityKey.compareTo(securityKey));
    }

    // Retrieve the last sequence ID counted
    public int getEmployeeSequence() {
        return employeeSequence;
    }

    @Override
    public String toString() {
        // return "capstoneLanes.Employee[ id=" + this.employeeID + ": " + this.fullName + " ]";
        return Integer.toString(employeeID);
    }
}
