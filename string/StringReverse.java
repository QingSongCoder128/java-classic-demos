public class StringReverse {
    public static void main(String[] args) {
        String s1 = "abcdef";
        char[] a = s1.toCharArray();//将字符串转换成字符数组
        for (int i = 0; i < a.length / 2; i++) {
            char temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        String s2 = String.valueOf(a);//将字符数组转换成字符串
        System.out.println(s2);
    }
}
