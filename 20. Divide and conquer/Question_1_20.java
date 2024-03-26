public class Question_1_20 {
    public static void mergeSort(String arr[],int si,int ei){
        if(si>= ei){
            return;
        }
        int mid =(si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        int i = si;//left part
        int j = mid+1; // right part
        int k = 0;
        String temp[] = new String[ei-si+1];

        while(i<= mid && j<= ei){
            if(arr[i].compareTo(arr[j]) <= 0){
                temp[k]= arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void arrayPrint(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length-1);
        arrayPrint(arr);
    }
}
