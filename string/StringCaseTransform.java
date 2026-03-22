public class StringCaseTransform {
    public static void main(String[] args) {
        /*已知字符串s,将首字母变大写，其余都变小写*/
        String s = "asdassskjfndsDAASJKDKNCAJjansdnslkdnl";
        String firstLetter = s.substring(0, 1);//截取到第一个
        String upperCase = firstLetter.toUpperCase();//第一个字母变大写
        String remainingLetter = s.substring(1);//截取除开第一个字母之后的字母
        String lowerCase = remainingLetter.toLowerCase();//其余字母变小写
        String result = upperCase + lowerCase;//字符串的拼接
        System.out.println(result);
    }
}
