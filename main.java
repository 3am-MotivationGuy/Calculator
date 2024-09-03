package Calculator;

import java.util.Scanner;

class Main{
    public static void Main(){
        Scanner sc = new Scanner(System.in)
        System.out.println("Welcome to the calculator alpha version!");
        System.out.println("What would you like to do?\n1 - Area of a shape\n2 - Volume of a shape");
        int ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("Which shape?");
                    String shape = sc.next();
                    switch(shape){
                        case "square": 
                    }
        }
    }
}