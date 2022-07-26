public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        NumberGenerator numberGenerator1 = new NumberGenerator("Thread 1");
        Thread thread1 = new Thread(numberGenerator1);
        NumberGenerator numberGenerator2 = new NumberGenerator("Thread 2");
        Thread thread2 = new Thread(numberGenerator2);

        thread1.start();
        thread2.start();

        System.out.println("Thread is stopped !! ");
    }
}
