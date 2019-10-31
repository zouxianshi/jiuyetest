package com.test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("请输入不大于20的正整数");
            Scanner scanner = new Scanner(System.in);
            try{
               int n  = scanner.nextInt();
               if (n <= 0 || n >20) {
                   System.out.println("非法输入");
                    return;
                } else {
                   Calculation calculation = new Calculation();
                   calculation.factorial(n);
                }
            }catch (Exception e){
                System.out.println("非法输入");
                return;
            }
        }
    }
}