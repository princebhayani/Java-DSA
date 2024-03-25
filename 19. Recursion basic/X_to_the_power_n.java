public class X_to_the_power_n {
    public static int powerOfx(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powerOfx(x, n - 1);
    }

    public static int powerOfxOptimum(int a,int n){
        if(n ==0){
            return 1;
        }
        int halfPowerSqr = powerOfxOptimum(a, n/2)*powerOfxOptimum(a, n/2);

        if(n%2 != 0){
            halfPowerSqr= a*halfPowerSqr;
        }
        return halfPowerSqr;
    }
    public static void main(String[] args) {
        System.out.println(powerOfx(2, 10));
        System.out.println(powerOfxOptimum(2, 10));
    }
}
