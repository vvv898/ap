package com.example.lab01;
import java.util.Scanner;

public class SumAction {
    public Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int result;

    public SumAction() {
        System.out.print(" \nEnter A: ");
        int buff_a = sc.nextInt();
        setA(buff_a);

        System.out.print(" Enter B: ");
        int buff_b = sc.nextInt();
        setB(buff_b);

        result = a+b;
    }

    public int getA() { return a; }
    public int getB() { return b; }
    public int getResult() { return result; }

    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }
}
