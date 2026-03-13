public class PrimeNumberPlus {
    public static void main(String[] args) {
        int count = 0;//我们定义一个变量来计数，为了每行输出五个，然后换行
        System.out.println("100以内的素数：");
        for (int i = 2; i <= 100; i++) {  // 素数从2开始
            boolean isPrime = true;//归零，每次判断下一个数开始，flag恢复为初始值
            for (int j = 2; j < i; j++) {  // 检查是否有因子
                if (i % j == 0) {
                    isPrime = false;
                    break;  // 有因子则不是素数，提前终止循环
                }
            }
            if (isPrime) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
