import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        boolean flg = true;
        if(flg) {
            System.out.println("aaa");
        }else {
            System.out.println("nnn");
        }
        int num = 10;
        if(num % 2 == 0 ) {
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }

    public static void main2(String[] args) {
        int a = 1;
        //float、double、long、boolean这四种是不能放在switch的括号里面的
        switch (a) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("haha");
                break;
        }
    }

    public static void main3(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.print(i+" ");
            i++;
        }

        while (true) {
            System.out.println("死循环");
        }
    }

    public static void main4(String[] args) {
        //阶乘
        int i = 1;
        int ret = 1;
        while (i <= 5) {
            ret *= i;
            i++;
        }
        System.out.println(ret);
    }

    public static void main5(String[] args) {
        //1! + 2！ + 3！ + 4! +.... + 5!
        int j = 1;
        int sum = 0;
        while (j <= 5) {
            int i = 1;
            int ret = 1;
            while (i <= j) {
                ret *= i;
                i++;
            }
            j++;
            sum += ret;
            //System.out.println(ret);
        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {
        int i = 1;
        while ( i <= 7) {
            if(i == 3) {
                break;
                //i++;
                //continue;
                //System.out.println("fdsa");
            }
            System.out.println(i);
            i++;
        }
    }

    //求出1-100之间所有既能被3也能被5整除的数字，要求使用break或者continue实现
    public static void main7(String[] args) {
        int i = 1;
        while(i <= 100){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print(i+" ");
                i++;
                continue;
            }
//            if(i % 15 != 0){
//                i++;
//                continue;
//            }
//            System.out.println(i);另外一种思路
            i++;
        }

        int a = 10;
        System.out.println("hello");
    }

    public static void main8(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //5.fori
        for (int i = 0; i < 5; i++) {

        }

        int a = 10;
        System.out.println(a);
        //xxx.sout
    }

    public static void main9(String[] args) {
        int a = 0;
        do {
            System.out.println(a);
        }while (a != 0);
    }

    public static void main10(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();


        int n = scanner.nextInt();
        System.out.println(n);

        int n1 = scanner.nextInt();
        System.out.println(n1);

        float f = scanner.nextFloat();
        System.out.println(f);
    }

    public static void main11(String[] args) {
        System.out.println("输出且换行");
        System.out.print("输出但是不换行");
        System.out.printf("%d\n",19);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();
        System.out.println(age);

    }

}
