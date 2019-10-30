package com.test;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("请输入不大于20的正整数");
            Scanner scanner = new Scanner(System.in);
            try{
               int n  = scanner.nextInt();
               if (n <= 0 || n >20) {
                    System.out.println("输入不合法");
                    return;
                } else {
                    factorial(n);
                }
            }catch (Exception e){
                System.out.println("输入不合法");
                return;
            }
        }
    }

    //计算阶乘
    private static void factorial(int n){
        long result = 1;
        int i = n;
        while (i <= n) {
            if (i > 0) {
                result = i * result;
            } else {
                System.out.println(n+"的阶乘结果为:" + result);
                repeat(result);
                break;
            }
            i--;
        }
    }

//计算重复数字
    private static void repeat(long result) {
        int i = 0, m = 1, p = 0;
        long n;
        ArrayList<Long> list = new ArrayList<>();//阶乘结果
        ArrayList<Long> repeat = new ArrayList<>();//重复
        ArrayList<Long> temp = new ArrayList<>();//临时

        while (result > 0) {
            n = result % 10;
            list.add(n);
            result = result / 10;
        }
//        Collections.sort(list);
//        System.out.println("集合中的数字:" + list );

        while (list.size() > 1) {
            while (m < list.size()) {
                if (list.get(m).equals(list.get(0))) {
                    if (p == 0) {
                        repeat.add(list.get(m));
                        p = 1;
                    }
                    temp.add(list.get(m));
                }
                m++;
            }

//            System.out.println("temp" + temp);
            list.remove(0);
//            System.out.println("list:" + list);

            while (i < temp.size()) {
                list.remove(temp.get(i));
                i++;
            }

            temp.clear();
            p = 0;
            i = 0;
            m = 1;
        }
        System.out.println("重复元素为:" + repeat);
    }
}