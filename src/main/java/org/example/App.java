package org.example;


import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.print("Введите сторону квадрата: ");
        int side = scanner.nextInt();
        float squareArea = areaCalculator.calculateSquareArea(side);
        System.out.println("Площадь квадрата: " + squareArea);

        System.out.print("Введите радиус круга: ");
        int radius = scanner.nextInt();
        double circleArea = areaCalculator.calculateCircleArea(radius);
        System.out.println("Площадь круга: " + circleArea);

        System.out.println("Введите стороны треугольника: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double triangleArea = areaCalculator.calculateTriangleArea(a, b, c);
        System.out.println("Площадь треугольника: " + triangleArea);
    }
}

