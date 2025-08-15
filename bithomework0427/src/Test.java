public class Test {
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int a,int b) {
        return a > b ? a : b;
    }
    public static int max3(int a,int b,int c){
        return max2(a,b) > c ? max2(a,b) : c;
    }

    public static void main1(String[] args) {
        int ret = max3(2,4,5);
        System.out.println(ret);
    }


    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int add(int a,int b) {
        return a + b;
    }
    public static double add(double a,double b,double c) {
        return a + b + c;
    }

    public static void main2(String[] args) {
        int a = add(2,3);
        double b = add(1.1,2.2,3.3);
        System.out.println(a);
        System.out.println(b);
    }


    //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
    public static int max(int a,int b) {
        return a > b ? a : b;
    }
    public static double max(double a,double b) {
        return a > b ? a : b;
    }
    public static double max(double a,double b,double c){
        return max(a,b) > c ? max(a,b) : c;
    }

    public static void main3(String[] args) {
        int a = max(3,5);
        double b = max(5.6,3.5,4.5);
        System.out.println(a);
        System.out.println(b);
    }

    //汉诺塔

    // 记录移动次数
    private static int count = 0;

    /**
     * 汉诺塔递归实现
     * @param n 圆盘数量
     * @param from 起始柱子
     * @param aux 辅助柱子
     * @param to 目标柱子
     */
    public static void hanoi(int n, char from, char aux, char to) {
        // 基本情况：如果只有一个圆盘，直接从起始柱子移到目标柱子
        if (n == 1) {
            count++;
            System.out.println("第" + count + "步: 移动圆盘 " + n + " 从 " + from + " 到 " + to);
        } else {
            // 递归步骤1：将n-1个圆盘从起始柱子移到辅助柱子
            hanoi(n - 1, from, to, aux);

            // 步骤2：将第n个圆盘从起始柱子移到目标柱子
            count++;
            System.out.println("第" + count + "步: 移动圆盘 " + n + " 从 " + from + " 到 " + to);

            // 递归步骤3：将n-1个圆盘从辅助柱子移到目标柱子
            hanoi(n - 1, aux, from, to);
        }
    }

    public static void main(String[] args) {
        int diskNumber = 3; // 可以修改为任意正整数测试不同数量的圆盘
        System.out.println("汉诺塔问题求解 (" + diskNumber + "个圆盘):");
        hanoi(diskNumber, 'A', 'B', 'C');
        System.out.println("完成！总共需要 " + count + " 步");
    }
}


