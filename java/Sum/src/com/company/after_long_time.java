/*Custom class*/

package com.company;
import java.util.Scanner;

class Employ{

    private String name;
    private float salary;
    private int number;

    public void setNumber(int num){
        number = num;
    }

    public int getNumber(){
        return number;
    }

    public void setSalary(float sal){
        salary = sal;
    }

    public float getSalary(){
        return  salary;
    }

    public void setName(String nome){
        name = nome;
    }

    public String getName(){
        return name;
    }
};

public class after_long_time {
    public static void main(String[] args) {
        Employ worker = new Employ();

        worker.setName("Ehtisham");


    }
}
