public class DigitSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int digit = scanner.nextInt();
        int unitsDigit = 0, tensDigit = 0, hundredsDigit = 0, thousandsDigit = 0;
        unitsDigit = digit % 10;
        tensDigit = digit / 10 % 10;
        hundredsDigit = digit / 100 % 10;
        thousandsDigit = digit / 1000 % 10;
        System.out.println("你输入的数的个位是" + unitsDigit);
        System.out.println("你输入的数的十位是" + tensDigit);
        System.out.println("你输入的数的百位是" + hundredsDigit);
        System.out.println("你输入的数的千位是" + thousandsDigit);
    }
}
