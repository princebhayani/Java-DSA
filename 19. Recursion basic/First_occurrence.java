public class First_occurrence {
    public static int firstOccurrence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurrence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,61,6,9,6,445,2,6};
        System.out.println(firstOccurrence(arr, 685, 0));
    }
}
