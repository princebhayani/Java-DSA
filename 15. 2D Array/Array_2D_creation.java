import java.util.Scanner;

public class Array_2D_creation {
    public static void largestElementInArray(int[][] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<array.length;i++){
            for(int j = 0 ; j<array[0].length;j++){
                if(array[i][j]>max){
                    max =array[i][j];
                }
            }
        }
        System.out.println("largest is"+max);
    }

    public static void main(String[] args) {
        int row =3, column =3;
        int[][] arrays = new int[row][column];
        try (Scanner sc = new Scanner(System.in)) {
            for(int i = 0; i<row;i++){
                for(int j = 0 ; j<column;j++){
                    arrays[i][j] = sc.nextInt();
                }
            }
        }
//        int n = arrays.length, m = arrays[0].length;
        for(int i = 0; i<row;i++){
            for(int j = 0 ; j<column;j++){
                System.out.print( arrays[i][j] +"  ");
            }
            System.out.println();
        }
        largestElementInArray(arrays);
    }
}
