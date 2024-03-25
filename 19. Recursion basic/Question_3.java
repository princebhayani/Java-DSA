public class Question_3 {
    public static int stringLength(String str) {
        if(str.length() == 0) {
        return 0;
        }
        return stringLength(str.substring(1)) + 1;
        }
    public static void main(String[] args) {
        System.out.println(stringLength("prince"));
    }
}
