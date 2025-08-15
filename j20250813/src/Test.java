import java.util.Arrays;

public class Test {

    public static void main1(String[] args) {
        //数组的定义
        int[] array = {1,2,3,4,5,6};
        int[] array2 = new int[]{1,2,3,4,5,6};
        int[] array3 = new int[10];

        //int array4[] = {1,2,3,4}; 不建议

        int[] array4;
        array4 = new int[4];

        /*int[] array5;
        array5 = {1,2,3,4};*/

        boolean[] flg = new boolean[3];

    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        //第一种可以找到对应下标内容
        System.out.println();
        System.out.println("=====");
        //for each循环
        for (int x : array) {
            System.out.print(x+" ");
        }
        //第二种无法找到对应下标的内容
        System.out.println();
        System.out.println("===Arrays===");
        //操作数组的工具类  Arrays
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }

    public static void main3(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        int[] array2 = new int[]{1,2,3,4,5};
        array2[0] = 100;
        array2[1] = 200;
        array1 = array2;
        //array1这个引用指向了array2这个引用所指向的对象
        //当2个引用同时指向同一个对象的时候
        //通过任何一个引用都能修改这个对象的值
        //而原来array1指向的对象由于一直没有引用指向它，被JVM自动回收了
        array1[2] = 300;
        array1[3] = 400;
        array2[4] = 500;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    //需求：把数组当中的每个数据 扩大2倍
    public static int[] func1(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i] * 2;
        }
        return ret;
    }

    //需求：把数组当中的每个数据 扩大2倍 -> 数组本身上扩大
    public static void func2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        func2(array);
        System.out.println(Arrays.toString(array));

        //int[] array2 = null;
        //System.out.println(array2.length);
        //System.out.println(array2[0]);
    }

    public static void main5(String[] args) {
        int[] array = {1,2,31,4,15};
        System.out.println("排序前的数组："+Arrays.toString(array));
        Arrays.sort(array);//默认从小到大排序
        System.out.println("排序后的数组："+Arrays.toString(array));

        int index = Arrays.binarySearch(array,1,3,15);//[1,3)
        //查找数组中对应元素是否存在，存在返回对应下标，不存在返回负数
        //中间1，3是范围


//        int index = binarySearch(array,3);

        System.out.println(index);

    }

    //二分查找-> 必须是有序的数组
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if(array[mid] == key) {
                return mid;
            }else if(array[mid] > key) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
    /**
     * 查找效率 比较低  因为 他是 挨个查找
     * @param array
     * @param key
     * @return
     */
    public static int findNum(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public static String myToString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if(i < arr.length - 1){
                s += " ";
            }
        }
        s += "]";
        return s;
    }

    public static void main6(String[] args) {
        int[] arr = {1,2,3,4,5};
        String ret = myToString(arr);
        System.out.println(ret);

    }

    public static void funcc1(int[] array) {
        array[0] = 99;
    }

    public static void funcc2(int[] array) {
        array = new int[]{9,8,7,6,5};
    }

    public static void main7(String[] args) {
        int[] array = {1,2,3,4,5};
//        funcc1(array);//这种可以
        funcc2(array);//不能通过在方法中重新定义（重新赋值）数组变量来改变原数组
        System.out.println(Arrays.toString(array));

    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        //i 代表趟数
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg ==false) {
                return;
            }
        }
    }

    public static void main8(String[] args) {
        int[] array = {1,2,31,4,15};
        System.out.println("排序前的数组："+Arrays.toString(array));
        bubbleSort(array);//默认从小到大排序
        System.out.println("排序后的数组："+Arrays.toString(array));
    }

    public static void main9(String[] args) {
        int[] array = {1,2,31,4,15};
        //int[] copy = Arrays.copyOf(array,array.length*2);
        //这个可以拓展数组

        //int[] copy = Arrays.copyOfRange(array,1,3);
        //也可以拷贝一部分数组

        //int[] copy = copyArray(array);
        int[] copy = new int[array.length];
        System.arraycopy(array,0,copy,0,array.length);
        //底层运行逻辑
        System.out.println(Arrays.toString(copy));
    }

    public static void main10(String[] args) {
        int[] array1 = {1,2,31,4,15};
        int[] array2 = {1,2,31,4,15};
        System.out.println(array1 == array2);
        //这样子会报false
        boolean flg = Arrays.equals(array1,array2);
        //这样比较就是true
        System.out.println(flg);

        int[] ret = new int[10];
        Arrays.fill(ret,1,3,-1);
//        填充数组，一样可以限定范围
        System.out.println(Arrays.toString(ret));
    }
    public static void main11(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        /*System.out.println(array.length);//行数

        System.out.println(array[0].length);//列数
        System.out.println(array[1].length);

        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
*/
    //二维数组 就是一个特殊的一维数组
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        System.out.println();
        }//第一种遍历数组的方法

        System.out.println("=====");

        //第二种用for each遍历的方法
        for(int[] tmpArray : array) {
        for(int x : tmpArray) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
        System.out.println("=====");

    //String ret = Arrays.toString(array);//这样会输出地址
    String ret = Arrays.deepToString(array);
        System.out.println(ret);

    int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
    int[][] array3 = new int[2][3];//默认都是0

    // Java当中 的二维数组 是不可以省略行的
    int[][] array4 = new int[2][];//不规则二维数组
    //因为可以这样
    array4[0] = new int[3];
    array4[1] = new int[5];
    //同一个数组每一行不同列
    }
}
