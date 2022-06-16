package p1;

public class FirstThread extends Thread{
    @Override
    public void run(){
        System.out.println("FirstThread");
        try {



        Thread.sleep(60*1000);
    }catch(InterruptedException e){
        System.out.println(e.getMessage());
    }
    }
}
