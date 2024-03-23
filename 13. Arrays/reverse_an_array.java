public class reverse_an_array {

    public static void arrayReverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int middle = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = middle;
        }
    }

    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 4, 6, 8, 10 };
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        System.out.println("Before");
        arrayPrint(numbers);
        System.out.println("After");
        arrayReverse(numbers);
        arrayPrint(numbers);

    }
}
