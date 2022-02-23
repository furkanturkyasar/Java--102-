import java.util.Date;

public abstract class Insurance {
    private String policyName;
    private double policyPrice;
    private Date policyStartAndExpireDate;

    public abstract void calculate();
}
