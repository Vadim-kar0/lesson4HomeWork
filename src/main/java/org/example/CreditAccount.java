package App;

public class CreditAccount extends Account{
    private int creditLimit;

    public CreditAccount(String login, String password, int amount, int CREDIT_LIMIT) {
        super(login, password, amount);
        this.creditLimit = CREDIT_LIMIT;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }



}
