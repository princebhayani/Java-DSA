public class solid_rhombus_pattern {
    public static void main(String[] args) {
        int lines =5;
        for(int i =0;i<lines;i++){
            for(int j = lines-1;j>i;j--){
                System.out.print("  ");
            }
            for(int j =0;j<lines;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
