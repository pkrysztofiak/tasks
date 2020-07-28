package pl.com.pixel.recruitment.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2App {

    public static void main(String[] args) {
        List<Dog> children = new ArrayList<>();
        children.add(new Dog("Jax", 13));
        children.add(new Dog("Milo", 6));
        children.add(new Dog("Winston", 4));
        children.add(new Dog("Marley", 17));
        
        //filter dogs above age of 6
        
        List<Owner> owners = new ArrayList<>();
        owners.add(new Owner("Winston", "Doe", new Dog("Finn", 13), new Dog("Buster", 6), new Dog("Kona", 14)));
        owners.add(new Owner("Margharet", "Taddley", new Dog("Dakota", 1), new Dog("Lulu", 12)));
        owners.add(new Owner("Henry", "Thoreau", new Dog("Ace", 2), new Dog("Boomer", 2), new Dog("Oreo", 3), new Dog("Ziggy", 1)));
        
        //filter dogs above age of 6
    }
}