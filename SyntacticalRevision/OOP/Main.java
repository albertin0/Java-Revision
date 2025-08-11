package OOP;

import java.util.ArrayList; // Import a single class
import java.util.*; // Import all classes in the util package


public class Main {
    public static void main(String[] args)  {
        // Creating and using an object
        Dog myDog = new Dog(); // Create a new Dog object
        myDog.setBreed("Labrador"); // Access and set a field
        myDog.bark(); // Call a method
        System.out.println(myDog.toString());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(myDog);
        dogs.get(0).bark();
    }
}
