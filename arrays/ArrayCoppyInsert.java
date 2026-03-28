public class ArrayCoppyInsert {
    public static void main(String[] args) {
        int[] src = {1, 2, 3};
        System.out.println(Arrays.toString(src));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要添加元素的位置：");
        int index = scanner.nextInt();
        System.out.println("请输入要添加元素：");
        int num = scanner.nextInt();
        ArraysInsert(src, index, num);
    }
    private static int[] ArraysInsert(int[] src, int index, int num) {
        boolean iseEmppty = false;//用来记录这个数组是否已经满了
        for (int i = 0; i < src.length; i++) {
            if (src[i] == 0) {
                iseEmppty = true;//找到空元素了说明我们是可以插入的
                break;
            }
        }
        if (!iseEmppty) {
            src = Arrays.copyOf(src, 10);
        }
        System.arraycopy(src, index, src, index + 1, src.length - 1 - index);
        src[index] = num;
        System.out.println(Arrays.toString(src));
        return src;
    }
}
