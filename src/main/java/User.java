import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class User {
    private String name;
    private int age;
    private Gender gender;
    private UUID accountNumber;
    private double accountBalance = 0.00d;
    private Date openingDate = new Date();
    private Currency currency;

    public User(){}

    public User(String name, int age, Gender gender, UUID accountNumber, double accountBalance, Date openingDate, Currency currency) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.openingDate = openingDate;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", openingDate=" + openingDate +
                ", currency=" + currency +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
