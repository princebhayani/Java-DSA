public class Check_given_array_sorted_or_not {
    public static boolean sortedOrNot(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortedOrNot(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,59,7,8};
        System.out.println(sortedOrNot(arr, 0));
    }
}
