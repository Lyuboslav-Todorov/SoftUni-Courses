package DefiningClassesLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccount_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();


        while (!command.equals("End")){
            String output = null;
            String[] tokens = command.split("\\s+");
            if (tokens[0].equals("Create")){
                BankAccount account = new BankAccount();
                bankAccounts.put(account.getId(), account);
                output = "Account ID" + account.getId() + " created";
            } else if (tokens[0].equals("Deposit")){
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);
                if (!bankAccounts.containsKey(id)){
                    output = "Account does not exist";
                } else {
                    bankAccounts.get(id).deposit(amount);
                    output = "Deposited " + amount +  " to ID" + id;
                }
            } else if (tokens[0].equals("SetInterest")){
                BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
            } else {
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);
                if (!bankAccounts.containsKey(id)){
                    output = "Account does not exist";
                } else {
                    double interest = bankAccounts.get(id).getInterestRate(years);
                    output = String.format("%.2f", interest);
                }
            }
            if (output != null){
                System.out.println(output);
            }

            command = scanner.nextLine();
        }

    }

    public static class BankAccount {
        private static int accountCount = 1;
        private static double interestRate = 0.02;

        private int id;
        private double balance;

        public BankAccount() {
            this.id = accountCount;
            accountCount++;
        }

        public static void setInterestRate(double rate) {
            interestRate = rate;
        }

        public double getInterestRate(int years) {
            return interestRate * years * this.balance;
        }

        public void  deposit(double amount){
            this.balance += amount;
        }

        public int getId() {
            return id;
        }
    }

}
