public class Spilt {
    public static void main(String[] args) {
        /*我现在有一个需求，把这个\\前后的内容分割成为字符串然后拼接起来，在正则表达式的规则中，两个\\代表一个\*/
        String s = "E:\\develop\\Java\\jdk-17";
        String[] split = s.split("\\\\");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+" ");
        }
    }
}
