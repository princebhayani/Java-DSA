public class hollow_rhombus_pattern {
    public static void main(String[] args) {
        int lines =5;
        for(int i =0;i<lines;i++){
            for(int j = lines-1;j>i;j--){
                System.out.print("  ");
            }
            for(int j =0;j<lines;j++){
                if(i==0 || i==(lines-1) || j==0 || j==(lines-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
