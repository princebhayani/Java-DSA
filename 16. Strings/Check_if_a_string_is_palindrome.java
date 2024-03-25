public class Check_if_a_string_is_palindrome{
    public static void checkPalindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("String is not palindrome");
                return;
            }
        }
        System.out.println("String is Palindrome");
    }
    public static void main(String[] args) {
        String str = "racecar";
        checkPalindrome(str);
    }
}