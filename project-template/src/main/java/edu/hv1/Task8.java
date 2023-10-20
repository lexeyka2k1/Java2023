package edu.hv1;

public class Task8 {

    public int rotateLeft(int n, int shift) {
        int bits = Integer.SIZE;
        shift = shift % bits; // Ограничиваем сдвиг значением размера целого числа
        return (n << shift) | (n >>> (bits - shift));
    }

    public int rotateRight(int n, int shift) {
        int bits = Integer.SIZE;
        shift = shift % bits; // Ограничиваем сдвиг значением размера целого числа
        return (n >>> shift) | (n << (bits - shift));
    }
}
