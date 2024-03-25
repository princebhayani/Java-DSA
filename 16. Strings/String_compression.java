public class String_compression {
    public static void compressionString(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch);
        int count = 0;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (sb.charAt(j) != str.charAt(i)) {
                sb.append(count);
                sb.append(str.charAt(i));
                count = 0;
                j += 2;
                i--;
            } else {
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        compressionString(str);
    }
}



// public class StringCompressionAlpha {
//     public static String stringComp(String str){
//         StringBuilder sb =new StringBuilder("");

//         for(int i = 0; i<str.length()-1;i++){
//             Integer j =1 ;
//             while (i<str.length()-1 &&  str.charAt(i) == str.charAt(i+1)  ){
//                 j++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if( j >1 ){
//                 sb.append(j);
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) {
//         String str = "aaabbcccdd";
//         System.out.println(stringComp(str));
//     }
// }