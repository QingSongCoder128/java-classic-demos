public class FibonacciSequence03 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要计算哪一项：");
            int n = scanner.nextInt();
            int num = GetNum(n);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("请输入正整数，重新输入");
            throw new RuntimeException(e);
        }
    }

    public static int GetNum(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else if (a > 2) {
            return GetNum(a - 1) + GetNum(a - 2);
        } else {
            throw new RuntimeException();
        }
    }
}

