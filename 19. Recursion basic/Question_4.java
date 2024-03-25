public class Question_4 {
    public static void subStringCount(String str,int i,int j,int count){
        if(i== str.length()){
            return;
        }
        if( str.length() ==1 ||(str.charAt(i) == str.charAt(str.length()-1))){
            count++;
        }
        subStringCount(str.substring(j), i+1,j, count);
        subStringCount(str.substring(j), i, j+1, count);
        System.out.println(count);
    }
    public static void main(String[] args) {
        subStringCount("abcab", 0,0, 0);
    }
}
