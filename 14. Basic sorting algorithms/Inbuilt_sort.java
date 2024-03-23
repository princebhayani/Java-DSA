import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_sort {
    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayPrint2(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        arrayPrint(arr);

        int arr2[] = {5,4,8,1,6,3,7,2};
        Arrays.sort(arr2,2,7);
        arrayPrint(arr2);

        Integer arr3[] = {5,4,8,1,6,3,7,2};
        Arrays.sort(arr3,Collections.reverseOrder());
        arrayPrint2(arr3);

        Integer arr4[] = {5,4,8,1,6,3,7,2};
        Arrays.sort(arr4,2,7,Collections.reverseOrder());
        arrayPrint2(arr4);
    }
}
