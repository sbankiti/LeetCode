package LeetCodeEx;

import java.util.HashSet;
import java.util.Set;

public class LongestConSeq {

    public void longSeq(){
        int[] arr = new int[] {200,4,2,1,201,3,202,6,203,204,205};
        Set<Integer> st = new HashSet<>();
        int maxcnt = 0;
        int cnt = 0;

        for(int i = 0; i< arr.length; i++)
        {
            st.add(arr[i]);
        }

        for(int i =0; i<arr.length;i++){

            if(!st.contains(arr[i]))
                continue;

            cnt = 1;

            if(st.contains(arr[i] - 1)){
                cnt = lowval(cnt,arr[i] - 1,st);
            }

            if(st.contains(arr[i] + 1)){
                cnt = highval(cnt,arr[i] + 1,st);
            }

            if(maxcnt < cnt)
                maxcnt = cnt;

            st.remove(arr[i]);
        }

        System.out.println("Max sequence length " + maxcnt);
    }

    private int lowval( int cnt, int num, Set<Integer> st )
    {

        if(st.contains(num - 1)){
            cnt = lowval(cnt,num - 1,st);
        }

        st.remove(num);
        return cnt + 1;
    }

    private int highval( int cnt,int num, Set<Integer> st )
    {

        if(st.contains(num + 1)){
           cnt = highval(cnt,num + 1,st);
        }

        st.remove(num);
        return cnt + 1;
    }
}
