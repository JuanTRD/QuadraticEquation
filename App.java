import QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter C: ");
        double c = scanner.nextDouble();
        QuadraticEquation QuadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Delta is: " + QuadraticEquation.getDelta());
        QuadraticEquation.getRoot();

    }
}
