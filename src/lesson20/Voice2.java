package lesson20;

public class Voice2 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        for (int i = 0; i < 2; i++) {
            System.out.println("--------FA");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (Monitors.MICROPHONE) {
            Monitors.MICROPHONE.notify();

        }

    }
}
}


