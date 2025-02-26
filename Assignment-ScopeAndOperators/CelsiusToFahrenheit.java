import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (1.8*celsius)+32;
        System.out.println(celsius+" C : "+fahrenheit+" F");
    }
}
