public class CollectionDeduplication {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加集合
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        System.out.println("去重前: " + list);
        // 创建新集合存放不重复元素
        ArrayList<String> list1 = new ArrayList<>();
        // 遍历原集合，只添加不重复的元素
        for (String str : list) {
            // 如果新集合中还没有这个元素，就添加进去
            if (!list1.contains(str)) {
                list1.add(str);
            }
        }
        System.out.println("去重后: " + list1);//这样新的集合就是去重之后的集合
    }
}
