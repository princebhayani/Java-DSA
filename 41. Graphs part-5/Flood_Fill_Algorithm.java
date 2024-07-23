public class Flood_Fill_Algorithm {
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol){
        if(sr<0 || sc<0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol){
            return;
        }
        image[sc][sr]=color;
        //left
        helper(image, sr, sc-1, color, vis, orgCol);
        //right
        helper(image, sr, sc+1, color, vis, orgCol);
        //up
        helper(image, sr-1, sc, color, vis, orgCol);
        //down
        helper(image, sr+1, sc, color, vis, orgCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, color);
        return image;
    }
    public static void main(String[] args) {
        
    }
}
