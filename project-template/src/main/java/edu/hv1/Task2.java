package edu.hv1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task2 {
    private static final Logger LOGGER = LogManager.getLogger(Task2.class);

    public static void main(String[] args) {
        System.out.println(new Task2().minutestToSecond("01:00"));
        System.out.println(new Task2().minutestToSecond("13:56"));
        System.out.println(new Task2().minutestToSecond("10:60"));
    }

    public int minutestToSecond(String time) {
        //"01:00"
        String[] parts = time.split(":"); // ["01","00"] "01:10:01" "aa:02"
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

        if (minutes < 0 || seconds < 0 || seconds>= 60) {
            return -1;
        }

        return minutes * 60 + seconds;
    }
}
