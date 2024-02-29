package org.example;

public class DataTransactionException extends Exception {
    private int amount;
    public DataTransactionException(int amount) {
    super();
    this.amount = amount;
    }

    @Override
    public String getMessage() {
        return String.format("Вы ввели отрицательную сумму транзакции = %d",amount);
    }
}
