public class PrimeNumberPlus {
    public static void main(String[] args) {
        System.out.println("100以内的素数：");
        for (int i = 2; i <= 100; i++) {  // 素数从2开始
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {  // 检查是否有因子
                if (i % j == 0) {
                    isPrime = false;
                    break;  // 有因子则不是素数，提前终止循环
                }
            }
            if (isPrime) {
                System.out.print(i+"\t");
            }
        }
    }
}
