package edu.hv1;

public class Task5 {

    public String fixString(String str) {
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
