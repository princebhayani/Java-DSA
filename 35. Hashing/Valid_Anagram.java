import java.util.HashMap;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<t.length();i++){
            char ch =t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) ==1){
                    map.remove(ch);
                }else {
                    map.put(ch,map.get(ch)-1);
                }
            }else {
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("race", "care"));
        System.out.println(isAnagram("heart", "earth"));
        System.out.println(isAnagram("tulip", "lipid"));
    }
}
