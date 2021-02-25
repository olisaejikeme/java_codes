//Program to calculate area of triangle (aot)

import java.util.Scanner;

public class Alpha5 {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter base: ");
        double base = scan.nextDouble();
         
        System.out.println("Enter height: ");
        double height = scan.nextDouble();
        
        scan.close();

        double area = (base * height)/2;

        System.out.println("The area of triangle is " +area);

    }
}
