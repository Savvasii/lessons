package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        byte b = 0;
        short c = 0;
        long d = 0;
        float e = 0.0f;
        double f = 0.0;
        boolean g = true;
        String name = "";
        char h = 'a';
        char i = 11;




        whichYear(0); // нулевого года нет
        whichYear(1);
        whichYear(4);
        whichYear(100);
        whichYear(400);
        whichYear(5000);
        whichYear(5200);
        whichYear(2001);
        whichYear(2002);
        whichYear(-1);
        whichYear(-4);
        whichYear(-400);
    }

    float formula(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    boolean comparison(int a, int b){
        return a + b > 9 && a + b < 21;
    }

    void posOrNeg(int a){
        if (a >= 1) System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }

    boolean isPosOrNeg(int a){
        return (a < 0);
    }

    void printName(String name){
        System.out.println("Hello " + name);
    }

    public static void whichYear(int year){
        if (year % 400 == 0) System.out.println("Високосный");
        else if (year % 100 == 0) System.out.println("Обычный");
        else if (year % 4 == 0) System.out.println("Високосный");
        else System.out.println("Обычный");
    }

}
