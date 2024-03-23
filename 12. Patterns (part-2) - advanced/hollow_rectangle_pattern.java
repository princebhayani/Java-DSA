public class hollow_rectangle_pattern{
    public static void main(String[] args) {
        
        int col =5;
        int row =4;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(i==0 || i==(row-1) || j==0 || j==(col-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}