public class EvenThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) System.out.println("Số lẻ "+i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e){
            System.out.printf(e.getMessage());
        }
    }
}
