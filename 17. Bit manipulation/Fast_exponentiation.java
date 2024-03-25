public class Fast_exponentiation {
    public static void fastExpo(int a , int n){
        int ans = 1;
        while(n>0){
            if((n&1)==1){
                ans = ans*a;
            }
            a=a*a;
            n = n>>1;
        }
        System.out.println("Answer is : "+ans);
    }
    public static void main(String[] args) {
        fastExpo(5, 3);
    }
}
