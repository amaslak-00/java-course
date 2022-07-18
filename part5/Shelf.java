package part5;

import java.util.List;

public class Shelf {
    private boolean wooden;
    private String color;
    private int numberOfShelf;



    public Shelf(boolean wooden, String color, int numberOfShelf) {
        this.wooden = wooden;
        this.color = color;
        this.numberOfShelf = numberOfShelf;

    }

    public int getNumberOfShelf() {
        return numberOfShelf;
    }

    public void setNumberOfShelf(int numberOfShelf) {
        this.numberOfShelf = numberOfShelf;
    }



    public boolean isWooden() {
        return wooden;
    }

    public void setWooden(boolean wooden) {
        this.wooden = wooden;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
