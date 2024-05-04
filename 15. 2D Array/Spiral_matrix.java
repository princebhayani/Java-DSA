import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix {

    public static List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 0) return list;
        int cs =0;
        int ce =arr[0].length-1;
        int rs= 0;
        int re =arr.length-1;
        while(re>= rs && ce>=cs){
        for(int j = cs;j<=ce;j++){
            list.add(arr[rs][j]); 
        }
        rs++;
        for(int i = rs;i<=re;i++){
            list.add(arr[i][ce]);
        }
        ce--;
        if(rs<=re){
        for(int j =ce;j>=cs;j--){
            list.add(arr[re][j]);
        }
        re--;}
        if(cs<=ce){
        for(int i = re;i>=rs;i--){
            list.add(arr[i][cs]);
        }
        cs++;
        }
        }
        return list;
    }

public static void printSpiral(int arr[][]){
    int sr= 0,sc=0,er=arr.length-1,ec=arr[0].length-1;

    while (sc<=ec) {
        for(int i = sc;i<=ec;i++){
            System.out.print(arr[sr][i]+" ");
        }
        sr++;
        for(int i =sr;i<=er;i++){
            System.out.print(arr[i][ec]+" ");
        }
        ec--;
        for(int  i = ec;i>=sc;i--){
            System.out.print(arr[er][i]+" ");
        }
        er--;
        for(int i =er;i>=sr;i--){
            System.out.print(arr[i][sc]+" ");
        }
        sc++;
    }
}

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }};
        // spiralPrint(arr);
        System.out.println(spiralOrder(arr));
        System.out.println();
        int arr2[][] = { { 1, 2, 3, 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19, 20, 21 },
                { 22, 23, 24, 25, 26, 27, 28 }, { 29, 30, 31, 32, 33, 34, 35 }, { 36, 37, 38, 39, 40, 41, 42 },
                { 43, 44, 45, 46, 47, 48, 49 } };
        spiralPrint(arr2);
        System.out.println();
        System.out.println(spiralOrder(arr2));
    }
}
