public class Question_3_transpose_of_matrix {
    public static void transpose(int matrix[][]){
        int newMatrix[][] = new int[matrix[0].length][matrix.length];
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }
        print2DArray(newMatrix);
    }

    public static void print2DArray(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        print2DArray(matrix);
        System.out.println();
        transpose(matrix);

    }
}
