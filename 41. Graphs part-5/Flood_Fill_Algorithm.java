public class Flood_Fill_Algorithm {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != orgCol) {
            return;
        }
        image[sr][sc] = color;
        // left
        helper(image, sr, sc - 1, color, orgCol);
        // right
        helper(image, sr, sc + 1, color, orgCol);
        // up
        helper(image, sr - 1, sc, color, orgCol);
        // down
        helper(image, sr + 1, sc, color, orgCol);
    }

    public static void main(String[] args) {
        int[][] image ={{1,1,1},{1,1,0},{1,0,1}};
        int sr =1;
        int sc = 1;
        int color =2;

    }
}
