package LeetCodeEx;

import java.util.*;

public class Anagram {

    String s = "santhosh";
    String t = "anthosha";

    public void chkAnagram(){

        char sval;
        int scnt;
        char flag = ' ';

        HashMap<Character,Integer> hs = new HashMap<>();
        HashMap<Character,Integer> ht = new HashMap<>();

        for(int i = 0 ; i<s.length();i++){

            sval = s.charAt(i);
            if (hs.containsKey(sval)){
                scnt = hs.get(sval);
                hs.put(sval,scnt + 1);
                continue;
            }
            hs.put(sval,1);
        }

        for(int i = 0; i<t.length(); i++){

            sval = t.charAt(i);
            if(ht.containsKey(sval)){
                scnt = ht.get(sval);
                ht.put(sval,scnt + 1);
                continue;
            }
            ht.put(sval,1);
        }

        if(hs.size() != ht.size()){
            System.out.println("Not a anagram");
        }else{
            for(Map.Entry<Character,Integer> set : hs.entrySet()){

                if(set.getValue() != ht.get(set.getKey())){
                    System.out.println("Not a anagram");
                    flag = 'X';
                    break;
                }
            }

            if(flag == ' ')
            System.out.println("LeetCodeEx.Anagram");
        }

    }

    //Problem 347
    public void KthmostFreq(){

        int[] nums = new int[] {1,1,1,1,2,2,2,2,3,3};
        int k = 2;

        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer>[] lst = new List[nums.length + 1];

        for(int i : nums){

            if(hm.containsKey(i)){
                hm.put(i,hm.get(i) + 1);
                continue;
            }
            hm.put(i,1);
        }

        for(Map.Entry<Integer,Integer> set : hm.entrySet()){

            if(lst[set.getValue()] == null){
                lst[set.getValue()] = new ArrayList<>();
            }
            lst[set.getValue()].add(set.getKey());
        }

        int idx = 0;
        int[] arr = new int[k];

        for(int i = lst.length -1; i>0 ; i-- ){

            if(lst[i] == null){
                continue;
            }

            for(int j = 0; j < lst[i].size(); j++ ) {

                if( idx == k) break;
                arr[idx] = lst[i].get(j);
                idx += 1;
            }

            if(idx == k) break;
        }

    }
}
