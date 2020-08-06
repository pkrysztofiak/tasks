package pl.com.pixel.recruitment.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private final String name;
    private final String surname;
 
    private List<Dog> dogs = new ArrayList<>();
    
    public Owner(String name, String surname, Dog... dogs) {
        super();
        this.name = name;
        this.surname = surname; 
        for (Dog dog : dogs) {
            this.dogs.add(dog);
        }
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
}