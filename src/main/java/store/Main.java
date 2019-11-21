package store;

import store.Entity.Phone;
import store.Service.FunctionImpl;
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
                Phone phone = new Phone();
                Function function = new FunctionImpl(phone);
                switch (n) {
                    case 1:
                        System.out.println("添加手机参数" + "\n");
                        System.out.println("颜色");
                        phone.setColor(scanner.next());
                        System.out.println("型号");
                        phone.setModel(scanner.next());
                        System.out.println("价格");
                        phone.setPrice(scanner.nextInt());
                        System.out.println("尺寸");
                        phone.setSize(scanner.nextInt());
                        function.add(phone);
                        break;
                    case 2:
                        System.out.println("修改手机参数");
                        break;
                    case 3:
                        System.out.println("删除手机参数");
                        break;
                    case 4:
                        System.out.println("输入查询条件：1、颜色  2、型号  3、价格  4、尺寸  5、查询  6、退出");
                        int m = scanner.nextInt();
                        while (m < 6) {
                            switch (m) {
                                case 1:
                                    System.out.println("颜色:");
                                    phone.setColor(scanner.next());
                                    break;
                                case 2:
                                    System.out.println("型号:");
                                    phone.setModel(scanner.next());
                                    break;
                                case 3:
                                    System.out.println("价格:");
                                    phone.setPrice(scanner.nextInt());
                                    break;
                                case 4:
                                    System.out.println("尺寸:");
                                    phone.setSize(scanner.nextInt());
                                    break;
                                case 5:
                                    function.query(phone);
                            }
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("系统异常");
            }
        }
    }
}
