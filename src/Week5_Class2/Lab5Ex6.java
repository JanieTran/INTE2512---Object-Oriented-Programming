package Week5_Class2;

public class Lab5Ex6 {
    public static void main(String[] args) {
        Account george = new Account("George", 1122, 1000);
        george.setAnnualInterestRate(1.5);

        george.deposit(30);
        george.deposit(40);
        george.deposit(50);

        george.withdraw(5);
        george.withdraw(4);
        george.withdraw(2);

        for (Transaction transaction : george.getTransactions()) {
            System.out.println(transaction.getDescription());
        }
    }
}
