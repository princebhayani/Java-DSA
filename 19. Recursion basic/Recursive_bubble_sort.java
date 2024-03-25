public class Recursive_bubble_sort {
    public static void bubble_sort(int arr[],int n){
        if(n==1){
            return;
        }
        int didSwap =0;
        for(int j =0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j] =arr[j+1];
                arr[j+1] =temp;
                didSwap =1;
            }
        }
        if(didSwap == 0){
            return;
        }
        bubble_sort(arr, n-1);
    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {22,56,10,13,21,32,16};
        bubble_sort(arr, arr.length);
        printArr(arr);
    }
}
