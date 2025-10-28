package OOPS;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 7860;

    public void CheckPin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enterredpin = sc.nextInt();

        if (enterredpin == PIN){
            menu();
        } else{
            System.out.println("Enter a valid pin");
            CheckPin();
        }
    }
    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        // Ab user in option ko choose krega so we will use scanner to take input:
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1){
            CheckBalance();
        } else if (option == 2) {
            WithdrawMoney();
        } else if (option == 3) {
            DepositMoney();
        } else if (option == 4) {
            return;
        }else{
            System.out.println("Enter a valid choice : ");
        }
    }
    public void CheckBalance(){
        System.out.println("Balance: " + Balance);
        menu(); // avi isliye isko call kara qki agar user ko balance ko check krne ke baad aur kuch check karna ho
    }

    public void WithdrawMoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount>Balance){
            System.out.println("Insufficient balance");
        }else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawn Successfully");
        }
        menu();
    }

    public void DepositMoney(){
        System.out.println("Enter the amount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Balance = Balance + money;
        System.out.println("Money deposited Successfully");
        menu();
    }
}

public class AtmMachineProject {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.CheckPin();
    }
}
