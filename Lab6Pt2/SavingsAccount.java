/**
 * SavingsAccount class does the following:
 * 1) Get balance and interest rate from other class, which also gives us our monthly interest rate
 * 2) Next are the arithemetic methods 
 * 3) Finally are the Get Methods
 * 
 * @author Cesar Melero
 * @version v1.0
 * @since 3/18/2022
 * 
*/



public class SavingsAccount
{
 
    double balance;
    double interest;
    
    double deposit;
    double depositCount;
    double withdraw; 
    double withdrawCount;
    
     double monthlyIntRate;
     double mtrAccu;


    /**
     * Constructors for objects of class SavingsAccount
     */
    
    public SavingsAccount()
    {
       interest = 1.5;
    }
    
    public SavingsAccount(double Bal, double Int) {
        balance = Bal; 
        interest = Int; 
        monthlyIntRate = (interest/100) / 12;
    }
    
    public SavingsAccount(String Exp1, String Exp2) {
         //int counter = Integer.parseInt(strCtr);
         balance = Double.parseDouble(Exp1);
         interest = Double.parseDouble(Exp2);
         monthlyIntRate = (interest/100) / 12;
         
    }
    
    /**
     * Methods for console option
     * 
     * Method makeDeposit() takes input and puts it the balance, after which is an accumulator
     * Method makeWithdraw() takes input and takes it out of balance, after which is an accumulator
     * 
     * 
     */
    
    public void makeDeposit(double Example1) {
        deposit = Example1;
        balance = balance + deposit; 
        depositCount = depositCount + deposit;
    }
    
    public void makeWithdraw(double Example2) {
        withdraw = Example2;
        balance = balance - withdraw;  
        withdrawCount = withdrawCount + withdraw;
    }
    
    /**
     * Methods for JOption
     * 
     * Method makeDeposit() takes input and puts it the balance, after which is an accumulator
     * Method makeWithdraw() takes input and takes it out of balance, after which is an accumulator
     * 
     */
    public void makeDeposit(String Example1) {
        double temp = Double.parseDouble(Example1);
        deposit = deposit + temp;
    }
    
    public void makeWithdraw(String Example2) {
        double temp = Double.parseDouble(Example2);
        withdraw = withdraw + temp;
    }
    
    
    
    
    /**
     * (Method for both console or JOption)
     * 
     * Method calcInterest() does arthemtic to balance variable by multplying it by
     * the MonthlyInterestRate. mtrAccu accumulates each monthly interest if balance
     * is not 0.
    */
    
    public void calcInterest() {
        
        double temp;
    
        if(balance>0.0) {
        temp = monthlyIntRate * balance;
        }
        
        else {
            temp = 0;
        }
        
        mtrAccu = mtrAccu + temp;
     
  
    }
    
    
    
    /*
     * Methods below are Get Methods 
     *
     * @return final balance  
    */
    
    public double getBalance() {
        
    
    balance = balance + mtrAccu;
    

        return balance;
        
    }
    
      
   
    /** 
     * @return total deposit
    */
    
    public double getDeposit() {
        return depositCount;
    }
    
     
    /** 
     * @return total withdraw 
    */
    
    
    public double getWithdraw() {
        return withdrawCount;
    }
    
     
    /** 
     * @return final Interest  
    */
    
    
    
      public double getInterest() {
        return mtrAccu;
    }
    
  
}
