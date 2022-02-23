import java.util.ArrayList;
import java.util.Objects;

enum AuthenticationStatus {
    SUCCESS, FAIL
}

public abstract class Account implements Comparable<Account> {
    private AuthenticationStatus islogin;
    private User user;
    private ArrayList<Insurance> policyApplied;

    public Account(User user) {
        this.user = user;
    }

    public final void showUserInfo() {

    }

    public void login(String email, String passWord) throws InvalidAuthenticationException {
        if (email.equals(user.getEmail()) && passWord.equals(user.getPassWord())) {
            islogin = AuthenticationStatus.SUCCESS;
        } else {
            islogin = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Incorrect email Or Password!");
        }
    }

    public abstract Insurance addInsurance();


    public void addAddress(IAddress address) {
        AddressManager.addAddress(this.user, address);
    }

    public void removeAddress(IAddress address) {
        AddressManager.removeAddress(this.user, address);
    }

    public AuthenticationStatus getIslogin() {
        return islogin;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return islogin == account.islogin && Objects.equals(user, account.user) && Objects.equals(policyApplied, account.policyApplied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(islogin, user, policyApplied);
    }
}
