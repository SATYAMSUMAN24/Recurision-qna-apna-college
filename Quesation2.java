public class Quesation2 {
    public static  String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static void pritntdigits(int number) {
        if(number == 0) {
            return;
        }
        int lastdigit = number%10;
        pritntdigits(number/10);
        System.out.println(digits[lastdigit]+" ");
    }
    public static void main(String[] args) {
        pritntdigits(1234);
        System.out.println();
    }
}
