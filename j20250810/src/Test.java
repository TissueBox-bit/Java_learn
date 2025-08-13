public class Test {
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
