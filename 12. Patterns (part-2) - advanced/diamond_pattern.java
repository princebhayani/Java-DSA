public class diamond_pattern {
    public static void main(String[] args) {
        int lines = 4;
        for(int i =0;i<lines;i++){
            for(int j =lines-1;j>i;j--){
                System.out.print("  ");
            }
            // for(int j =0;j<(2*i)-1;j++){
            //     System.out.print("* ");
            // }
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =0;i<lines;i++){
            for(int j =0;j<i;j++){
                System.out.print("  ");
            }
            for(int j =lines;j>i;j--){
                System.out.print("* ");
            }
            for(int j =lines-1;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
