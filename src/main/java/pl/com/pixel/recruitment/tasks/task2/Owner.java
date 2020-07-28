package pl.com.pixel.recruitment.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private final String name;
    private final String surname;
 
    private List<Dog> pets = new ArrayList<>();
    
    public Owner(String name, String surname, Dog... children) {
        super();
        this.name = name;
        this.surname = surname; 
        for (Dog child : children) {
            this.pets.add(child);
        }
    }

    public List<Dog> getChildren() {
        return pets;
    }

    public void setChildren(List<Dog> childeren) {
        this.pets = childeren;
    }
}