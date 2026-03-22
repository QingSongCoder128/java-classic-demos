public class TraverseString {
    public static void main(String[] args) {
        String s = "abcde";
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+"\t");
        }
    }
}
