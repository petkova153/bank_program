import java.util.*;

public class Bank {
    private Services services;
    public Bank(){this.services = new Services();}
    Scanner scanner = new Scanner(System.in);
    public void registerUser() {
        try{
            User user = this.collectUserInfo();
            String result = this.services.addUser(user);
            System.out.println(result); }
        catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
        finally{
            if (this.getInfo("Do you want to add a new user? (Y/N)").equals("Y")) this.registerUser();
        }
    }

    private  User collectUserInfo(){
        User user = new User();
        user.setName(this.getInfo("Please write your name"));
        user.setAge(Integer.parseUnsignedInt(this.getInfo("Please specify your age")));
        user.setGender(Gender.valueOf(this.getInfo("Please specify your gender male/female/unidentified").toUpperCase()));
        user.setAccountNumber(UUID.randomUUID());
        user.setAccountBalance(Double.parseDouble(this.getInfo("Opening balance. You need to deposit at least 10.")));
        user.setOpeningDate(new Date());
        user.setCurrency(Currency.valueOf(this.getInfo("Enter the main currency for your account. (EUR,USD,SEK,NOK,CHF)").toUpperCase()));
        return user;
    }

    public void showAccountBalance(){
        String name = this.getInfo("Please enter your name");
        System.out.println(services.showBalance(name));
    }

    public void creditAccount(){
        try {
            String result = this.services.creditAccount(this.getInfo("Please enter your name"), Double.parseDouble(this.getInfo("Please enter amount to credit with.")));
            System.out.println(result);
        }
        catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
        finally{
            if (this.getInfo("Do you want to debit your account? (Y/N)").equals("Y")) this.creditAccount();
        }
    }

    public void debitAccount(){
        try {
            String result = this.services.debitAccount(this.getInfo("Please enter your name"), Double.parseDouble(this.getInfo("Please enter amount to debit with.")));
            System.out.println(result);
        }
        catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
        finally{
            if (this.getInfo("Do you want to debit your account? (Y/N)").equals("Y")) this.debitAccount();
        }

    }
    public String getInfo(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
