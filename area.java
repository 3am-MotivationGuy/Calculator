package Calculator;

import java.util.Scanner;

class Area{
    double area;
    Scanner sc = new Scanner(System.in);
    private double Square(){
        System.out.println("Enter the length");
        double length = sc.nextDouble();
        area = Math.pow(length, 3);
        Return(area);
    }

    private double Rectangle(){
        System.out.println("Enter length and breadth");
        double length = sc.nextDouble(); double breadth = sc.nextDouble();
        area = length * breadth;
        Return(area);
    }

    private double Circle(){
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        area = (22.0/7) * radius*radius;
        Return(area);
    }

    private double Triangle(){
        System.out.println("Enter the lenght of base and altitude");
        double base = sc.nextDouble(); double height = sc.nextDouble();
        area = (1/2.0) * base * height;
        Return(area);
    }
}