import java.util.Scanner;

public class Gauss {

    public static double salesUntilDate(int days, double averageSales) {
        return (days * (days + 1) / 2) * averageSales;
    }
}


