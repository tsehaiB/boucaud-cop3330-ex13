/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
import java.lang.Math;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int p = myApp.readP();
        double r = myApp.readR();
        int t = myApp.readT();
        int n = myApp.readN();
        System.out.print("$" + p + " invested at " + r + "% for " + t + " years compounded " + n + " times per year is ");
        System.out.printf("$%.2f.\n", myApp.calcCA(p, r, t, n));
    }
    private int readP(){
        System.out.print("What is the principal? ");
        return inp.nextInt();
    }
    private double readR(){
        System.out.print("What is the rate of interest? ");
        return inp.nextDouble();
    }
    private int readT(){
        System.out.print("What is the number of years? ");
        return inp.nextInt();
    }
    private int readN(){
        System.out.print("What is the number of times the interest is compounded per year? ");
        return inp.nextInt();
    }
    private double calcCA(int p, double r, int t, double n){
        r = r/100.0;
        return p*Math.pow(((1 + r/(n))), (n*t));
    }
}
