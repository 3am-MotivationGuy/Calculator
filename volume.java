package Calculator;

class Volume{
    double volume;
    Scanner sc = new Scanner(System.in);
    private double Cuboid(){
        System.out.println("Enter length, breadth and height");
        double length = sc.nextDouble(); double breadth = sc.nextDouble(); double height = sc.nextDouble();
        volume = length*breadth*height;
        Return(volume);
    }

    private double Cube(){
        System.out.println("Enter length of side");
        double length = sc.nextDouble();
        volume = length*length*length;
        Return(volume);
    }

    private double Cylinder(){
        System.out.println("Enter radius of base and height");
        double radius = sc.nextDouble(); double height = sc.nextDouble();
        volume = (22.0/7) * radius*radius;
        Return(volume);
    }
    

    private double Cone(){
        System.out.println("Enter radius of base and height");
        double radius = sc.nextDouble(); double base = sc.nextDouble();
        volume = (1/3.0) * (22.0/7)*radius*radius*height;
        Return(volume);
    }

    private double Sphere(){
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        volume = (4/3.0) * (22/7.0) * radius*radius*radius;
        Return(volume);
    }
}