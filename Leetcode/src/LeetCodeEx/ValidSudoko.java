package LeetCodeEx;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {

    public void chkSudoko(){

        char[][] sudoko = new char[][] {{'5','3','.','.','7','.','.','.','.'},
                                        {'1','2','3','4','5','6','7','8','9'},
                                        {'1','2','3','4','5','6','7','8','9'},
                                        {'1','2','3','4','5','6','7','8','9'},
                                        {'1','2','3','4','5','6','7','8','9'},
                                        {'1','2','3','4','5','6','7','8','9'},
                                        {'1','2','3','4','5','6','7','8','9'},
                                        {'1','2','3','4','5','6','7','8','9'},
                                        {'1','2','3','4','5','6','7','8','9'}};

        Set vldsudoko = new HashSet();
        char vldflag = ' ';

        for(int i = 0; i<9; i++){

            for(int j=0; j<9;j++){

                if(sudoko[i][j] == '.')
                    continue;

                if(vldsudoko.contains(sudoko[i][j] + "row" +i) || vldsudoko.contains(sudoko[i][j] + "col" +j) ||
                        vldsudoko.contains(sudoko[i][j] +"block"+ i/3 + j/3)) {

                    vldflag = 'x';
                    break;
                }

                vldsudoko.add(sudoko[i][j] + "row" +i);
                vldsudoko.add(sudoko[i][j] + "col" +j);
                vldsudoko.add(sudoko[i][j] +"block"+ i/3 + j/3);

            }

            if(vldflag == 'x') {
                break;
            }
        }

        if(vldflag == 'x'){
            System.out.println("Invalid Sudoko");
        }else{
            System.out.println("Valid Sudoko");
        }
    }
}
