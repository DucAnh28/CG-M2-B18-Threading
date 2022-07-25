public class MyRunnable implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Runnable r = new Runnable();
        Thread obj = new Thread(r);
        obj.start();
    }
}
