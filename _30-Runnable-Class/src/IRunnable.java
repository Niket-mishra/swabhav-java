public class IRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread started :"+Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(800);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        }
    }
}
