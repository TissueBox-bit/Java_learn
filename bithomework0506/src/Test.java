import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transform(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //如数组：[1,2,3,4,5,6]
    //调整后可能是：[1, 5, 3, 4, 2, 6]
    public static void turn(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j + 1] % 2 == 1 && array[j] % 2 == 0){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flg = true;
                }
            }
            if(flg ==false) {
                return;
            }
        }
    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6};
        turn(array);
        System.out.println(Arrays.toString(array));
    }

//    给定一个有序整型数组, 实现二分查找
    public static int search(int[] array,int key) {
        int left = 0;
        int right = array.length;
        while(left <= right){
            int mid = (left + right) / 2;
            if(key < array[mid]){
                right = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int ret = search(array,6);
        System.out.println(ret);
    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flg = true;
                }
            }
            if(flg ==false) {
                return;
            }
        }
    }
    public static void main4(String[] args) {
        int[] array = {2,5,4,1,8,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    //你可以按任意顺序返回答案。
    //示例 1：
    //输入：nums = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

    public static int[] sum(int[] nums,int target) {
        int[] find = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    find = new int[]{i,j};
                    return find;
                }
            }
        }
        return find;
    }
    public static void main5(String[] args) {
        int[] nums = {2,7,11,15};
        int[] find = sum(nums,9);
        System.out.println(Arrays.toString(find));
    }

    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static int find(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }

    public static void main6(String[] args) {
        int[] nums = {1,2,3,2,1};
        System.out.println(find(nums));
    }

    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素
    public static int fun1(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    public static void main7(String[] args) {
        int[] array = {2,2,1,1,1,2,2};
        System.out.println(fun1(array));
    }

    //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
    // 如果存在，请返回 true ；否则，返回 false 。

    public static boolean fun2(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(nums[i] % 2 != 0 && nums[j] % 2 != 0 && nums[k] % 2 != 0){
                        return true;
                    }

                }
            }
        }
        return false;
    }
    //更好的写法
    public static boolean fun3(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                count++;
                if(count == 3){
                    return true;
                }
            }else{
                count = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,34,3,4,5,7,23,12};
        System.out.println(fun3(nums));
    }
}
