import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts = new TreeSet<>();

    public Account login(String email, String passWord) {
        for (Account account : accounts) {
            if (account.getUser().getEmail().equals(email) && account.getUser().getPassWord().equals(passWord)) {
                try {
                    account.login(email, passWord);
                } catch (InvalidAuthenticationException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
