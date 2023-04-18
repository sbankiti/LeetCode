package MultiThreadingEx;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreadImpleRunnable implements Runnable{
    private int countval = 0;
    public synchronized void countnum(){

        System.out.println("---------------------------------------------");

        //IntStream.iterate(1, i->i+1).limit(10).boxed().forEach(ele-> System.out.println(ele));
        IntStream.rangeClosed(1,10).forEach(ele-> { countval += 1;
            System.out.println(Thread.currentThread().getName() + " " + countval);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        /*for(int i = 0; i<5; i++) {
            countval += 1;
            System.out.println(Thread.currentThread().getName() + " " + countval);
        }*/
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + "Implements Runnable");
        countnum();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
