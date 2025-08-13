import java.util.Scanner;

public class Test {
    public static void mai1(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if(i / 10 == 9 || i % 10 == 9){
                System.out.print(i+" ");
                sum++;
            }
        }
        System.out.println("一共有" + sum);
    }

    public static void main2(String[] args) {
        //给定一个数字，判定一个数字是否是素数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                System.out.println("不是素数");
                break;
            }
            System.out.println("是素数");
        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//        Math.sqrt(n)开根号的写法
//            if(n % i == 0) {
//                break;
//            }
//        }
//        if(i > Math.sqrt(n)) {
//            System.out.println(n +" 是素数！");
//        }
    }
    public static void main3(String[] args) {
        //多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            for(int i = 0;i < a;i++) {
                for(int j = 0;j < a;j++) {
                    if(i == j || i+j == (a-1)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main4(String[] args) {
        //求出0～n之间的所有“水仙花数”并输出。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int count = 0;
            int t = i;
            while(t != 0){
                count++;
                t /= 10;
            }
            t = i;
            int sum = 0;
            while(t != 0){
                sum += Math.pow(t % 10,count);
                //Math.pow(a,3) -- a的三次方
                t /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }

    public static void main5(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double sum = 0.0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0/i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {
        //给定两个数，求这两个数的最大公约数
        int a = 20;
        int b = 40;
        int c = a % b;//辗转相除法
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }

    public static void main7(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数。
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double sum = 0.0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0/i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
}
