package Maths;

import java.util.Scanner;

public class NonIfABC {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a value: ");
        System.out.println("Your value: " + nonIfABC(in.nextInt()));
    }

    public static int nonIfABC(int a) {
        return (a%(a+1))*(a%(a-1));
    }
}