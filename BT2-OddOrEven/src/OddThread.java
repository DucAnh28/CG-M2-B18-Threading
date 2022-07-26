public class OddThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) System.out.println("Số chẵn "+ i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e){
            System.out.printf(e.getMessage());
        }
    }
}
