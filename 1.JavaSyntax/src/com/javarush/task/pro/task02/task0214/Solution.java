package com.javarush.task.pro.task02.task0214;

import java.util.Locale;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String numb1 = console.nextLine();
        String numb2 = console.nextLine();
        String numb3 = console.nextLine();
//        String numb1 = "Строка Номер РАЗ".toLowerCase();
//        String numb2 = "Вторая строка".toUpperCase();
//        String numb3 = "Строка 3";

        System.out.println(numb3);
        System.out.println(numb2.toUpperCase());
        System.out.println(numb1.toLowerCase());
    }
}