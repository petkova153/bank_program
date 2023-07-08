import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    //composition is bringing in multiple classes in 1 class managing all of them
    private static Bank bankService = new Bank();

    public static void main(String[] args) {
        boolean wouldLikeToContinue = true;

        while (wouldLikeToContinue) {
            String userChoice = bankService.getInfo("""
                    Welcome to your Bank menu
                    please choose an option
                        1. Register user
                        2. Show your balance
                        3. Credit an account
                        4. Debit an account
                        5. Exit
                    """);

            switch (userChoice) {
                case "1":
                    bankService.registerUser();
                    break;
                case "2":
                    bankService.showAccountBalance();
                    break;
                case "3":
                    bankService.creditAccount();
                    break;
                case "4":
                    bankService.debitAccount();
                    break;
                case "5":
                    wouldLikeToContinue = Boolean.parseBoolean(bankService.getInfo("Would you like to continue? (true/false)"));
                    break;
                default:
                    System.out.println("Please choose an option");
                    break;
            }
        }

    }
}
