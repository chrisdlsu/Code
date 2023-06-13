import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {

        // instantiation for bank account object
        BankAccount personA;

        // variables for containing user input
        int accountID;
        String accountName;
        double cashBalance;

        
        //create scanner instance
        Scanner sc = new Scanner(System.in);

        // asking for values
        System.out.print("Enter an Account Name ");
        accountName = sc.nextLine();

        System.out.print("Enter an account ID ");
        accountID = sc.nextInt();

        System.out.print("Enter an initial balance ");
        cashBalance = sc.nextDouble();

        // populating values of object from user input
        personA = new BankAccount(accountID, accountName, cashBalance);
        System.out.println("Account created. Account summary:");
        System.out.println(personA.inquireBalance());

        // TESTS
        // credit tests
        personA.setCredit(0); // tests for zero value
        System.out.println(personA.inquireBalance());

        // debit test
        personA.setDebit(46); // tests for value more than is available; test assumes 45 as Balance
        System.out.println(personA.inquireBalance());

        //scanner close
         sc.close();
    }
}