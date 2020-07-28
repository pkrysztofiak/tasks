package pl.com.pixel.recruitment.tasks.task2;

public class Dog {

    private final String name;
    private Integer age;
    
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "[age=" + age + "]";
    }
}