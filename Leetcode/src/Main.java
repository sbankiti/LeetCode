import DesignPatterns.Creational.BookingTickets;
import DesignPatterns.Creational.Factory;
import DesignPatterns.DesignptrnBuild;
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
/*        Java8Features j8 = new Java8Features();
//        j8.java8Chk();
        //j8.javaStreamChk();
        j8.java8Exercises();*/

        //LeetCode execution
        LeetCodeCalls ltcode = new LeetCodeCalls();
        ltcode.leetCodeMethExec();

        //Design Pattern
        DesignptrnBuild dsgptrn = new DesignptrnBuild();
        dsgptrn.build();

        //TempClass execution
/*        TempCls tmpcls = new TempCls();
        tmpcls.tempMethodexec();*/


    }
}