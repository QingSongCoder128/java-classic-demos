public class TraverseString03 {
    public static void main(String[] args) {
        String s = "abced";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + "\t");
        }
    }
}
