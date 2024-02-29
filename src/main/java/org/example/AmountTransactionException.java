package org.example;

public class AmountTransactionException extends Exception {
    private final int fromAmount;
    private final int amount;
    public AmountTransactionException(int fromAmount, int amount) {
        super();
        this.fromAmount = fromAmount;
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return String.format("Вы ввели сумму транзакции превышающую ваш баланс." +
                " Ваш баланс %d, хотели перевести %d", fromAmount,amount);
    }
}
