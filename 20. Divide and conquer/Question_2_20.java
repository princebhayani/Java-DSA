import java.util.Arrays;

public class Question_2_20 {
    public static int findNum(int arr[]){
        int length = arr.length/2+1;
        int count =1;
        Arrays.sort(arr);
        for(int i =1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
                if(count == length){
                    return arr[i];
                }
            }
            else{
                count =1;
            }
        }
return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(findNum(nums));
    }
}
