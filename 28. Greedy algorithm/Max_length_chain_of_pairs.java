import java.util.Arrays;
import java.util.Comparator;

public class Max_length_chain_of_pairs{
    public static void main(String[] args) {
        int pairs[][] ={{5,25},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int chainLen =1;
        int chainEnd = pairs[0][1];
        for(int i =0;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain : "+chainLen);
    }
}