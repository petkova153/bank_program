import java.util.ArrayList;

public class Services {
    ArrayList<User> users = new ArrayList<>();

    public String addUser(User user) throws Exception{
        //place for product validation
        if(user.getName().isEmpty()) throw new Exception("Please provide product name!");
        if(user.getAge() < 18d) throw new Exception("The user is under-aged. \nThis operation requires parental agreement");
        if(user.getCurrency() == null) throw new Exception("Choose currency.");
        if(user.getGender() == null) throw new Exception("Please provide information about your gender.");
        if(user.getAccountBalance() < 10) throw new Exception("You need to deposit at least 10.");

        this.users.add(user);
        return "User " + user.getName() + " added successfully and your account is: " + user.getAccountNumber();
    }
    public String debitAccount(String name, Double debetAmount) throws Exception{
        for (User user: users){
            if (user.getName().equals(name)){
                if(user.getAccountBalance() - debetAmount < 0d) throw new Exception("Insufficient funds. Your request is rejected.");
                user.setAccountBalance(user.getAccountBalance() - debetAmount);
                return "Your new balance is: " + user.getAccountBalance();
            }
        }
        return "User not found";
    }

    public String creditAccount(String name, Double creditAmount) throws Exception{
        for (User user: users){
            if (user.getName().equals(name)){
                if(creditAmount == null) throw new Exception("Please enter a valid amount");
                user.setAccountBalance(user.getAccountBalance() + creditAmount);
                return "Your new balance is: " + user.getAccountBalance();
            }
        }
        return "User not found";
    }
    public String showBalance(String name){
        for (User user: users){
            if (user.getName().equals(name)){
                return "Your balance is: " + user.getAccountBalance();
            }
        }
        return "User not found";
    }
}
