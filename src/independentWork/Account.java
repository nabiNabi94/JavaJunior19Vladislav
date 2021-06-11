package independentWork;

import javax.naming.InsufficientResourcesException;

public class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw (int account){
        balance = account;
    }
    public void deposit (int amount) {
        balance += amount;
    }
    static void transfer( Account acc1 , Account acc2, int amount)
            throws InsufficientResourcesException {
//       if (acc1.getBalan
//        ce()){

        }


}
