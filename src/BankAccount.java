public class BankAccount {
    private double balance;
    private int accountNumber;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(){
        this(0, 666666, "Default Name", "nono@aol.com", 234234222L);
    }

    public BankAccount(double balance, int accountNumber, String customerName, String email, long phoneNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void depositFunds (double deposit){
        if (deposit > 0) {
            this.balance += deposit;
            System.out.println("New balance is " + this.balance);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdrawFunds (double withdraw){
        if (withdraw < this.balance) {
            this.balance -= withdraw;
            System.out.println("New balance is " + this.balance);
        } else if (withdraw < 0){
            System.out.println("Invalid withdraw");
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void setPhoneNumber(long newNumber){
        this.phoneNumber = newNumber;
    }
    public long getPhoneNumber(){
        System.out.println("Phone number is " + this.phoneNumber);
        return this.phoneNumber;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }

    public String getEmail(){
        System.out.println("Customer email is " + this.email);
        return this.email;
    }

    public void setCustomerName(String newName){
        this.customerName = newName;
    }
    public String getCustomerName(){
        System.out.println("Customer name is " + this.customerName);
        return this.customerName;
    }
    public void setBalance(double newBalance){
        this.balance =  newBalance;
    }
    public double getBalance(){
        System.out.println("Balance is " + this.balance);
        return this.balance;
    }

    public void setAccountNumber(int newAccountNumber){
        if (newAccountNumber > 0){
            this.accountNumber = newAccountNumber;
        }
    }
    public int getAccountNumber(){
        System.out.println("Account# is " + this.accountNumber);
        return this.accountNumber;
    }
}
