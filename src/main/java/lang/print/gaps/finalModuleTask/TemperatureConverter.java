package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float  coefficient = 9/5f;
       float fahrenheit = (temperatureCelsius*coefficient) + 32;
        System.out.println(fahrenheit);
    }
    public static void main (String args[]){
        TemperatureConverter converter = new TemperatureConverter();
        int gradusi = 1;
        converter.toFahrenheit(gradusi);

    }
}
