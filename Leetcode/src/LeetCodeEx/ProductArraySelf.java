package LeetCodeEx;

import java.util.Arrays;

public class ProductArraySelf {

    public static void findArrayprod(){

        int[] arr = new int[]{1,2,3,4,5};
        int[] result = new int[arr.length];

        int nextval = 1;

        for(int i =0; i < arr.length ; i++){

            result[i] = nextval;
            nextval *= arr[i];

        }

        nextval = 1;
        for(int i = arr.length - 1; i >= 0; i--){

            result[i] = nextval * result[i];
            nextval = nextval * arr[i];
        }

        System.out.println("Array product without self");
        Arrays.stream(result).forEach(ele-> System.out.println(ele));

    }
}
