public class Question_1_16 {
    public static void countVowels(String str){
        int count =0 ;
        for(int i =0;i<str.length();i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("total vowels is : "+count);
    }

    public static void main(String[] args) {
        String str = "PriNce BhaYaNi";
        countVowels(str);
    }
}