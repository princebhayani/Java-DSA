import java.util.ArrayList;

public class Pair_sum_2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int si = bp + 1;
        int ei = bp;
        int n = list.size();
        while (si != ei) {
            if (list.get(ei) + list.get(si) == target) {
                return true;
            } else if (list.get(ei) + list.get(si) < target) {
                si = (si + 1) % n;
            } else {
                ei = (ei + n - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 5));
        System.out.println(pairSum2(list, 16));
    }
}