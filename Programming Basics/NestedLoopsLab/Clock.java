package NestedLoopsLab;

import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int h = 0; h <= 23 ; h++) {
            for (int min = 0; min <= 59 ; min++) {
                System.out.printf("%d:%d%n", h, min);
            }

        }
    }
}
