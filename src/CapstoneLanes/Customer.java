/*
 * Project Name:    Capstone Lanes
 * Group:           Art Anderson, Cory Brighton, Mike Gray, Daniel Okenke
 * Purpose:         Class Container for the Customer Class
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
public class Customer {

    // Declare a sequence generator to be used for the Employee ID
    public static int customerSequence;

    // Declare Application designed Attributes
    int customerID;                 // Initially set via sequence generator
    String customerName;            // The customer's full name
    String customerAddress;         // The customer's street address
    String customerPhone;           // The customer's contact phone
    String customerType;            // Individual, Business, League
    private String createDate;      // The first transaction date
    private String lastActiveDate;  // The last transaction date
    private float discountRate;     // If a business or league (i.e. 5.25)
    private int customerGrade;      // Integer, 5=great, 4=good, 4=ok, 2=late, 1=delinquint

    // Contructor Method sets initial values of the instantiated class
    public int Customer(String customerName,
                        String customerAddress,
                        String customerPhone,
                        String customerType,
                        String createDate) {
        this.customerID      = customerSequence++;
        this.customerName    = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone   = customerPhone;
        this.customerType    = customerType;
        this.createDate      = createDate;

        return this.customerID;
    }

    // Setter Methods to post information to the instantiated class
    // Allow for individual update form customer activity upon survice or purchase
    public void updateLastActiveDate(String lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }

    // Allow for individual update to permis a dicount rate for the customer
    public void updateDiscountRate(float discountRate) {
        this.discountRate  = discountRate;
    }

    // Allow for individual update of the employee's security Key
    public void updateCustomerGrade(int customerGrade) {
        this.customerGrade  = customerGrade;
    }

    // Getter Methods to retrieve information from the targeted class instance
    // Getter Methods are needed to restrict access to the attribute
    // Use the toString method to "learn" the instance's ID
    // Get the Create Date or this Customer
    public String getCreateDate() {
        return this.createDate;
    }

    // Get the Last Date this Customer transacted business
    public String getLastActiveDate() {
        return this.lastActiveDate;
    }

    // Business and Leagues are priveledged with discounts
    public float getDiscountRate() {
        return this.discountRate;
    }

    // Business and Leagues are priveledged with discounts
    public float getcustomerGrade() {
        return this.customerGrade;
    }

    // Retrieve the last sequence ID counted
    public int getCustomerSequence() {
        return customerSequence;
    }

    @Override
    public String toString() {
        // return "capstoneLanes.Customer[ id=" + this.customerID + ": " + this.customerName + " ]";
        return Integer.toString(customerID);
    }
}
