package pl.com.pixel.recruitment.tasks.task1.model;

public class Model {

    private static Model instance;
 
    public final Employee employee = new Employee();
    
    private Model() {
        
    }
    
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }
}