public class MyThread extends Thread {
    public void run (){
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
