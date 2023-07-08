import java.util.*;

public class Bank {
    private ArrayList<User> userList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void registerUser() {
        User user = this.collectUserInfo();
        userList.add(user);
        System.out.println(user);
    }

    private  User collectUserInfo(){
        User user = new User();
        user.setName(this.getInfo("Please write your name"));
        user.setAge(Integer.parseUnsignedInt(this.getInfo("Please specify your age")));
        user.setGender(Gender.valueOf(this.getInfo("Please specify your gender male/female/unidentified").toUpperCase()));
        user.setAccountNumber(UUID.randomUUID());
        user.setAccountBalance(Double.parseDouble(this.getInfo("Opening balance")));
        user.setOpeningDate(new Date());
        user.setCurrency(Currency.valueOf(this.getInfo("Enter the main currency for your account").toUpperCase()));
        return user;
    }

    public void showAccountBalance(){
        for (User user: userList){
            String name = this.getInfo("Please enter your name");
            if (user.getName().equals(name)){
                System.out.println("Your account balance is : " + user.getAccountBalance());
                break;
            }
        }
    }

    public void creditAccount(){
        for (User user: userList){
            String name = this.getInfo("Please enter your name");
            if (user.getName().equals(name)){
                user.setAccountBalance(user.getAccountBalance() +
                        Double.parseDouble(this.getInfo("Please enter amount to credit with.")));
                System.out.println("Your new balance is: " + user.getAccountBalance());
            }
        }
    }

    public void debitAccount(){
        for (User user: userList){
            String name = this.getInfo("Please enter your name");
            if (user.getName().equals(name)){
                user.setAccountBalance(user.getAccountBalance() -
                        Double.parseDouble(this.getInfo("Please enter amount to credit with.")));
                System.out.println("Your new balance is: " + user.getAccountBalance());
            }
        }
    }
    public String getInfo(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
