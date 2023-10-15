package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task2 {
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(minutesToSecond("01:00"));
        LOGGER.info(minutesToSecond("13:56"));
        LOGGER.info(minutesToSecond("10:60"));
    }

    public static int minutesToSecond(String time) {
        String[] parts = time.split(":");
        if (parts.length != 2) {
            return -1;
        }
        int minutes;
        int seconds;

        try {
            minutes = Integer.parseInt(parts[0]);
            seconds = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return -1;
        }
        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return -1;
        }
        return minutes * 60 + seconds;
    }
}
