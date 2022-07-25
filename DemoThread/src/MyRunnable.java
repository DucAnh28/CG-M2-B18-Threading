public class MyRunnable implements Runnable {
    @Override
    public void run() {
    }

    public MyRunnable() {
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread obj = new Thread(r);
        obj.start();
    }
}
