public class Shortest_path {
    public static void shortestPath(String str) {
        int x = 0, y = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }
        double path =Math.sqrt((double)(x*x +y*y));
        System.out.println("shortest path is : "+path);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortestPath(str);
    }
}
