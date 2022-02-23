import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String passWord;
    private String job;
    private int age;
    private ArrayList<IAddress> IAddressArrayList;
    private Date lastLogin;

    public String getEmail() {
        return this.email;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<IAddress> getIAddressArrayList() {
        return IAddressArrayList;
    }

    public void setIAddressArrayList(ArrayList<IAddress> IAddressArrayList) {
        this.IAddressArrayList = IAddressArrayList;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
