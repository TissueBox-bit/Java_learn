import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("读入一个整型：");
        int age = scan.nextInt();
        System.out.println(age);//12 回车

        scan.nextLine();

        System.out.println("读入一个字符串：");
        String str = scan.nextLine();
        System.out.println(str);

        System.out.println("读入一个小数：");
        float f = scan.nextFloat();
        System.out.println(f);
    }

    public static void main2(String[] args) {
        Random randow = new Random();
        int randNum = randow.nextInt(100);
        System.out.println(randNum);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();
            if(num < randNum) {
                System.out.println("小了");
            }else if(num == randNum) {
                System.out.println("等于");
                break;
            }else {
                System.out.println("大了");
            }
        }
    }


    //方法定义
    //修饰符 返回值类型 方法名称([参数类型 形参 ...])
    public static boolean isLeapYear(int year) {
        System.out.println("方法被调用了....");
        if((0 == year % 4 && 0 != year % 100) || 0 == year % 400){
            return true;
        }else{
            return false;
        }
    }

    public static void main3(String[] args) {
        boolean ret = isLeapYear(2008);
        if(ret == true) {
            System.out.println("是闰年！");
        }
    }


    public static void func(int year) {
        year = 100;
    }

    //学完类和对象以后 才能真正理解 怎么交换
    public static void swap(int a,int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main4(String[] args) {
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.println(x +" " + y);
    }

    public static void main5(String[] args) {
        int year = 2008;
        //&year;
        //java无指针
        func(year);
        System.out.println(year);
    }




    //方法重载
    //方法名一样
    //参数列表不一样（个数、类型、顺序）
    //与返回值无关（即不能只改方法返回类型，这样会报错）
    public static int add(int a,int b,short c) {
        return a+b+c;
    }
    public static int add(int a,short c,int b) {
        return a+b+c;
    }
    public static int add(int a,int b) {
        return a+b;
    }
    public static double add(double a,double b) {
        return a+b;
    }

    public static void main13(String[] args) {
        int x = 1;
        int y = 2;
        int ret = add(x,y);
        System.out.println(ret);

        double d1 = 1.0;
        double d2 = 2.0;
        double ret2 = add(d1,d2);
        System.out.println(ret2);


        int a = 10;
        //int a = 20;

    }


    //斐波那契递归和循环写法（要使用循环写法更好）
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fib2(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main20(String[] args) {
        System.out.println(fib2(1));
        System.out.println(fib2(5));
        System.out.println(fib2(6));
        System.out.println(fib2(40));
    }

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    public static void print(int n) {
        if(n < 10) {
            System.out.println(n);
            return;
        }
        print(n/10);
        System.out.println(n % 10);
    }

    //递归求 1 + 2 + 3 + ... + n
    public static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和. 例如，输入 1729, 则应该返回
    //1+7+2+9，它的和是19
    public static int sumFunc(int n) {
        if(n < 10) {
            return n;
        }
        return n % 10 + sumFunc(n/10);
    }
}
