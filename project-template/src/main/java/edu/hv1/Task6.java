package edu.hv1;

public class Task6 {

    public boolean isPalindromeDescendant(int number) {
        String numberString = String.valueOf(number);

        while (numberString.length() > 1) {
            if (isPalindrome(numberString))
                return true;

            numberString = getNextGeneration(numberString);
        }

        return false;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    private String getNextGeneration(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i += 2) {
            int sum = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1));
            sb.append(sum);
        }

        return sb.toString();
    }
}
