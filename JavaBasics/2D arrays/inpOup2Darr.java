import java.util.*;

/**
 * inpOup2Darr
 */
public class inpOup2Darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        //declaring a 2d array
        int[][] arr = new int[rows][cols];
        //input of a 2d array
        for(int i = 0; i<rows; i++){
            for(int j = 0; j < cols; j++){              //2d arrays each index stores an array so, arr[i].length is uses to iterate
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<rows; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();                       // for next line
        }

    }

    
}