package com.company;

//making a class name Employee
// NOTE: in a file we cannot define two public classes so that's why i made only a class not a public one
class Employee{
    int id;
    String name;

    //We can also make a methods inside a second class
    public void printAttributes(){
        System.out.printf("The worker name is: %s\nThe worker id is: %d",name, id);
    }
}

public class CWH_38_custom_classes {
    public static void main(String[] args) {
        System.out.println("Now we are going to make an object");

        // making the object worker of Employee type
        Employee worker = new Employee();
        Employee Eti = new Employee();

        //assigning to the object the correct things.
        worker.id = 12;
        worker.name = "Eti";

        Eti.id = 32;
        Eti.name = "Sarwar";

        // printing out thing's of the worker. (method 1)
        // System.out.printf("The worker name is: %s\nThe worker id is: %d", worker.name, worker.id);

        //printing out thing's of the worker. (method 2)
        //Eti.printAttributes();

        //NOTE: We can print the different object detail by writing the name and colling the function that you
        //choose to use to print in my case Eti.printAttributes();

    }
}
