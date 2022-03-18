
public class SavingsAccount
{
 
    double balance;
    double interest;
    
    double deposit;
    double withdraw; 
    
     double monthlyIntRate;

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
    //    monthlyIntRate = (Int/100) / 12;
    }
    
    public SavingsAccount(String Exp1, String Exp2) {
         //int counter = Integer.parseInt(strCtr);
         balance = Double.parseDouble(Exp1);
         interest = Double.parseDouble(Exp2);
    }
    
    /**
     * Methods for console
     */
    
    public void makeDeposit(double Example1) {
        deposit = deposit + Example1;
    }
    
    public void makeWithdraw(double Example2) {
        withdraw = withdraw + Example2;
    }
    
    /**
     * Methods for JOption
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
     * Methods for both
     */
    
    public void calcInterest() {
        
        monthlyIntRate = monthlyIntRate + monthlyIntRate;    
    }
    
    public double getBalance() {
        
        balance = balance + deposit;
        balance = balance - withdraw;
        //balance = balance - monthlyIntRate
        return balance;
        
    }
    
    public double getDeposit() {
        return deposit;
    }
    
    public double getWithdraw() {
        return withdraw;
    }
    
    /*
      public double getInterest() {
        return monthlyIntRate;
    }
    */
  
}
