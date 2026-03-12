public class RandomNumber {
    public static void main(String[] args) {
    /*随机产生一个随机数，让它实现丢筛子的效果，每次的数字是1-6 Math.random()是随机产生【0 1）随机浮点数,
        乘以6得到的区间是【0 6），能取到0取不到6显然和生活中的骰子不符合，所以+1变为【1 7）*/
        int random = (int) ((Math.random() * 6) + 1);
        System.out.println(random);
    }
}
