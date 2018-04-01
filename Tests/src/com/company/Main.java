package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Введите номер задания: ");
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        switch (q) {
            case 1:
                System.out.println("Задание 1");
                Exrc1();
                break;
            case 2:
                System.out.println("Задание 2");
                Exrc2();
                break;
            case 3:
                System.out.println("Задание 3");
                Exrc3();
                break;
            case 4:
                System.out.println("Задание 4");
                Exrc4();
                break;
            case 5:
                System.out.println("Задание 5");
                Exrc5();
                break;
            case 6:
                System.out.println("Задание 6");
                Exrc6();
                break;
        }
    }
    public static boolean simple(int n){
        if (n == 1) return false;
        for( int k = 2; k * k <= n; k++) {
            if (n % k == 0) return false;
        }
        return true;
    }
    public static void Exrc1() {

        System.out.println("Введите N: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Простые числа : ");
        for (int i = 1; i <= num; i++)
        {
            if (simple(i)) System.out.println(i);
        }
    }

    public static int fib(int a){
        if (a == 0) return 1;
        if (a == 1) return 1;
        return fib(a - 1) + fib(a - 2); }

    public static void Exrc2() {

        System.out.println("Введите N: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Числа Фибоначчи от 1 до N:");
        for (int i = 0; i <= num; i++) {
            if (fib(i) <= num)
            System.out.println(fib(i)); else break;
        }
    }


    public static void Exrc3() {

        System.out.println("Введите координаты первого отрезка: ");
        System.out.println("x1 = ");
        Scanner in1 = new Scanner(System.in);
        double x1 = in1.nextDouble();
        System.out.println("y1 = ");
        Scanner in2 = new Scanner(System.in);
        double y1 = in2.nextDouble();
        System.out.println("x2 = ");
        Scanner in3 = new Scanner(System.in);
        double x2 = in3.nextDouble();
        System.out.println("y2 = ");
        Scanner in4 = new Scanner(System.in);
        double y2 = in4.nextDouble();
        System.out.println("Введите координаты второго отрезка: ");
        System.out.println("x1 = ");
        Scanner in5 = new Scanner(System.in);
        double x3 = in5.nextDouble();
        System.out.println("y1 = ");
        Scanner in6 = new Scanner(System.in);
        double y3 = in6.nextDouble();
        System.out.println("x2 = ");
        Scanner in7 = new Scanner(System.in);
        double x4 = in7.nextDouble();
        System.out.println("y2 = ");
        Scanner in8 = new Scanner(System.in);
        double y4 = in8.nextDouble();

        double v1 = ((x4 - x3)*(y1 - y3) - (x1 - x3)*(y4 - y3));
        double v2 = ((x4 - x3)*(y2 - y3) - (x2 - x3)*(y4 - y3));
        double v3 = ((x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1));
        double v4 = ((x2 - x1)*(y4 - y1) - (x4 - x1)*(y2 - y1));
        if ((v1*v2 <= 0) && (v3*v4 <= 0)) System.out.println("Отрезки пересекаются ");
            else System.out.println("Отрезки не пересекаются");

    }

    public static int NOD(int a, int b){
        if (b == 0) return Math.abs(a);
        else return NOD(b, a % b);
    }

    public static int NOK(int a, int b) {
        return a / NOD(a, b) * b;
    }
    public static void Exrc4(){
        System.out.println("Введите числа:");
        Scanner in1 = new Scanner(System.in);
        int x = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        int y = in2.nextInt();
        System.out.println("НОД:" + NOD(x, y) + " " +"НОК:" + NOK(x, y));
    }

    public static boolean Pol(String a){
        for (int i = 0; i < a.length()/2; ++i) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1))
                return false;
        }
        return true;


    }
    public static void Exrc5(){
        System.out.println("Введите слово:");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (Pol(s)) System.out.println("Слово является палиндромом");
        else System.out.println("Слово не является палиндромом");
    }

    public static void Exrc6(){
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s = "";
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                s += c;
            }
        }
        System.out.println(s);



    }

}
