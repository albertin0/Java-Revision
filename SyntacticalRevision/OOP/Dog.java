package OOP;

// Class Definition (BluePrint)
public class Dog {
    private String breed; // Field

    public void setBreed(String breed)  {
        this.breed = breed;
    }
    public String getBreed()    {
        return breed;
    }

    void bark() { // Method
        System.out.println("Woof!");
    }
}
