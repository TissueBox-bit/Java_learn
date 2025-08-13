public class Test {
    public static void main1(String[] args) {
        System.out.println(5/2);//2
        System.out.println(5/0);//报错
    }

    public static void main2(String[] args) {
        System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(11.5%2.0);//1.5
        System.out.println(1+2.0);//3.0
    }

    public static void main3(String[] args) {
        int a = 10;
        a += 1;//a = a + 1
        // 1 += 2 ;error
        System.out.println(a);

        int c = 10;
        long d = 20;
        //c = c + d;//原来这样会报错
        c += d;//帮你进行转换
        System.out.println(c);
    }

    public static void main4(String[] args) {
        int a = 10;
        int b = a++;
    }

    public static void main5(String[] args) {
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

        //System.out.println(3 < a < 5);不能这样

    }

    public static void main6(String[] args) {
        int a = 1;
        int b = 2;
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
        //& 和 | 如果表达式结果为 boolean 时, 也表示逻辑运算.
        // 但与 && || 相比, 它们不支持短路求值.
        System.out.println(10 > 20 & 10 / 0 == 0); // 程序抛出异常 不会出现短路
        System.out.println(10 < 20 | 10 / 0 == 0); // 程序抛出异常 不会出现短路

        System.out.println(!true);
        System.out.println(!false);

    }

    public static void main7(String[] args) {
        //按位与&
        //只要对应位有0，则当前位就是0
        //按位或|
        //只要对应位有1，则当前位就是1
        //按位异或^
        //只要对应位不一样就是1
        //按位取反~

    }

    public static void main8(String[] args) {
        //左移 <<
        //向左移动，右边补0（相当于*2）
        //右移 >>
        //向右移动，左边补符号位位，符号位为0补0，为1补1
        //（相当于/2取整）
        //无符号右移 >>>
        //向右移动，左边补0
    }

    public static void main9(String[] args) {
        //三目运算符
        boolean flg = true == true ? true == false ? false : true : false;
        //boolean flg = (true == true) ? (true == false ? false : true ): false;
        System.out.println(flg);
    }
}
