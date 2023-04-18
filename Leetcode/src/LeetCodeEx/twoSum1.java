package LeetCodeEx;

import java.util.HashMap;

public class twoSum1 {

    public void twoSum(){

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] out = new int[2];
        out = twoSumSol(nums,target);

        for(int i = 0; i < out.length;i++)
            System.out.println( out[i] );
    }

    public int[] twoSumSol(int[] num, int tar){

        int[] output = new int[2];
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int val = 0;

        for(int i = 0; i<num.length; i++){

            val = tar - num[i];

            if(hmap.containsKey(val)) {
                output[0] = hmap.get(val);
                output[1] = i;
            }
            else
                hmap.put(num[i], i);
        }

        return output;
    }
}
