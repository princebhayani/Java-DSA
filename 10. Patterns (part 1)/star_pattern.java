import java.util.Scanner;

public class star_pattern{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();
            for(int i =1;i<=x;i++){
                for(int j= 0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
           System.out.println("not running");
        }
    }
}
