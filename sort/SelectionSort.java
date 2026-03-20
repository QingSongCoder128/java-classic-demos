public class SelectionSort {
    /*使用选择排序将数组中的数据从小到大排序*/
    public static void main(String[] args) {
        int[] a = new int[]{7, 8, 6, 10, 58, 42, 30, 100};
        //排序前
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //排序后
        System.out.println(Arrays.toString(a));
    }
}
