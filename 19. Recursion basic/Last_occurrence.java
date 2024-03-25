public class Last_occurrence {

    public static int lastOccurrence(int arr[],int key,int i){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurrence(arr, key, i-1);
    }

    public static int lastOccurrence2(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int found =lastOccurrence2(arr, key, i+1);
        if(arr[i] == key && found == -1){
            return i;
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[] = {2,61,6,9,6,45,2,6};
        System.out.println(lastOccurrence(arr, 2, arr.length-1));
        System.out.println(lastOccurrence2(arr, 2, 0));
    }
}
