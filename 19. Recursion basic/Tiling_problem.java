public class Tiling_problem {
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        int vertical = tiling(n-1);
        int horizontal = tiling(n-2);
        return vertical +horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tiling(6));
    }
}
