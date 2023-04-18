package LeetCodeEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    int[] inparr = new int[]{1,2,3,1,1,2};

    public void goodpairchk(){

        int val;
        int pairs = 0;
        Map<Integer,Integer> hmap = new HashMap<>();

        for( int i : inparr){

            val = 0;
            if(hmap.containsKey(i)){

                val = hmap.get(i);
                val += 1;
                hmap.put(i, val);

            }else {
                hmap.put(i,1);
            }
        }

        for ( Map.Entry<Integer,Integer> entry : hmap.entrySet()){

            int newval = entry.getValue();
            pairs += newval * (newval - 1) / 2;
        }

        System.out.println(pairs);
    }
}
