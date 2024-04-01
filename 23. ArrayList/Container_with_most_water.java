import java.util.ArrayList;

public class Container_with_most_water {
    public static int mostWater(ArrayList<Integer> height){
        int maxWater =0;
        for(int i=0;i<height.size();i++){
            for(int j =i+1;j<height.size();j++){
                int water = Math.min(height.get(i), height.get(j));
                int width = j-i;
                maxWater = Math.max(maxWater, water*width);
            }
        }
        return maxWater;
    }

    public static int mostWater2(ArrayList<Integer> height){
        int maxWater =0;
        int lp =0;
        int rp = height.size()-1;

        while(lp <rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            maxWater=Math.max(maxWater,ht*width);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(mostWater(height));
        System.out.println(mostWater2(height));

    }
}
