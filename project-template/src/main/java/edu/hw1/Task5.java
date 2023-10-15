package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task5 {
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(fixString("123456"));
        LOGGER.info(fixString("hTsii  s aimex dpus rtni.g"));
        LOGGER.info(fixString("badce"));
    }

    public static String fixString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                sb.append(str.charAt(i + 1));
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
