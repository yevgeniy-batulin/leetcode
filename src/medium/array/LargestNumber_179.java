package medium.array;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber_179 {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort((a, b) -> {
            String first = a + b;
            String second = b + a;
            return second.compareTo(first);
        });

        if (list.get(0).equals("0")) {
            return "0";
        }
        StringBuilder number = new StringBuilder();
        for (String num : list) {
            number.append(num);
        }
        return number.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LargestNumber_179().largestNumber(new int[]{3, 30, 34, 5, 9}));
    }
}
