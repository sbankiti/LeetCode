import Java8Chk.Developer;
import Java8Chk.Employee;
import Java8Chk.Java8Features;
import LeetCodeEx.LongestConSeq;
import LeetCodeEx.ProductArraySelf;
import MultiThreadingEx.MultiThreadingCls;
import MultiThreadingEx.ThreadImpleRunnable;
import jdk.jfr.Percentage;

import java.security.PrivilegedAction;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {


        //Java 8 Functionality check
        Java8Features j8 = new Java8Features();
//        j8.java8Chk();
        //j8.javaStreamChk();
        j8.java8Exercises();

        //Longest Substring 3
        //LeetCodeEx.longestSubstring lngsub = new LeetCodeEx.longestSubstring();
        //lngsub.lngsubstr();

       /* //Problem 1
        LeetCodeEx.twoSum1 twsum = new LeetCodeEx.twoSum1();
        twsum.twoSum();

        //Problem Shuffle array

        //Problem Good Pairs 1512
        LeetCodeEx.GoodPairs objgudpr = new LeetCodeEx.GoodPairs();
        objgudpr.goodpairchk();*/

        //Problem check anagram
        //LeetCodeEx.Anagram ang = new LeetCodeEx.Anagram();
        //ang.chkAnagram();
        //ang.KthmostFreq();

        //Problem group anagrams 49
        //LeetCodeEx.GroupAnagrams grpang = new LeetCodeEx.GroupAnagrams();
        //grpang.Solution();

        //Problem check palindrome 129
        /*LeetCodeEx.PalindromeChk palichk = new LeetCodeEx.PalindromeChk();
        palichk.palindromestrchk();*/

        //Problem Climbing Stair case 70 same as FIBONNACI
        //LeetCodeEx.ClimbingStairs clmbstr = new LeetCodeEx.ClimbingStairs();
        //clmbstr.climbingStrWays();

        //Problem Valid Sudoko 36 problem {Arrays and Hashing}
        //LeetCodeEx.ValidSudoko vldsdk = new LeetCodeEx.ValidSudoko();
        //vldsdk.chkSudoko();

        //Problem product of array except self 238 problem
        ProductArraySelf.findArrayprod();

        //Problem Longest Consequtive Sequence 128 problem
        LongestConSeq lngseq = new LongestConSeq();
        lngseq.longSeq();

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
    }
}