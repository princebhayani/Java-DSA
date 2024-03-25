public class Recursive_insertion_sort {
    public static void insertion_sort(int arr[],int i,int n){
        if(i == n){
            return;
        }
        int j =i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] =arr[j];
            arr[j]=temp;
            j--;
        }
        insertion_sort(arr, i+1, n);
    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {22,56,10,13,21,32,16};
        insertion_sort(arr,0, arr.length);
        printArr(arr);
    }
}
