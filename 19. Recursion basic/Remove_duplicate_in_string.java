public class Remove_duplicate_in_string {
    public static void duplicates(String str){
        StringBuilder sb = new StringBuilder("");
        boolean arr[] = new boolean[26];
        for(int i =0;i<str.length();i++){
            if(arr[str.charAt(i) - 'a'] == false){
                sb.append(str.charAt(i));
            }
            arr[str.charAt(i) - 'a'] = true;
        }
        System.out.println("New string is : "+sb);
    }
    
    public static void main(String[] args) {
        String str = "appanacollege";
        duplicates(str);
    }
}
 