public class ThreadsClass extends Thread{



    @Override
    public void run() {
        System.out.println("Thread started :"+this.getName());
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception");
            }

            System.out.println((char) (i+65));
        }

        System.out.println(this.getId());
    }
}
