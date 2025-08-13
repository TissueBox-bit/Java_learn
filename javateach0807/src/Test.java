public class Test {
    public static void main(String[] args) {
        System.out.println(5/2);//2
        //因为是整型，所以小数部分会被忽略掉
        System.out.println(-10%3);//-1
        System.out.println(11.5%2.0);//1.5

        int c = 10;
        c += 1;//c = c + 1

        int d = c++;

        int a = 10;
        int b = 20;
        // 注意：在Java中 = 表示赋值，要与数学中的含义区分
        // 在Java中 == 表示相等
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a <= b); // true
        System.out.println(a >= b); // false

        //只要有一个假，结果就为假
        System.out.println(a > b && a == 1);//false
        System.out.println(a < b && a == 2);//false
        System.out.println(a < b && a == 1);//true
        System.out.println(a > b && a == 2);//false
        //只要有一个为真，结果就为真
        System.out.println(a > b || a == 1);//true
        System.out.println(a < b || a == 2);//true
        System.out.println(a < b || a == 1);//true
        System.out.println(a > b || a == 2);//false

        //短路与：
        //只要第一个表达式为假则不会执行第二个表达式
        System.out.println(a > b && 10/0 == 0);//这样子并不会报错
        //短路或：
        //只要第一个表达式为真则不会执行第二个表达式
        System.out.println(a < b || 10/0 == 0);//这样子并不会报错

        System.out.println(!true);
        System.out.println(!false);

        //三目运算符
        System.out.println(a < b ? a : b);
    }
}
