import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class User {
    private String name;
    private int age;
    private Gender gender;
    private UUID accountNumber;
    private double accountBalance;
    private Date openingDate;
    private String mainCurrency;

    public User(){}

    public User(String name, int age, Gender gender, UUID accountNumber, double accountBalance, Date openingDate, String mainCurrency) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.openingDate = openingDate;
        this.mainCurrency = mainCurrency;
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
                ", mainCurrency='" + mainCurrency + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public String getMainCurrency() {
        return mainCurrency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public void setMainCurrency(String mainCurrency) {
        this.mainCurrency = mainCurrency;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Double.compare(user.accountBalance, accountBalance) == 0 && Objects.equals(name, user.name) && gender == user.gender && Objects.equals(accountNumber, user.accountNumber) && Objects.equals(openingDate, user.openingDate) && Objects.equals(mainCurrency, user.mainCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, accountNumber, accountBalance, openingDate, mainCurrency);
    }
}
