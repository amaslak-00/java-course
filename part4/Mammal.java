package part4;

import javax.swing.text.StyledEditorKit;

public class Mammal extends Animal{

    public Mammal(String genre, String color) {
        super(genre);
        this.color = color;
    }

    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
