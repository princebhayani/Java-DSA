public class Quick_sort {
    public static int givePart(int arr[],int si,int ei){
        int i =si-1;
        int j = si;
        int pivot = arr[ei];

        while(j<ei){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        i++;
        int temp =  arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int p = givePart(arr, si, ei);
        quickSort(arr, si, p-1);
        quickSort(arr, p+1, ei);
    }

    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={5,3,8,4,2,1,6};
        quickSort(arr, 0,(arr.length-1));
        arrayPrint(arr);;
    }
}
