import java.util.Scanner;


public class BankApplication {

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Paden Anderson", "35147");
        obj1.showMenu();
    }
}

class BankAccount 
{
    int balance;
    String previousTransaction = "No Previous Transaction";
    String customerName;
    String customerID;



    
    
    BankAccount(String cname, String cid)
    {
        customerName =  cname;
        customerID = cid;
    }
    
    void deposit(int amount)
    {
        if (amount > 0)
        {
            balance += amount;
            previousTransaction = "Deposited " + amount;
        }
    }

    void withdraw(int amount)
    {
        if (amount > 0)
        {
            balance -= amount;
            previousTransaction = "Withrdrew $" + amount;
        }
    }
    void getPreviousTransaction()
    {
        System.out.println(previousTransaction);
    }

    void showMenu()
    {
        char option = '\0';
        Scanner  scanner= new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");


        do
        {
            System.out.println("Enter the letter that corrisponds with your option");
            System.out.println("==================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");


            switch(option)

            {
                case 'A':
                    System.out.println("==================================================");
                    System.out.println("Your Balance is $" + balance);
                    break;

                case 'B':
                    System.out.println("==================================================");
                    System.out.println("Enter an amount to Deposit");
                    System.out.println("\n");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    break;

                case 'C':
                    System.out.println("==================================================");
                    System.out.println("Enter an amount to Withdraw");
                    System.out.println("\n");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    break;

                case 'D':
                    System.out.println("==================================================");
                    getPreviousTransaction();
                    break;

                case 'E':
                    System.out.println("==================================================");
                    break;    

                default:
                    System.out.println("Invalid option! Please enter again");
                    break;

                
            }
        }while(option != 'E');

        System.out.println("Thank you for using our services");

    }
}
