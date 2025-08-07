public class Test {
    public static void main1(String[] args) {
        System.out.println(10);
        //被final修饰过的变量，叫做常量，不能再进行修改了，类似于c当中的const
        final int size = 10;
        System.out.println(size);
    }

    public static void main2(String[] args) {
        //四个字节
        int a = 10;
        System.out.println(a);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //Integer为int的包装类（特殊，其他只需首字母大写）
        //这样子可以打印出int类型的最大值和最小值（-2^31~2^31-1）
        Integer b = 10;
        //当然包装类也可以当作数据类型来定义变量
    }

    public static void main3(String[] args) {
        //8个字节
        long a = 10L;
        //长整型变量的初始值后加L，标识这为长整形，否则整形数字默认为int
        System.out.println(a);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        //-2^63~2^63-1
    }

    public static void main4(String[] args) {
         /*
        短整型    2个
        -2^15    2^15  -1
         */
        short sh = 10;
        System.out.println(sh);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }

    public static void main5(String[] args) {
         /*
        字节型   1个字节
        char
        -2^7    2^7 -1
         */
        byte a = 9;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128
    }
    public static void main6(String[] args) {
        /*double d = 12.5;
        System.out.println(d); 屏蔽/取消  ctr+shift + / */
//        double a = 1;
//        double b = 2;
//        System.out.println(a / b);  屏蔽/取消  ctr + /

        double num = 1.1;
        System.out.println(num * num);//1.21   8个字节


        //单精度
        float f = 12.5F;
        System.out.println(f);
        //小数默认是double类型的，后面加F标识为float类型

    }
    public static void main7(String[] args) {
        //char 类型 是2个字节  unicode字符集
        char ch1 = 'a';
        char ch2 = '高';
        //不同于c语言，Java的字符编码包含了汉字
        System.out.println(ch1);
        System.out.println(ch2);
        Character c = 'p';
    }
    public static void main8(String[] args) {
        // 没有明确说明 大小是多少字节 ？
        boolean b = true;//Boolean
        System.out.println(b);
    }
    public static void main9(String[] args) {
        /*int a = 10;
        long b = 100L;
        //b = a;
        a = (int)b;*/

        byte a = 10;
        int b = 129;
        a = (byte)b;
        //强制转换但是不推荐，有风险
        System.out.println(a);
    }
    public static void main10(String[] args) {
        int a = 10;//4字节
        long b = 20;//8字节
        //a提升为long  long类型 和  long类型 进行运算 结果就是long类型
        int c1 = (int)(a+b);
        long c2 = a+b;//推荐这种
    }
    public static void main11(String[] args) {
        byte a = 10;
        byte b = 20;
        //虽然为两个byte类型相加，但是由于默认数字为int
        //所以会导致相加结果变为int类型
        int c = a + b;
    }
    public static void main12(String[] args) {
        String str = "hello";
        String str2 = "word";
        System.out.println(str+str2);
        //相加为拼接——helloword
        System.out.println(str.length());
        //计算长度
        System.out.println(str.charAt(0));
        //字符串可以相当于数组，这个意思就是字符串中下标为0的字符
    }
    public static void main13(String[] args) {
        int a = 10;
        //a==10
        System.out.println("a == " + a);
        //打印可以直接打印内容加变量
        int c = 20;
        System.out.println("a == " + a + c);
        System.out.println("a == " + (a + c));

        System.out.println(a + c + " = a+c");

        //System.out.printf("a = %d\n",a);
    }
    //字符串变成整数
    public static void main14(String[] args) {
        String s = "123";
        //int a = Integer.valueOf(s);//底层实现 parseInt
        int a = Integer.parseInt(s);
        System.out.println(a+1);
    }
    //整数变成字符串
    public static void fun() {
        int a = 123;
        String str = a+"";
        System.out.println(str);
        System.out.println("========");
        String str1 = String.valueOf(a);
        System.out.println(str1);
    }
}
