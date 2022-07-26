public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo = new RunnableDemo("Thread1-HR-Database");
        runnableDemo.start();

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread2-Send-Email");
        runnableDemo1.start();

        System.out.println("Main thread stopped !!!");
    }
}
