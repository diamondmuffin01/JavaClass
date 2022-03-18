import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int input=0;
        
        while(input!=1 && input!=2) {
        System.out.print("Press 1 to use console or 2 to use GUI: ");
        input = scan.nextInt();
        
        if(input==1) {
          useConsole(); 
        }
        if(input==2) {
            useGUI();
        }
        
        }
    }
    
 
    
    public static void useConsole(){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        
        System.out.print("What is your interest rate? (ie enter 1.5 for 1.5%): ");
        double intRate = keyboard.nextDouble();
        
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");   

        //formatting
        SavingsAccount bankAccount = new SavingsAccount(balance, intRate);  

        
        //creates new SavingsAccount object to use SavingsAccount methods
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
        
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            
            bankAccount.calcInterest();
            }
        
        
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance());
       
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        
    //   System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
        
        
    }  //end useConsole()
    
    public static void useGUI() {    
    
        String temp;        //used for deposit and withdraw method calls
        String origBal = JOptionPane.showInputDialog("What is your starting balance");
        String intRate = JOptionPane.showInputDialog("What is your interest rate? (ie enter 1.5 for 1.5%)");
        String strCtr = JOptionPane.showInputDialog("How many months do you want to calculate?");
        
        int counter = Integer.parseInt(strCtr);
        SavingsAccount bankAccount = new SavingsAccount(origBal, intRate);
        

        for(int i=1;i<=counter;i++){
            temp = JOptionPane.showInputDialog("Enter Month" + i + " deposits");
            bankAccount.makeDeposit(temp);      
            
            temp = JOptionPane.showInputDialog("Enter Month" + i + " withdraws");
            bankAccount.makeWithdraw(temp);
         
            bankAccount.calcInterest();  //calculates interest each month
            }
            
            
            
            JOptionPane.showMessageDialog(null,String.format("Ending balance: $%,.2f",bankAccount.getBalance()) +
        String.format("\nTotal deposits: $%,.2f",bankAccount.getDeposit()) +
        String.format("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw()));
 //       String.format("\nTotal interest: $%,.2f",bankAccount.getInterest()));
        }




    
    
 
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}