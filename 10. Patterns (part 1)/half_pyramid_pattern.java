import java.util.*;

public class half_pyramid_pattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int x = sc.nextInt();
            for(int i = 1;i<=x;i++){
                for(int j =1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
