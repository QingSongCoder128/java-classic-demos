public class FibonacciSequence03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要计算哪一项：");
        int n = scanner.nextInt();
        int num = GetNum(n);
        System.out.println(num);
    }

    public static int GetNum(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return GetNum(a-1) + GetNum(a - 2);
        }
    }
}
