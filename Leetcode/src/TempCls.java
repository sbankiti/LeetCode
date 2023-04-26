import LeetCodeEx.Anagram;
import MultiThreadingEx.ParentClass;

import java.util.List;
import java.util.stream.Stream;

public class TempCls extends ParentClass {

    int a = 20;
    public void tempMethodexec(){


        System.out.println("Parent Class " + a);
        Anagram ang = (Anagram) new Anagram();
        ang.chkAnagram();

        //Thread class Extending the Thread class
        /*MultiThreadingCls threadcls = new MultiThreadingCls();
        threadcls.setName("Child Extend Thread");
        threadcls.start();
        System.out.println(Thread.currentThread().getName());*/

        //Thread class implementing the runnable
        //Thread with highest priority will execute first
       /* ThreadImpleRunnable thimprun = new ThreadImpleRunnable();
        Thread th = new Thread(thimprun, "Child Imp Run - ");
        th.setPriority(Thread.MAX_PRIORITY);
        th.start();
        Thread th1 = new Thread(thimprun, "Child Imp Run 1 -");
        th.setPriority(2);
        th1.start();

        th.join();
        th1.join();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println("Thread completed main");*/

        //Thread with anonymous initialization of runnable
        /*Runnable runinstance = new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + "Anonymous run");
            }
        };
        Thread thanony = new Thread(runinstance, "Child anonymous run");
        thanony.start();

        //Thread with Lambda expression
        Thread thlamb = new Thread(()-> System.out.println(Thread.currentThread().getName()),"Child thread lambda");
        thlamb.start();*/

 /*       Developer d1 = new Developer();

        Developer d2 = d1;

        d1.setAge(20);
        d1.emp.setName("From D1 object");
        System.out.println(Developer.nu);

        Developer d3 = (Developer) d1.clone();

        d3.setAge(40);
        d3.emp.setName("From D3 object");

        System.out.println("Age" + d1.getAge());
        System.out.println("Age" + d3.getAge());
        System.out.println("Executing from d1 " + d1.emp.getName());
        System.out.println("Executing from d3 " + d3.emp.getName());

        LinkedList<Integer> ls = new LinkedList<>();

        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);

        int addsum = 100;
        int valsum;

        valsum = -addsum / 10;

        System.out.println(valsum);*/

        List<Integer> ls = Stream.of(1,2,34,5,6).toList();

        int lsout = ls.stream().findFirst().orElse(0);

        String str = "santhosh";
        String str2 ;//= "santhosh";
        str2 = str;
        String str1 = new String("Santhosh");

        System.out.println((str == str1));
        System.out.println((str == str2) + " compare with str2");
    }
}
