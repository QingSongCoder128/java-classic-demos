public class ArrayCoppyDelete {
    public static void main(String[] args) {
        //数组删除
        int[] src={1,2,3,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除元素的位置：");
        int index = scanner.nextInt();
        System.out.println(Arrays.toString(src));
        System.arraycopy(src, index+1, src,index,src.length-1-index );
        System.out.println(Arrays.toString(src));
    }
}
