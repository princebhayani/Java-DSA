public class largest_in_array {
    public static int largestNum(int arr[]) {
        int largest = Integer.MIN_VALUE; // infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 6, 3, 5 };

        System.out.println("largest value in array is : " + largestNum(numbers));
    }
}
