package application;

import util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Program { // Testando como metodos estaticos não necessitam ser instanciados para utiliza-los
                       // Ao contrario de metodos que pertencem a classes, os quais necessitam ser instaciados para o uso
//  public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Cincumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.println("Pi value: " + Calculator.PI);
        sc.close();
    }
//    public static double circumference(double radius){
//        return 2 * PI * radius;
//    }
//
//    public static double volume(double radius){
//        return 4 * PI * radius * radius * radius / 3;
//    }


}