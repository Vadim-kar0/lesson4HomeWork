package org.example;

import org.example.Expeptions.AmountTransactionException;
import org.example.Expeptions.DataTransactionException;
import org.example.Expeptions.InsufficientFundsException;

public class Program {
    public static void main(String[] args) {

        //Начальный баланс не может быть отрицательным
        try {
            DebitAccount da1 = new DebitAccount("da1","alksdjf",-50);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        DebitAccount da2 = new DebitAccount("da1","alksdjf",50);

        //Для пополнения счёта указано отрицательное число
        try {
            da2.putSomeMoney(-10);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //Не достаточно средств. Текущий баланс = 50, сумма снятия = 100
        try {
            da2.getSomeMoney(100);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }



        DebitAccount da3 = new DebitAccount("da1","alksdjf",150);
        DebitAccount da4 = new DebitAccount("da1","alksdjf",1150);
        CreditAccount ca1 = new CreditAccount("ca1", "l;aksjdf", 1000,10000);
        CreditAccount ca2 = new CreditAccount("ca1", "l;aksjdf", 1000,10000);
        try {
            //Транзакция совершена успешно.
            //Текущий баланс отправителя = 50, получателя = 11100
            Transaction.transaction(da3,ca1,1);
            //Вы ввели сумму транзакции превышающую ваш баланс. Ваш баланс 50, хотели перевести 11100
            Transaction.transaction(da3,ca1,11100);
        } catch (AmountTransactionException | DataTransactionException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Вы ввели отрицательную сумму транзакции = -100
            Transaction.transaction(da4,ca2,-100);
        } catch (AmountTransactionException | DataTransactionException e) {
            System.out.println(e.getMessage());
        }

    }
}
