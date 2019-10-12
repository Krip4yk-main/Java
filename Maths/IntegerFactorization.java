package Maths;

import java.util.Scanner;

public class IntegerFactorization {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input: ");
        int n = in.nextInt();
        int qwe[] = integerFactorization(n);
        System.out.println("Output: ");
        for (int i = 1; i < qwe[0]; i++) {
            System.out.println(qwe[i]);
        }
    }

    public static int[] integerFactorization(int n) {
        int a = n;
        int mas[] = new int[33];
        int l = 1;
        do {
            boolean fatr = false;
            for (int i = 2; i <= (int)Math.sqrt(n); i++) {
                if (a%i == 0) {
                    mas[l] = i;
                    l++;
                    a/=i;
                    fatr = true;
                    break;
                }
            }
            if (!fatr) {
                mas[l] = a;
                l++;
                break;
            }
        } while (a > 1);
        mas[0] = l;
        return mas;
    }
}