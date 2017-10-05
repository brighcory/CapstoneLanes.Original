/*
 * Project Name:    Capstone Lanes
 * Group:           Art Anderson, Cory Brighton, Mike Gray, Daniel Okenke
 * Purpose:         Class Container for the orderPayment Class
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
public class OrderPayment {

    // Declare a sequence generator to be used for the Employee ID
    public static int transactionSequence;

    // Declare Application designed Attributes
    int transactionID;              // Initially set via sequence generator
    String orderNumber;             // Passed in ledger number for the order
    String paymentDate;             // This date of the transaction
    String paymentMethod;           // Credit Type (MC, Visa, etc.), Check, Cash
    private float paymentAmount;    // Total amount of the payment
    private String accountNumber;   // Card or check number
    private String approvalID;      // Approval from the Payment Service
    private String reasonCode;      // Reason, Approved, Denied, NSF, etc

    // Contructor Method sets initial values of the instantiated class
    public void orderPayment(String orderNumber,
                             String paymentDate,
                             String paymentMethod,
                             float paymentAmount,
                             String accountNumber) {
        this.transactionID = transactionSequence++;
        this.orderNumber   = orderNumber;
        this.paymentDate   = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.accountNumber = accountNumber;
    }

    // Setter Methods to post information to the instantiated class
    // In case of mid transaction cancel or denial, allow for update
    public void updatePayment(String paymentMethod,
                              float paymentAmount,
                              String accountNumber) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.accountNumber = accountNumber;
    }

    // After submittimng the transaction for approval, set the approval ID
    public void updateApprovalID(String approvalID) {
        this.approvalID  = approvalID;
    }

    // After submittimng the transaction for approval, set the Reason Code
    public void updateReasonCode(String reasonCode) {
        this.reasonCode  = reasonCode;
    }

    // Getter Methods to retrieve information from the targeted class instance
    // Getter Methods are needed to restrict access to the attribute
    // Use the toString method to "learn" the instance's ID
    // Get the Amount that was applied to this payment
    public float getPaymentAmount() {
        return this.paymentAmount;
    }

    // Get the Account Number that was applied to this payment
    public String getAccountNumber(String accountNumber) {
        return this.accountNumber;
    }

    // Get the Approval ID from the Payment Service that was applied to this payment
    public String getApprovalID(String approvalID) {
        return this.approvalID;
    }

    // Get the Reason Code from the Payment Service that was applied to this payment
    public String getReasonCode(String reasonCode) {
        return this.reasonCode;
    }

    // Retrieve the last sequence ID counted
    public int getTransactionSequence() {
        return transactionSequence;
    }

    @Override
    public String toString() {
        // return "capstoneLanes.orderPayment[ id=" + this.transactionID + ": " + this.transactionID + " ]";
        return Integer.toString(transactionID);
    }
}
