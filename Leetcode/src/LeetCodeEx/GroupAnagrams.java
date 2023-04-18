package LeetCodeEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    String[] strs = {"eat","tea","tan","ate","nat","bat"};
        public  void Solution() {

            Map<String,List<String>> hmp = new HashMap<>();
            int[] cntarr;
            int val_a = 'a';
            List<String> lst;
            List<List<String>> output = new ArrayList<>();
            String str;

            for(int i =0; i<strs.length;i++)
            {
                cntarr = new int[26];
                for(int j=0 ; j<strs[i].length();j++){

                    cntarr[(int)strs[i].charAt(j) - val_a] += 1;
                }

                str = "";
                for(int k = 0; k<cntarr.length; k++)
                {
                    if(cntarr[k] > 0){
                        str = str + cntarr[k];
                    }
                }

                lst = new ArrayList<>();
                if(hmp.containsKey(str)){
                    lst = hmp.get(str);
                    lst.add(strs[i]);
                    hmp.put(str,lst);
                }else{
                    lst.add(strs[i]);
                    hmp.put(str,lst);
                }
            }

            for(Map.Entry<String,List<String>> set : hmp.entrySet() ){

                output.add(set.getValue());
            }

            System.out.println(output);
        }
}
