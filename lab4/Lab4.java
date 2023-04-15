import java.util.*;
import java.sql.Timestamp;

public class Lab4 {
    static String Name;
    static int Acc_no;
    static int Balance;
    static Scanner obj = new Scanner(System.in);

    static void details() {

        System.out.println("Enter the Name:");
        Name = obj.nextLine();
        System.out.println("Enter the account number:");
        Acc_no = Integer.parseInt(obj.nextLine());
        System.out.println("Enter the balance:");
        Balance = Integer.parseInt(obj.nextLine());

    }

    static String deposit(int amount, String trans[], Timestamp timestamp, int count, String values) {
        Balance = Balance + amount;
        System.out.println("Your balance amount is " + Balance);
        trans[count] = timestamp+" "+amount+" "+"Deposited, Available balance is"+Balance;
        values = Balance+"+"+trans;
        return values;

    }

    static String withdraw(int amount, String trans[], Timestamp timestamp, int count, String values) {
        if (amount <= Balance) {
            Balance = Balance - amount;
            System.out.println("Your balance amount is " + Balance);
            System.out.println("Money withdrawn");
            trans[count] = timestamp+" "+amount+" "+"Deposited, Available balance is"+Balance;
            values = Balance+"+"+trans;
        } else {
            System.out.println("Insufficient Balance");
        }
        return values;

    }

    static void Transactions(String trans[], int count) {
        System.out.println("Transaction");
        for (int i =0; i<count; i++){
        System.out.println(trans[i]);
    }
    System.out.println("End of transaction");
}

    static void accountSummary() {
        System.out.println("Account Holder:" + Name);
        System.out.println("Account Number:" + Acc_no);
        System.out.println("Balance:" + Balance);
    }

    public static void main(String[] args) {
        char choice;
        int amount,option;
        int count = 0;
        String[] arr;
        String values = "";
        String trans[] = new String[20];
        details();

        do {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            System.out.println("Options to Perform");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Print transaction");
            System.out.println("4. Print account summary");
            System.out.println("Enter a option");
            option = Integer.parseInt(obj.nextLine());
            switch (option) {

                case 1: {
                    System.out.println("Money deposit");
                    System.out.println("Enter the money u want to deposit");
                    amount = Integer.parseInt(obj.nextLine());
                    values = deposit(amount, trans, timestamp,count, values);
                    arr = values.split("\\+");
                    Balance = Integer.parseInt(arr[0]);
                    count ++;
                    trans[count] = arr[1];
                    break;
                }
                case 2: {
                    System.out.println("Money Withdrawl");
                    System.out.println("Enter the money u want to withdrawl");
                    amount = Integer.parseInt(obj.nextLine());
                    values = withdraw(amount, trans, timestamp, count, values);
                    arr = values.split("\\+");
                    Balance = Integer.parseInt(arr[0]);
                    count ++;
                    trans[count] = arr[1];
                    break;
                }
                case 3: {
                    Transactions(trans, count);
                    break;
                }
                case 4: {
                    accountSummary();
                    break;
                }
            }
            System.out.println("");
            System.out.println("Do you want to continue, 'y' or 'n' ");
            choice = obj.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');

    }

}
