package LeetCodeEx;

public class ShuffleArrLogic {

    public void shufflearray(){

        int[] shufflearr = new int[] {2,3,4,6,5,2};
        int n = 3;

        for(int i = n; i < shufflearr.length; i++){

            shufflearr[i] = (shufflearr[i] * 1024) + shufflearr[i - n];
        }

        for(int i = n, j=0; i < shufflearr.length; i++, j += 2){

            shufflearr[j] = shufflearr[i] % 1024;
            shufflearr[j+1] = shufflearr[i] / 1024;
        }

    }
}
