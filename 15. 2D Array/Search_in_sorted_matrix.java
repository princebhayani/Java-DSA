public class Search_in_sorted_matrix {
    public static void searchInMatrix(int matrix[][],int key){
        int row =0;
        int column = matrix.length-1;
        while(row < matrix.length && column >=0){
            if(key == matrix[row][column]){
                System.out.println("key is on : ("+row+"," +column+")");
                return;
            }
            else if(key > matrix[row][column]){
                row++;
            }
            else if(key < matrix[row][column]){
                column--;
            }
        }
        System.out.println("key is not in matrix");
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        searchInMatrix(matrix, 33);
    }
}
