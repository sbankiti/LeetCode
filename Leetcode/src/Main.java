import DesignPatterns.DesignptrnBuild;

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
        TempCls tmpcls = new TempCls();
        tmpcls.tempMethodexec();

        TempCls.innerclass inncls = tmpcls.new innerclass();
        inncls.printmsg();

        System.out.println("Parent Class " + tmpcls);

    }
}