import java.util.Scanner;

public class Input {
    private String email;
    private String passWord;

    public Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Email giriniz: ");
        this.email = input.next();
        System.out.println("Sifre giriniz: ");
        this.passWord = input.next();
        AccountManager accountManager = new AccountManager();
        accountManager.login(this.email, this.passWord);
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return passWord;
    }

}
