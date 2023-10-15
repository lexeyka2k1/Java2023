package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task3 {
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(countDigits(4666));
        LOGGER.info(countDigits(544));
        LOGGER.info(countDigits(0));
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}


