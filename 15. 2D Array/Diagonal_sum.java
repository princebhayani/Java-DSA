public class Diagonal_sum {
    public static void diagonalSum(int arr[][]){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+= arr[i][i];
            if(i != (arr[0].length-1-i)){
                sum+= arr[i][arr.length-i-1];
            }
        }
        System.out.println("sum of diagonal elements is : "+sum);
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        diagonalSum(arr);
        int arr2[][] = { { 1, 2, 3, 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19, 20, 21 },
                { 22, 23, 24, 25, 26, 27, 28 }, { 29, 30, 31, 32, 33, 34, 35 }, { 36, 37, 38, 39, 40, 41, 42 },
                { 43, 44, 45, 46, 47, 48, 49 } };
        diagonalSum(arr2);
    }
}
