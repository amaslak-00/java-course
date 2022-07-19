package part5;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shelf shelf1 = new Shelf(true, "red", 1);
        Shelf shelf2 = new Shelf(false, "orange", 2);
        Shelf shelf3 = new Shelf(true, "yellow", 3);


        List<Book> books_1 = Arrays.asList(
                new Book("The Da Vinci Code", "Brown, Dan", "Crime, Thriller & Adventure", "Transworld", shelf1),
                new Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "Children's Fiction", "Bloomsbury", shelf1),
                new Book("Harry Potter and the Philosopher's Stone", "Rowling, J.K.", "Children's Fiction", "Bloomsbury", shelf2),
                new Book("Fifty Shades of Grey", "James, E. L.", "Romance & Sagas", "Random House", shelf3),
                new Book("Angels and Demons", "Brown, Dan", "Crime, Thriller & Adventure", "Transworld", shelf1),
                new Book("Fifty Shades Darker", "James, E. L.", "Romance & Sagas", "Random House", shelf3),
                new Book("Twilight", "Meyer, Stephenie", "Young Adult Fiction", "Little, Brown Book", shelf2),
                new Book("New Moon", "Meyer, Stephenie", "Young Adult Fiction", "Little, Brown Book", shelf1),
                new Book("Deception Point", "Brown, Dan", "Crime, Thriller & Adventure", "Transworld", shelf2)

        );


        books_1.stream()
                .filter(b -> b.getAuthor().equals("Rowling, J.K."))
                .filter(b -> b.getPublisher().equals("Bloomsbury"))
                .forEach(System.out::println);


        books_1.stream()
                .map(b -> String.valueOf(b.getShelf().getNumberOfShelf()))
                .forEach(System.out::println);






    }
}
