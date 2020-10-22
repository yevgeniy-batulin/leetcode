package easy.array;

import java.util.LinkedList;
import java.util.List;

class AddToArrayFormOfInteger_989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> list = new LinkedList<>();
        int i = A.length - 1;
        while (i >= 0 || K > 0) {
            if (i >= 0)
                K += A[i--];
            list.addFirst(K % 10);
            K /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new AddToArrayFormOfInteger_989().addToArrayForm(new int[]{1, 2, 0, 0}, 34));
        System.out.println(new AddToArrayFormOfInteger_989().addToArrayForm(new int[]{2, 7, 4}, 181));
        System.out.println(new AddToArrayFormOfInteger_989().addToArrayForm(new int[]{2, 1, 5}, 806));
        System.out.println(new AddToArrayFormOfInteger_989().addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
        System.out.println(new AddToArrayFormOfInteger_989().addToArrayForm(new int[]{6}, 809));
    }
}