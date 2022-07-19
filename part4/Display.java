package part4;

public class Display {


    public static void showAnimal(Container<? extends Animal> container){
        System.out.println(container.getSmth().getGenre());
        System.out.println(" ");
    }

    public static void showMammal(Container<? extends Mammal> container){
        System.out.println(container.getSmth().getGenre());
        System.out.println(container.getSmth().getColor());
        System.out.println(" ");
    }

    public static void showDog(Container<? extends Dog> container){
        System.out.println(container.getSmth().getGenre());
        System.out.println(container.getSmth().getColor());
        System.out.println(container.getSmth().getName());
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Animal animal = new Animal("genre");
        Mammal mammal = new Mammal("genre", "color");
        Dog dog = new Dog("genre", "color", "name");

        Container<Animal> containerA = new Container<>(animal);
        Container<Mammal> containerM = new Container<>(mammal);
        Container<Dog> containerD = new Container<>(dog);

        showAnimal(containerA);
        showAnimal(containerM);
        showAnimal(containerD);

       // showMammal(containerA); // not working
        showMammal(containerM);
        showMammal(containerD);

        // showDog(containerA); // not working
        //showDog(containerM); // not working
        showDog(containerD);


    }
}
