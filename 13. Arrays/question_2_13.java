// not solved
// i did not understand this question 
public class question_2_13 {
    public static int findPivot(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[start] && target < arr[mid]){

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(findPivot(num, target));
    }
}
