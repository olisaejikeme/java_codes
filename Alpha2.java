//Program to get input from user

import java.util.Scanner;

public class Alpha2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: "); 
        int num = scan.nextInt();
        
        scan.close();

        System.out.println("The number entered by user: "+num);
    }
}
