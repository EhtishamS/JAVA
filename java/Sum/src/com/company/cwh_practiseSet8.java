package com.company;
import java.util.Scanner;
import java.lang.Math;

/*class Employee1{ for problem 1
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}*/

/*class Cellphone{ for problem 2
    public void ring(){
        System.out.println("Your cellphone is ringing!");
    }

    public void vibrating(){
        System.out.println("Your cellphone is vibrating!");
    }

    public void silenced(){
        System.out.println("You cellphone is in silent mode!");
    }
}*/

/*class Square{ problem 3
    float side;

    public void setSide(float measurement){
        side = measurement;
    }

    public float getArea(){
        return side*side;
    }

    public float getPerimeter(){
        return side*4;
    }

}*/

/*class Rectangle{
    float length;
    float height;

    public void setMeasurements(float size1, float size2){
        length = size1;
        height = size2;
    }

    public float getPerimeter(){
        return (length*2) + (height*2);
    }

    public float getArea(){
        return length*height;
    }
}*/

/*class TommyVecetti{ problem 5
    public void hit(){
        System.out.println("\nI'm hitting!");
    }

    public void run(){
        System.out.println("\nI'm running!");
    }

    public void fire(){
        System.out.println("\nI'm firing");
    }

    public void walk(){
        System.out.println("\nI'm walking!");
    }
}*/

class Circle{
    float radius;

    public void setRadius(float measurement){
        radius = measurement;
    }

    public float getDiameter(){
        return radius*2;
    }

    public float getPerimeter(){
        return (float) ((Math.PI*radius)*2);
    }
}

public class cwh_practiseSet8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* problem 1 Create a class Employee1 with the following properties and methods:
        1. salary (int)
        2. getSalary (return int)
        3. name (String)
        4. getName (return String)
        5. setName (change name)

        Employee1 worker = new Employee1();
        String n;

        System.out.print("Insert how mach money do you earn monthly: ");
        worker.salary = input.nextInt();

        System.out.print("What's the name of the worker: ");
        n = input.next();
        worker.setName(n);
        System.out.printf("The name of the employee is: %s\nThe salary of this worker is: %d", worker.getName(), worker.getSalary());*/

        /*problem 2: Create a class cellphone with a methods to print "ringing", "vibrating" ...etc

        Cellphone smartphone = new Cellphone();

        smartphone.ring();
        smartphone.vibrating();
        smartphone.silenced();*/

        /*problem 3: Create a class square  with a method to initialize its side, calculating are, perimeter, etc....

        Square shape = new Square();
        float size;

        System.out.print("What is the size of one side of your square: ");
        size = input.nextFloat();
        shape.setSide(size);

        System.out.print("\nThe size of one square is: " + shape.side+ "\nThe perimeter of the square is: "+ shape.getPerimeter() +"\nThe area of the square is: " + shape.getArea());*/

        /*problem 4: Create a class Rectangle & repeat 3

        Rectangle shape = new Rectangle();
        float height, length;

        System.out.print("Insert the height of the rectangle: ");
        height = input.nextFloat();

        System.out.print("Insert the length of the rectangle: ");
        length = input.nextFloat();

        shape.setMeasurements(length,height);

        System.out.println("\nINFORMATION OF THE RECTANGLE");
        System.out.print("The height of your rectangle is: " + height +"\nThe length of your rectangle is: " + length);
        System.out.print("\nThe perimeter of your rectangle is: "+shape.getPerimeter());
        System.out.print("\nThe Area of your rectangle is: " + shape.getArea());*/

        /*problem 5: Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting), running, firing, etc...
        TommyVecetti moves = new TommyVecetti();
        int actionTodo;
        boolean differentAnswer = false;

        do{
            System.out.print("""

            Select the action that you want to do with my character:
            1.walk
            2.run
            3.fire
            4.hit
            0.exit
            >""");
            actionTodo = input.nextInt();

            switch (actionTodo) {
                case 1 -> moves.walk();
                case 2 -> moves.run();
                case 3 -> moves.fire();
                case 4 -> moves.hit();
                default -> differentAnswer = true;
            }
        }while(!differentAnswer);

        System.out.print("Closing the program");*/
    }
}
