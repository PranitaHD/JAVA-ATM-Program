import java.util.Scanner;
public class ATM_Program 
{
    public static void main(String[] args) 
    {
        int balance = 100000 , withdraw , deposit;
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("* * * * * * * AUTOMATED TELLER MACHINE * * * * * * *");
            System.out.println("Options :- ");
            System.out.println("\t  1. Withdraw");
            System.out.println("\t  2. Deposit");
            System.out.println("\t  3. Check Balance");
            System.out.println("\t  4. Exit");
            System.out.print("\nChoose your option : ");
            
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: 
                    System.out.print("Enter money to withdraw : ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money...");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance..!");
                    }
                    System.out.println("");
                    break;
                case 2: 
                    System.out.print("Enter money to deposit : "); 
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited...");
                    System.out.println("");
                    break;
                case 3: 
                    System.out.print("Balance : " + balance + " Rs/-"); 
                    System.out.println("");
                    break;
                case 4: 
                    System.exit(0);
                default: 
                    System.out.println("Invalid Input..!");
                    System.exit(0);
            }
        }
    }
}