public class TaskThreadDemo {
    public static void main(String[] args) {
        PrintNum printNum = new PrintNum(30);
        PrintString printString = new PrintString("DucAnhDz",30);
        PrintString printString1 = new PrintString("DucAnhDangCapVuTru",30);

        Thread thread1 = new Thread(printNum);
        Thread thread2 = new Thread(printString);
        Thread thread3 = new Thread(printString1);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrintNum implements Runnable{
    private int number;

    public PrintNum(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }
}

class PrintString implements Runnable{
    private String input ;
    private int count;

    public PrintString() {
    }

    public PrintString(String input, int count) {
        this.input = input;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(input);
        }
    }
}
