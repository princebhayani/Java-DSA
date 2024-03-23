public class array_creation_and_method {
    public static void arrayChange(int arr[],int noChange){
        noChange = 90;
        for(int i =0;i<arr.length;i++){
            arr[i] = arr[i] + 10;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {12,45,78};
        int nChange = 66;
        System.out.println("Before  array:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arrayChange(arr,nChange);
        System.out.println("After  array:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(nChange);
    }
}
