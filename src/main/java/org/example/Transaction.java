package org.example;

import org.example.Expeptions.AmountTransactionException;
import org.example.Expeptions.DataTransactionException;

public class Transaction {

    /**
     * Метод транзакции
     * @param from От кого
     * @param to Кому
     * @param amount Сумма
     * @throws AmountTransactionException Недостаточное количество средств отправителя
     * @throws DataTransactionException Отрицательное число перевода
     */
    public static void transaction(Account from,Account to,int amount) throws AmountTransactionException, DataTransactionException {
        if(from == null || to == null){
            throw new NullPointerException();
        } else if(from.getAmount() < amount){
            throw new AmountTransactionException(from.getAmount(),amount);
        } else if(amount < 0){
            throw new DataTransactionException(amount);
        }
        from.setAmount(from.getAmount() - amount);
        to.setAmount(to.getAmount() + amount);
        System.out.printf("Транзакция совершена успешно.\nТекущий баланс отправителя = %d, получателя = %d\n",
                from.getAmount(),to.getAmount());
    }

}
