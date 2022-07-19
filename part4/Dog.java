package part4;

public class Dog extends Mammal{

    private String name;

    public Dog(String genre, String color, String name) {
        super(genre, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
