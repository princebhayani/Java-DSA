public class inverted_half_pyramid_pattern_with_numbers {
    public static void main(String[] args) {
        int lines =5;
        for(int i =lines;i>0;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
