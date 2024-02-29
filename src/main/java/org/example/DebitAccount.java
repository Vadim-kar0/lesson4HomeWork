package App;

public class DebitAccount extends Account{
    public static final int LIMIT = 0;

    public DebitAccount(String login, String password, int amount) {
        super(login, password, amount);
    }

}
