public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Name", 32000, "abc@this.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 5000, emailAddress);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

