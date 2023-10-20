package edu.hv1;

import java.util.Arrays;

public class Task7 {
    public int countK(int n) {
        if (n == 6174) {
            return 0;
        }

        int[] digits = getDigits(n);
        int ascending = getNumber(digits, true);
        int descending = getNumber(digits, false);
        int difference = Math.abs(descending - ascending);

        return 1 + countK(difference);
    }

    private int[] getDigits(int n) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    private int getNumber(int[] digits, boolean ascendingOrder) {
        if (ascendingOrder) {
            Arrays.sort(digits);
        } else {
            Arrays.sort(digits);
            reverseArray(digits);
        }
        return digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
    }

    private void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}
