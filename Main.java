package testovoe;

import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        Main test = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = test.calc(str);
        System.out.println(answer);
    }
    public static String calc(String input) throws IOException, ArrayIndexOutOfBoundsException {
        String[] words = input.split(" ");
        if (words.length != 3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        String s1 = words[0];
        String s2 = words[1];
        String s3 = words[2];

        int i1 = Integer.parseInt(s1);
        int i3 = Integer.parseInt(s3);

        if (i1 > 10 || i1 < 1) {
            throw new IOException();
        }
        if (i3 > 10 || i3 < 1) {
            throw new IOException();
        }

        int num = 0;
        if (s2.contains("+")) {
            num = i1 + i3;
        }
        if (s2.contains("-")) {
            num = i1 - i3;
        }
        if (s2.contains("*")) {
            num = i1 * i3;
        }
        if (s2.contains("/")) {
            num = i1 / i3;
        }
        String answer = Integer.toString(num);
        return answer;
    }
}