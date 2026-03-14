public class NumberSwap {
    public static void main(String[] args) {
        // 初始化三个整数变量
        int a = 10;
        int b = 20;
        System.out.println("交换前: a = " + a + ", b = " + b);
        int temp; // 临时变量用于暂存数据
        /*交换a和b*/
        temp = a;
        a = b;
        b = temp;
        System.out.println("交换后: a = " + a + ", b = " + b );
    }
}
