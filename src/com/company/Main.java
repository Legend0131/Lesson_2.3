package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        double x;
        x = a * b * c;
        System.out.println(x);

        x = a + b + c;
        x = x / 3;
        System.out.println(x);

        double tmp;
        double tmp1;
        if (a > b) {
            tmp = a + b;
            b = tmp - b;
            a = tmp - a;
        }
        if (b > c){
            tmp = b + c;
            b = tmp - b;
            c = tmp - c;
            tmp1 = a + b;
            if(a > b) {
                b = a;
                a = tmp1 - a;
            }
            System.out.println(a + "\n" + b + "\n" + c);
        }
        else{
            System.out.println(a + "\n" + b + "\n" + c);
        }
    }
}


