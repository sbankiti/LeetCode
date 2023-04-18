package MultiThreadingEx;

public class MultiThreadingCls extends Thread {

    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName() + "Extending Thread Class");

    }
}
