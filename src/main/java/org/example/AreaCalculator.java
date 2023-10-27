package org.example;

public class AreaCalculator {
    public float getSquareArea(int side) {
      return side * side;
    }

    public double getCircleArea(int radius) {
        return Math.PI * radius * radius;
    }

    public double getTriangleArea (int a, int b, int c){
        long p = (a + b + c)/2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
