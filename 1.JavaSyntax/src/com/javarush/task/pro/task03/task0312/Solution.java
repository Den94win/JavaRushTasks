package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String string1 = str1.toUpperCase();
        String string2 = str2.toUpperCase();
        if (string1.equals(string2)) {
            System.out.println("строки одинаковые");
        } else {
            //напишите тут ваш код
            System.out.println("строки разные");

        }

    }
}
