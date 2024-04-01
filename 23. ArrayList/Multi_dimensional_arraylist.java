import java.util.ArrayList;

public class Multi_dimensional_arraylist{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        mainList.add(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(50);
        mainList.add(list1);

        System.out.println(mainList);

        for(int i =0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j =0;j<currList.size();j++){
                System.out.print(currList.get(j) +" ");
            }
            System.out.println();
        }
    }
}