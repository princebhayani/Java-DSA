import java.util.Stack;

public class Next_greater_element {
    public static void main(String[] args) {
        int arr[] ={6,8,0,1,3};
        int nextG[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i =arr.length-1;i>=0;i--){
            //while
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            //if else
            if(s.isEmpty()){
                nextG[i] =-1;
            }else{
                nextG[i] = arr[s.peek()];
            }
            //push s
            s.push(i);
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(nextG[i]+" ");
        }
    }
}
//next greater right
//next greater left
//next smaller right
//next smaller left

