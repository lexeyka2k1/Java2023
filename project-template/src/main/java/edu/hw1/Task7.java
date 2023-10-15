package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task7 {

    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(countK(6621));
        LOGGER.info(countK(6554));
        LOGGER.info(countK(1234));
    }

    public static int countK(int n) {
        int count = 0;
        while (n != 6174) {
            n = k(n);
            count++;
        }
        return count;
    }

    public static int k(int n) {
        String str = String.valueOf(n);
        int nextGen = 0;
        for (int i = 0; i < str.length(); i += 2) {
            nextGen = nextGen * 10 + (str.charAt(i) - '0') + (str.charAt(i + 1) - '0');
        }

        return nextGen;
    }
}
