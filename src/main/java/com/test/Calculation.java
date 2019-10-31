package com.test;

import java.util.ArrayList;

public class Calculation {
    //计算阶乘
    public void factorial(int n) {
        if (n < 0) {
            System.out.println("非法输入");
            return;
        }
        long result = 1;
        int i = n;
        while (i <= n) {
            if (i > 0) {
                result = i * result;
            } else {
                if (result < 0) {
                    System.out.println("计算结果超出范围");
                    break;
                }
                System.out.println(n + "的阶乘结果为:" + result);
                repeat(result);
                break;
            }
            i--;
        }
    }

    //计算重复数字
    public void repeat(long number) {
        long n;
        int i = 0, m = 1, p = 0;
        ArrayList<Long> list = new ArrayList<>();//阶乘结果
        ArrayList<Long> repeat = new ArrayList<>();//重复
        ArrayList<Long> temp = new ArrayList<>();//临时

        while (number > 0) {
            n = number % 10;
            list.add(n);
            number = number / 10;
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
        if (repeat.isEmpty()) {
            System.out.println("无重复元素");
        } else {
            System.out.println("重复元素为:" + repeat);
        }
    }
}
