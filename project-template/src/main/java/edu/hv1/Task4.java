package edu.hv1;

public class Task4 {

    public boolean isNestable(int[] a1, int[] a2) {
        int min1 = Integer.MAX_VALUE, max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE;

        for (int num: a1) {
            min1 = Math.min(min1, num);
            max1 = Math.max(max1, num);
        }
        for (int num: a2) {
            min2 = Math.min(min2, num);
            max2 = Math.max(max2, num);
        }

        return min1 > min2 && max1 < max2;
    }
}
