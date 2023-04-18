package LeetCodeEx;

public class ClimbingStairs {

    public void climbingStrWays(){
        int n = 4, first = 1, second = 1, temp = 0;

        for(int i=0; i< n-1; i++){
            temp = second;
            second += first;
            first = temp;
        }

        System.out.println(second);
    }
}
