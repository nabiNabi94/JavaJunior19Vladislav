package lesson20;

public class Voice1 extends Thread{
    private boolean nidStop = false;
    @Override
    public void run() {
        int count = 0;
        while (!nidStop){
            count++;
            if (count > 3)
                nidStop = true;
            for (int i = 0;i < 3;i++){
                System.out.println("LA--------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MICROPHONE){
                Monitors.MICROPHONE.notify();

            }
            synchronized (Monitors.MICROPHONE){
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
