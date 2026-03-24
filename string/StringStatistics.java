public class StringStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入包含数字大小写字母的字符串: ");
        String string = scanner.nextLine();

        int digitCount = 0;
        int upperCount = 0;
        int lowerCount = 0;

        // 遍历字符串中的每个字符
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);// 获取对应索引下标的字符

            // 判断是否为数字 (0-9)
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
            // 判断是否为大写字母 (A-Z)
            else if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            }
            // 判断是否为小写字母 (a-z)
            else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            }
        }

        // 打印统计结果
        System.out.println("数字个数: " + digitCount);
        System.out.println("大写字母个数: " + upperCount);
        System.out.println("小写字母个数: " + lowerCount);
    }
}
