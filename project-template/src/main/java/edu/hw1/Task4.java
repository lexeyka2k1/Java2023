package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task4 {
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6}));
        LOGGER.info(isNestable(new int[] {3, 1}, new int[] {4, 0}));
        LOGGER.info(isNestable(new int[] {9, 9, 8}, new int[] {8, 9}));
        LOGGER.info(isNestable(new int[] {1, 2, 3, 4}, new int[] {2, 3}));
    }

    public static boolean isNestable(int[] a1, int[] a2) {
        int min1 = Integer.MAX_VALUE, max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : a1) {
            min1 = Math.min(min1, num);
            max1 = Math.max(max1, num);

        }
        for (int num : a2) {
            min2 = Math.min(min2, num);
            max2 = Math.max(max2, num);
        }
        return min1 > min2 && max1 < max2;
    }
}
