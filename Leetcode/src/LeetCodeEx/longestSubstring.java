package LeetCodeEx;

import java.util.HashSet;
public class longestSubstring {

    public void lngsubstr( ){

        String str = "abcdabcbb";

        System.out.println(substrcnt(str));
    }

    public int substrcnt(String s){

        int maxcnt = 0;
        int l = 0;
        HashSet<Character> hset = new HashSet<>();

        for(int i = 0; i<s.length();i++){

            if(hset.contains(s.charAt(i))){

                while(hset.contains(s.charAt(i))){

                    hset.remove(s.charAt(l));
                    l+=1;
                }
            }

            hset.add(s.charAt(i));

            if(maxcnt < hset.size()){
                maxcnt = hset.size();
            }
        }
        return maxcnt;

    }
}
