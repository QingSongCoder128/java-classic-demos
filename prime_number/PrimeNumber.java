public class PrimeNumber {
    public static void main(String[] args) {
        /*素数（质数）：大于1的自然数，仅能被1和自身整除*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        boolean isPrime = true; // 假设是素数
        /*核心循环：从2到num-1逐个检查是否能整除*/
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // 如果从2-num之间找到能被整除的就标记它不是素数
                isPrime = false;
                break;
            }
        }
        //（处理特殊情况：1及以下不是素数）
        if (num <= 1) {
            System.out.println(num + " 不是素数");
        } else if (isPrime) {
            System.out.println(num + " 是素数");
        } else {
            System.out.println(num + " 不是素数");
        }
    }
}
