package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        while (number != 0){
            int digit = number % 10;
            sum = sum + digit;
            number /= 10;
        }
        System.out.println(sum);
    }
    public static void main (String args[]){
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        int number = 123456789;
        digitsSumCalculator.calculateSum(number);
    }
}
