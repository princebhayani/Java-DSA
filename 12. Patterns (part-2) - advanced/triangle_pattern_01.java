public class triangle_pattern_01 {
    public static void main(String[] args) {
        int lines = 5;
        for(int i= 0;i<lines;i++){
            for(int j =0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
