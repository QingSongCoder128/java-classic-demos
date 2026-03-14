public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你输入一个整数：");
        int number = scanner.nextInt();
        int index = 0;//用于记录找到那个数的下标
        boolean isFind = false;
        int[] arr = {20, 56, 24, 89, 100, 120, 15, 52};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                isFind = true;
                break;
            }
        }
        if (isFind) {
            System.out.println("找到了，是数组的第" + (index + 1) + "个数");
        } else {
            System.out.println("没找到");
        }
    }
}
