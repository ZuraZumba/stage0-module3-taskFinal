package lang.print.gaps.finalModuleTask;

import java.awt.desktop.SystemEventListener;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = 0;
        while (number !=0){
            int digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;

            number /= 10;
        }
        System.out.println(reversedNumber);


    }
    public static void main (String args[]){
        NumberReverter reverter = new NumberReverter();
        int number = -1234;
        reverter.revert(number);
    }
}
