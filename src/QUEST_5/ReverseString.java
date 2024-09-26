package QUEST_5;

/**
 * 5) Escreva um programa que inverta os caracteres de um string.
 * */

public class ReverseString {
    public static String reverse(String str) {
        String rev = "";

        for (int i = str.length() -1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}
