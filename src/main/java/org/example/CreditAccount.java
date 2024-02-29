package org.example;

public class CreditAccount extends Account{
    private int creditLimit;

    public CreditAccount(String login, String password, int amount, int creditLimit) {
        super(login, password, amount);
        this.setAmount(getAmount() + creditLimit);
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void showBalance(){
        System.out.println(this.getAmount() - this.creditLimit);
    }



}
