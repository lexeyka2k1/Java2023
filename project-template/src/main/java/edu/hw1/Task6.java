package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Task6 {
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(isPalindromeDescendant(11211230));
        LOGGER.info(isPalindromeDescendant(13001120));
        LOGGER.info(isPalindromeDescendant(23336014));
        LOGGER.info(isPalindromeDescendant(11));

    }

    public static boolean isPalindromeDescendant(int n) {
        String str = String.valueOf(n);
        var formatter = new StringBuilder(str).reverse().toString();
        if (str.equals(formatter)) {
            return true;
        }

        int nextGen = 0;
        for (int i = 0; i < str.length(); i += 2) {
            nextGen = nextGen * 10 + (str.charAt(i) - '0') + (str.charAt(i + 1) - '0');
        }

        return isPalindromeDescendant(nextGen);
    }
}
