public class Test {
    public static void main(String[] args) {
        int num = 10;
        if(num % 2 == 0 ) {
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }

        int a = 1;
        //float、double、long、boolean这四种是不能放在switch的括号里面的
        switch (a) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("haha");
                break;
        }

        int i = 1;
        while (i <= 10) {
            System.out.print(i+" ");
            i++;
        }

        for (int n = 0; n < 10; n++) {
            System.out.println(i);
        }

        int b = 0;
        do {
            System.out.println(b);
        }while (b != 0);


    }
}
