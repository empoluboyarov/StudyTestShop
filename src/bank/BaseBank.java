package bank;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public class BaseBank implements BankInterface {

    String name;

    String creditDescription;

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditDescription(String creditDescription) {
        this.creditDescription = creditDescription;
    }

    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
