package edu.hw1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task8 {
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(rotateRight(8,1));
        LOGGER.info(rotateLeft(16, 1));
        LOGGER.info(rotateLeft(17, 2));

    }

    public static int rotateLeft(int n, int shift) {
        return (n << shift) | (n >>> (32 - shift));
    }

    public static int rotateRight(int n, int shift) {
        return (n >>> shift) | (n << (32 - shift));
    }

}
