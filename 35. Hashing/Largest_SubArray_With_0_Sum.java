import java.util.*;
public class Largest_SubArray_With_0_Sum {
    public static int largestSunArray(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int mSize = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                mSize=Math.max(mSize,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return mSize;
    }
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10};
        System.out.println(largestSunArray(arr));
    }
}
