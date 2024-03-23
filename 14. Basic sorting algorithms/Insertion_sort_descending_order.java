public class Insertion_sort_descending_order {
    public static void insertionSort(int arr[]){
        for(int i =1;i<arr.length;i++){
            int currentEle = arr[i];
            int previousIndex = i-1;
            while(previousIndex >=0 && currentEle > arr[previousIndex]){
                arr[previousIndex+1] = arr[previousIndex];
                previousIndex--;
            }
            arr[previousIndex+1] = currentEle;
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
        insertionSort(arr);
        arrayPrint(arr);
    }
}
