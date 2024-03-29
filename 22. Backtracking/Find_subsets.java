public class Find_subsets {

    public static void findSubsets(String str, String ans,int i){
        if(i == str.length()){
            System.out.print(" |"+ans+"| ");
            return;
        }
        // yes 
        findSubsets(str, ans+str.charAt(i), i+1);
        // no
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
