import java.math.BigDecimal;

/*
Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.

        Create an application that will display the number of kilometers per liter (output)
        based on the number of miles per imperial gallon (input).

        Make sure to round off the result to two decimal points. If the answer ends with a 0,
        it should be rounded off without the 0. So instead of 5.50, we should get 5.5.

        Some useful associations relevant to this kata:
        1 Imperial Gallon = 4.54609188 litres
        1 Mile = 1.609344 kilometres
 */

public class Converter {
    private static final float LITER = 4.54609188f;
    private static final float KILOMETER = 1.609344f;

    public static float mpgToKPM(final float mpg) {
        float result = mpg * (KILOMETER / LITER);
        return BigDecimal.valueOf(result).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    public static void main(String[] args) {
        System.out.println(mpgToKPM(10));
    }
}
