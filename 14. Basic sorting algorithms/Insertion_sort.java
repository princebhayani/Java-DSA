public class Insertion_sort {
    public static void insertionSort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int currentEle = arr[i];
            int previousIndex = i-1;
            while(previousIndex >=0 && arr[previousIndex] > currentEle){
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
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        arrayPrint(arr);
    }
}
