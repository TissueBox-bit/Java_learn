public class Test {
    public static void main(String[] args) {
        byte a = 2;
        //1字节
        //-128~127
        short b = 4;
        //2字节
        //-2^15~2^15-1
        int c = 6;
        //4字节
        //-2^31~2^31-1
        long d = 8L;
        //整数默认是一个int类型的，在整数后面加L标识这是long类型的
        // (L大小写都可以，个人建议大写)
        //8字节
        //-2^63~2^63-1
        float e = 10.0F;
        //小数默认是double类型的，后面加F标识为float类型
        //(F大小写都可以，个人建议大写)
        //4字节（范围一般不关注）
        double f = 12.0;
        //8字节（范围一般不关注）
        char g = 'A';
        char h = '陈';
        //不同于c语言，Java的字符编码包含了汉字
        //2字节
        boolean i = true;


        //字符串拼接
        String str = "hello";
        String str2 = "word";
        System.out.println(str+str2);
        //相加为拼接——helloword





        //打印有两种方法
        //1.
        System.out.println("a = " + a);
        //这种可以直接打印内容加变量
        //输出结果为  a = 2
        //也能在括号种进行变量相加：
        System.out.println("a+c = " +(a+c));
        //也可以写成这样：
        System.out.println(a + c + " = a+c");

        //2.类似于c语言的打印
        System.out.printf("a = %d\n",a);

        //两种注释的快捷键
//        /* /  ---  屏蔽/取消  ctr+shift + /
 //       //    ---  屏蔽/取消  ctr + /

        //其实还有第三种
        /**
         *
         */
        //文档注释但是现在还用不上
    }

}
