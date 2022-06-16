package p1;

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
        Thread thread = new Thread();
        FirstThread firstThread = new FirstThread();
       // firstThread.run();
        firstThread.start();
        SecondThread secondThread = new SecondThread();
        secondThread.run();

    }
}
