import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double width, length, value, area, price;

        System.out.print("Enter the width of the land: ");
        width = sc.nextDouble();

        System.out.print("Enter the length of the land: ");
        length = sc.nextDouble();

        System.out.print("Enter the price per square meter: ");
        value = sc.nextDouble();

        area = width * length;

        System.out.printf("Area of the land = %.2f\n", area);

        price = area * value;

        System.out.printf("Price of the land = %.2f\n", price);

        sc.close();
    }
}
