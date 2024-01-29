package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            int b = 0;

            while (b < 20) {
                if (a == 0 || a == 9) {
                    System.out.print("Б");
                } else if (b == 0 || b == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                b++;
            }
            System.out.println();
            a++;
        }
    }

    public static void main1(String[] args) {
        //напишите тут ваш код
        String s = "Б";
        int a = 0;
        while (a < 20) {
            System.out.print(s);
            a++;
        }
        int e = 0;
        while (e < 8) {
            //1 - абзац + крайние левые Б
            int b = 0;
            while (b < 1) {
                System.out.print("\n" + s);
                b++;
            }
            //2 - заполнение пробелами
            int c = 0;
            while (c < 18) {
                System.out.print(" ");
                c++;
            }
            int d = 0;
            while (d < 1) {
                System.out.print(s);
                d++;
            }
            e++;
        }
        int g = 0;
        while (g < 1) {
            System.out.println("");
            g++;
        }
        int f = 0;
        while (f < 20) {
            System.out.print(s);
            f++;
        }
    }
}