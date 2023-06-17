package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean isPositive = number > 0;
        System.out.println(isPositive);

    }

    public static void main (String args[]) {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        int number = -36;
        numbersPrinter.printIsPositive(number);

    }
}
