import java.text.DecimalFormat;

/**
 * Created by zhengkevin on 2/19/17.
 */

public class DessertShoppe {

    public final double TAXRATE = 0.065;
    public final int MAX_LINE = 30;

    public int getInt(double a, int b) {

        double t = a * b;

        DecimalFormat df = new DecimalFormat("######0");

        return Integer.parseInt(df.format(t));

    }

    public String centsToDollarsAndCents(int cents) {

        if (cents < 0) {
            return "Invalid input.";
        } else if (cents >= 0 && cents < 10) {
            return ".0" + cents;
        } else if (cents >= 10 && cents < 100) {
            return "." + cents;
        } else {
            int t = cents / 100;

            cents = cents - t * 100;
            if (cents < 10) {
                return t + ".0" + cents;
            } else {
                return t + "." + cents;
            }
        }

    }

}
