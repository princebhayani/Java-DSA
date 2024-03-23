public class Counting_sort_descending_order {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[arr.length+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j =0;
        for(int i = count.length-1;i>0;i--){
            while(count[i] >0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={3, 6, 2, 1,8, 7, 4, 5, 3, 1};
        countingSort(arr);
        arrayPrint(arr);
    }
}
