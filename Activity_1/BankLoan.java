 /** 
    * Blueprint for BankLoan objects. 
    */
public class BankLoan {
  
   // constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   
  /** 
  * Constructor.
  *@param customerNameIn name of customer. 
  *@param interestRateIn interest rate to be used. 
  */
   public BankLoan(String customerNameIn, double interestRateIn) {
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
    /** 
       * method to return the loansCreated class(static) variable. 
       * @return loansCreated
       */
   public static int getLoansCreated() {
      return loansCreated;
   }
    
   /** 
      * method to reset the loansCreated Class variable. 
      */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
    /** 
       * method to validate the 'amount' instance variable. 
       * @return amount
       * @param amount to be validated
       */
   public static boolean isAmountValid(double amount) {   
      return amount >= 0;
   }
   
    /** 
       * method to determin if the cutommer is in debt. 
       * @return boolean
       * @param loan is a BankLoan object
       */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) { 
         return true; 
      }
      return false;
   }
    
    /** 
       * method to subtract the amount borrowed. 
       * @param amount borrowed
       * @return wasLoanMade
       */
   public boolean borrowFromBank(double amount) {
      boolean wasLoanMade = false;
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
      return wasLoanMade;
   }

    /** 
       * method to add payment to loan account.
       * @param amountPaid to loan
       * @return Math.abs(newBalance)
       */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }

    /** 
       * accessor to return balance.
       * @return balance
       */
   public double getBalance() {
      return balance;
   }
   
    /** 
       * mutator method for setting the interest rate. 
       * @return boolean
       * @param interestRateIn rate to be set
       */
   public boolean setInterestRate(double interestRateIn) {
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
    /** 
       * accessor method to return interestRate.
       * @return interestRate 
       */
   public double getInterestRate() {
      return interestRate;
   }
   
    /** 
       * mutator method to add interest to the balance. 
       */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
  
    /** 
       * toString method for displaying the loan attributes. 
       * @return output
       */
   public String toString() {
      String output = "Name: " + customerName + "\r\n"
         + "Interest rate: " + interestRate + "%\r\n"
         + "Balance: $" + balance + "\r\n";
      return output;
   }
}

