public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        System.out.println("Thread is running");
        oddThread.start();
        oddThread.join();
        evenThread.start();
        System.out.println("Thread is stopped !! ");
    }
}
