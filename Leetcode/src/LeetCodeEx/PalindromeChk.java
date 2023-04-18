package LeetCodeEx;

public class PalindromeChk {

    String s = "A man, a plan, a canal: Panama";
    public void palindromestrchk(){

        char chrstart;
        char chrend;
        int start = 0;
        int end = s.length() - 1;
        boolean lv_flag = false;

        if(s.isEmpty()){
            System.out.println("Not a polindrome");
        }else{

            while (start <= end) {
                chrstart = s.charAt(start);
                chrend = s.charAt(end);

                if (!Character.isLetterOrDigit(chrstart)) {
                    start++;
                } else if (!Character.isLetterOrDigit(chrend)) {
                   end--;
                } else {
                    if (Character.toLowerCase(chrstart) != Character.toLowerCase(chrend)) {
                        lv_flag = true;
                        break;
                    }
                    start++;
                    end--;
                }
            }
        }

        if(lv_flag == true){
            System.out.println("Not a Polyndrome");
        }else{
            System.out.println("Is a Palindrome");
        }
    }
}
