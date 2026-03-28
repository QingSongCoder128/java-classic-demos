public class CollectionAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int num = 0;
        // 循环直到填满10个不重复数字
        while (list.size() < 10) {
            num = random.nextInt(20) + 1;
            // 检查是否重复
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
