package independentWork;

import javax.naming.InsufficientResourcesException;

import static independentWork.Account.transfer;

public class Operation {
    public static void main(String[] args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {
            public void run() {
                try {
                    transfer(a,b,500);
                } catch (InsufficientResourcesException e) {
                    e.printStackTrace();
                }
            }

        }).start();
        try {
            transfer(b,a,500);
        } catch (InsufficientResourcesException e) {
            e.printStackTrace();
        }


    }
}
