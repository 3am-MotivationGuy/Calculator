package Calculator;

Class Volume{

    private double Cuboid(double length, double breadth, double height){
        double volume = length * breadth * height;
        Return(volume)
    }

    private double Cube(double length){
        double volume = Math.pow(length, 3);
        Return(volume)
    }

    private double Cylinder(double radius, double height,){
        double volume = (22/7.0) * radius*radius * height;
        Return(volume)
    }

    private double Cone(double radius, double height){
        double volume = (22/7.0) * radius*radius * height *(1/3.0);
        Return(volume)
    }
}