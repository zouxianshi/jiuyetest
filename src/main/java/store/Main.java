package store;

import store.Entity.Phone;
import store.Impl.FunctionImpl;
import store.Service.Function;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        while (true) {
            System.out.println("############开始#############");
            System.out.println("请选择功能：1、添加   2、修改   3、删除   4、查询");
            Scanner scanner = new Scanner(System.in);
            try {
                int n = scanner.nextInt();
                switch (n) {
                    case 1:
                        Phone phone = new Phone();
                        System.out.println("添加手机参数" + "\n");
                        phone.setColor(scanner.next());
                        phone.setModel(scanner.next());
                        phone.setPrice(scanner.nextInt());
                        phone.setSize(scanner.nextInt());
                        Function function = new FunctionImpl();
                        function.add(phone);
                        break;
                    case 2:
                        System.out.println("修改手机参数");
                        break;
                    case 3:
                        System.out.println("删除手机参数");
                        break;
                    case 4:
                        System.out.println("查询手机参数");
                        break;
                }
            } catch (Exception e) {

            }
        }
    }
}
