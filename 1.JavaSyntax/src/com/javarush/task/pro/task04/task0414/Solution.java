package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = scan.nextInt();
        int x = 0;
        do{
            System.out.println(s);
            x++;
        }while(x < count && !(count <= 0 || count >= 5));
    }
}