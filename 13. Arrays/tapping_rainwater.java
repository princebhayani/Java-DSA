public class tapping_rainwater {
    public static void tappingWater(int height[]){
        int totalWater =0;
        int lMax[] = new int[height.length];
        int rMax[] =new int[height.length];
        lMax[0] = height[0];
        rMax[height.length-1] = height[height.length-1];
        for(int i =1;i<height.length;i++){
            lMax[i] = Math.max(lMax[i-1], height[i]);
        }
        for(int i = height.length-2;i>=0;i--){
            rMax[i] = Math.max(rMax[i+1], height[i]);
        }
        for(int i =0;i<height.length;i++){
            int totalSpace = Math.min(lMax[i], rMax[i]);
            totalWater += totalSpace - height[i];
        }
        System.out.println("Total Tapping water is : "+totalWater);
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        tappingWater(height);
    }
}
