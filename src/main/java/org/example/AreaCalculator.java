package org.example;

public class AreaCalculator {
    public float calculateSquareArea(int side) {
      return side * side;
    }

    public double calculateCircleArea(int radius) {
        return Math.PI * radius * radius;
    }

    public double calculateTriangleArea(int a, int b, int c){
        long p = (a + b + c)/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
