package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Banking");

        int n = 3;
        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();

            double max = 10000.00;
            double min = 1000.00;

            Random randonNum = new Random();
            double initialBalance = min + randonNum.nextDouble();
            
            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);
        }

        bankAccount[0].setFullName("Tan Meng Chwang");
        bankAccount[1].setFullName("Ng Swee Kiat");
        bankAccount[2].setFullName("Desmond Koh");

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].deposit(2000);
        bankAccount[1].deposit(4000);
        bankAccount[2].deposit(5000);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].withdraw(2000);
        bankAccount[1].withdraw(4000);
        bankAccount[2].withdraw(5000);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

    }
}
