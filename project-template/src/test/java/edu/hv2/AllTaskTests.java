package edu.hv2;
import edu.hv1.Task2;
import edu.hv1.Task3;
import edu.hv1.Task4;
import edu.hv1.Task5;
import edu.hv1.Task6;
import edu.hv1.Task7;
import edu.hv1.Task8;
import edu.hv1.Task9;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class AllTaskTests {

    @Test
    @DisplayName("Checking covert minutest to string")
    void shouldConvertMinutesToSecond() {
        var task = new Task2();
        String errMessage = "time is ";

        // Это максимально примитивный вариант,
        // оставил их тебе на посмотреть, смотри тест ниже и попробуй эти переделать под них
        Assertions.assertEquals(60, task.minutestToSecond("01:00"), errMessage + "01:00");
        Assertions.assertEquals(836, task.minutestToSecond("13:56"), errMessage + "13:56");
        Assertions.assertEquals(-1, task.minutestToSecond("10:60"), errMessage + "10:60");
    }

    @Test
    @DisplayName("The number of digits in decimal form of a number")
    void shouldCountingDigits() {
        var task = new Task3();
        // создаю map в которые можно положить ключ, значение => k,v
        Map<Integer, Integer> results = Map.of(
                4, 4666,
                3, 544,
                1, 0
        );

        // Открываю цикл, который идет до конца мапы и достаю ключ значение и загружаю по очереди в проверку
        for (Map.Entry<Integer, Integer> in : results.entrySet()) {
            Assertions.assertEquals(
                    in.getKey(),
                    task.countDigits(in.getValue()),
                    // обрати внимание на это, это более продвинутый способ записи сообщения чем на 20
                    String.format("value is %d", in.getValue())
            );
        }
    }

    @Test
    @DisplayName("Is the arrays nested or not")
    void shouldCheckNestable() {
        var task = new Task4();
        String errMessage = "arrays ";

        var result1 = task.isNestable(new int[]{1, 2, 3, 4}, new int[]{0, 6});
        var result2 = task.isNestable(new int[]{3, 1}, new int[]{4, 0});
        var result3 = task.isNestable(new int[]{9, 9, 8}, new int[]{8, 9});
        var result4 = task.isNestable(new int[]{1, 2, 3, 4}, new int[]{2, 3});

        Assertions.assertTrue(result1, errMessage + "{1, 2, 3, 4} {0, 6}");
        Assertions.assertTrue(result2, errMessage + "{3, 1} {4, 0}");
        Assertions.assertFalse(result3, errMessage + "{9, 9, 8} {8, 9}");
        Assertions.assertFalse(result4, errMessage + "{1, 2, 3, 4} {2, 3}");
    }

    @Test
    @DisplayName("Checking correct fix strings")
    void shouldReturnCorrectString() {
        var task = new Task5();
        Map<String, String> map = Map.of(
                "214365", "123456",
                "This is a mixed up string.", "hTsii  s aimex dpus rtni.g",
                "abcde", "badce"
        );

        for (Map.Entry<String, String> in : map.entrySet()) {
            Assertions.assertEquals(
                    in.getKey(),
                    task.fixString(in.getValue()),
                    String.format("value is %s", in.getValue())
            );
        }
    }

    @Test
    @DisplayName("Checking all value is palindrome")
    void shouldCheckPalindrome() {
        var task = new Task6();
        List<Integer> values = List.of(11211230, 13001120, 23336014, 11);

        for (int in : values) {
            Assertions.assertTrue(
                    task.isPalindromeDescendant(in),
                    String.format("value is %d", in)
            );
        }
    }

    @Test
    @DisplayName("Checking a function that for a given number will return the number of steps")
    void shouldCountingK() {
        // В java 17 появилась такая вещь как record это специфический класс, почитай про него
        // Это замена карте, чем на 2 теста выше, разница в том, что map не может в ключе хранить повторки
        // А record может
        var task = new Task7();
        record Values(int expected, int actual) {
        }
        List<Values> testValues = List.of(
                new Values(5, 6621),
                new Values(4, 6554),
                new Values(3, 1234)
        );


        for (Values in : testValues) {
            Assertions.assertEquals(
                    in.expected,
                    task.countK(in.actual),
                    String.format("value is %d", in.actual)
            );
        }
    }

    @Test
    @DisplayName("Checking the execution of cyclic bit shifting")
    void shouldDoCyclicShift() {
        var task = new Task8();
        record Values(int val1, int val2, int expected) {
        }
        List<Values> testValues = List.of(
                new Values(16, 1, 32),
                new Values(17, 2, 68)
        );

        Assertions.assertEquals(4, task.rotateRight(8, 1), "value is 8 1");
        for (Values in: testValues) {
            Assertions.assertEquals(in.expected, task.rotateLeft(in.val1, in.val2), String.format("value is %d %d", in.val1, in.val2));
        }
    }

    @Test
    @DisplayName("Check that the knights are placed on the chessboard so that no knight can capture another knight")
    void shouldCheckBoard() {
        var task = new Task9();

        int[][] board1 = {
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0}
        };
        int[][] board2 = {
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 0, 1}
        };
        int[][] board3 = {
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0}
        };

        Assertions.assertTrue(task.knightBoardCapture(board1), "board1");
        Assertions.assertFalse(task.knightBoardCapture(board2), "board2");
        Assertions.assertFalse(task.knightBoardCapture(board3), "board3");

    }
}
