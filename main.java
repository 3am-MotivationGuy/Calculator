package Calculator;

import java.util.Scanner;

class Main{
    public static void Main(){
        Volume v = new Volume();
        Area a = new Area();
        Scanner sc = new Scanner(System.in)
        System.out.println("Welcome to the calculator alpha version!");
        System.out.println("What would you like to do?\n1 - Area of a shape\n2 - Volume of a shape");
        int ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("Which shape?");
                    String shape = sc.next();
                    switch(shape){
                        case "square": System.out.println("Area of Square is" + (a.Square()));
                                        break;
                        case "rectangle": System.out.println("Area of rectangle is" + (a.Rectangle()));
                                        break;
                        case "triangle": System.out.println("Area of triangle is "+ (a.Triangle()));
                                        break;
                        case "circle": System.out.println("Area of circle is" + (a.Circle()));
                                        break;
                    }
                    break;
            case 2: System.out.println("Which shape?");
                    String shape = sc.next();
                    switch(shape){
                        case "cube": System.out.println("Volume of cube is" + (v.Cube()));
                                    break;
                        case "cuboid": System.out.println("Volume of cuboid is " + (v.Cuboid()));
                                    break;
                        case "cone": System.out.println("Volume of Cone is " + (v.Cone()));
                                    break;
                        case "cylinder": System.out.println("Volume of Cylinder is" + (v.Cylinder()));
                                    break;
                        case "sphere": System.out.println("Volume of sphere is " + (v.Sphere()));
                                    break;
                    }
        }
    }
}