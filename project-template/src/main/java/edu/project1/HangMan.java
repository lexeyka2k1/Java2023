
package edu.project1;

import java.util.ArrayList;
import java.util.List;
import java.awt.event.KeyEvent;
import java.awt.KeyboardFocusManager;
import java.util.Scanner;

public class HangMan {

    public static class WordLibrary {
        private List<String> words;

        public WordLibrary() {
            words = new ArrayList<>();
        }

        public void addWord(String word) {
            words.add(word);
        }

        public String getRandomWord() {
            if (words.isEmpty()) {
                return "Библиотека пуста";
            }
            int randomIndex = (int) (Math.random() * words.size());
            return words.get(randomIndex);
        }

    }

    public static void UserExit() {
        System.out.println("Нажмите Esc для завершения игры");
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEvent e) -> {
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
                    System.out.println("Завершение игры");
                    System.exit(0);
                }
            }
            return false;
        });
    }

    public static List<Integer> findIndexesOfCharacter(String word, char targetChar) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == targetChar) {
                indexes.add(i);
            }
        }

        return indexes;
    }

    public static void main(String[] args) {

        WordLibrary library = new WordLibrary();
        UserExit();

        library.addWord("яблоко");
        library.addWord("банан");
        library.addWord("груша");
        library.addWord("апельсин");

        String randomWord = library.getRandomWord();

        int count = randomWord.length();
        char symbol = '*';

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(symbol);
        }
        String output = result.toString();
        System.out.println("Загадано слово");
        System.out.println(output);
        String guessable = new String(output);
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int m;

        while (!guessable.equals(randomWord) && i < count) {
            System.out.print("Введите букву или назовите слово: ");
            String input = scanner.nextLine();

            if (input.length() == 1) {
                char letter = input.charAt(0);
                int index = randomWord.indexOf(letter);

                if (index != -1) {

                    List<Integer> indexes = findIndexesOfCharacter(randomWord, letter);

                    for (int indexFind : indexes) {
                        String modifiedString = guessable.substring(0, indexFind) + letter +
                            guessable.substring(indexFind + 1);
                        guessable = modifiedString;
                    }

                    System.out.println(guessable);

                } else {
                    System.out.println("Символ '" + letter + "' не найден в слове.");

                }
            } else {
                input.equals(randomWord);
                if (!input.equals(randomWord)) {
                    System.out.println("Ответ неверный");
                }
                guessable = input;
            }
            i++;
            m = count - i;
            System.out.println("Осталось " + m + " попыток(ки, ка).");

        }
        if (guessable.equals(randomWord)) {
            System.out.println("Вы победили");
        } else {
            System.out.println("Вы проиграли");
        }
        System.out.println("Игра окончена");
    }

}

