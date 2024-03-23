import java.util.*;

public class star_pattern_inverted {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            int x = sc.nextInt();
            for(int i = x ;i>0;i--){
                for(int j =i ;j>0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
