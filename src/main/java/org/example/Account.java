package App;

public abstract class Account {

    private final String login;
    private String password;
    private int amount;

    public Account(String login, String password, int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.login = login;
        this.password = password;
        this.amount = amount;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void getSomeMoney(int count) throws InsufficientFundsException {
        if(this.amount < count){
            throw new InsufficientFundsException("Не достаточно средств. Текущий баланс = " + this.amount +
                                                    ", сумма снятия = " + count);
        }
        if(count < 0){
            throw new IllegalArgumentException("Для снятия с депозита указано отрицательное число");
        }
        this.amount -= count;
    }
    public void putSomeMoney(int count){
        if(count < 0){
            throw new IllegalArgumentException("Для пополнения счёта указано отрицательное число");
        }
        this.amount += count;
    }




    @Override
    public String toString() {
        return "App.Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                '}';
    }
}
