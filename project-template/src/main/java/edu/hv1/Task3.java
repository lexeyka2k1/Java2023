package edu.hv1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Task3 {
    public int countDigits(int num) {
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
