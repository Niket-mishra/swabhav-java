public class MainTest {
    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");
        System.out.println("Thread started :"+Thread.currentThread().getName());

        ThreadsClass obj = new ThreadsClass();
        obj.setName("Alphabet Thread");
        obj.start();
        IRunnable obj1 = new IRunnable();
        Thread t1 = new Thread(obj1);
        t1.setName("Number Thread");
        t1.start();
    }
}
