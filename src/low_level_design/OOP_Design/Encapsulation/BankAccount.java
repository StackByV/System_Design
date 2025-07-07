package low_level_design.OOP_Design.Encapsulation;

class BankAccount {
    private double balance; // Private attribute

    public void deposit(double amount) { // Public method to modify balance
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() { // Public method to access balance
        return balance;
    }
}
