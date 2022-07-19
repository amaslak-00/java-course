package part5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Shelf shelf1 = new Shelf(true, "red", 1);
        Shelf shelf2 = new Shelf(false, "orange", 2);
        Shelf shelf3 = new Shelf(true, "yellow", 3);


        List<Book> books_1 = Arrays.asList(
                new Book("The Da Vinci Code", "Brown, Dan", "Crime, Thriller & Adventure", "Transworld", shelf1, 120),
                new Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "Children's Fiction", "Bloomsbury", shelf1,340),
                new Book("Harry Potter and the Philosopher's Stone", "Rowling, J.K.", "Children's Fiction", "Bloomsbury", shelf2,453),
                new Book("Fifty Shades of Grey", "James, E. L.", "Romance & Sagas", "Random House", shelf3,102),
                new Book("Angels and Demons", "Brown, Dan", "Crime, Thriller & Adventure", "Transworld", shelf1,405),
                new Book("Fifty Shades Darker", "James, E. L.", "Romance & Sagas", "Random House", shelf3,234),
                new Book("Twilight", "Meyer, Stephenie", "Young Adult Fiction", "Little, Brown Book", shelf1,876),
                new Book("New Moon", "Meyer, Stephenie", "Young Adult Fiction", "Little, Brown Book", shelf1, 123),
                new Book("Deception Point", "Brown, Dan", "Crime, Thriller & Adventure", "Transworld", shelf2, 245)

        );


        books_1.stream()
                .filter(b -> b.getAuthor().equals("Rowling, J.K."))
                .filter(b -> b.getPublisher().equals("Bloomsbury"))
                .forEach(System.out::println);


        books_1.stream()
                .map(b -> b.getShelf().getNumberOfShelf())
                .forEach(System.out::println);


        int[] shelvesAmount = new int[3];


        for(Book book : books_1){
            
            shelvesAmount[book.getShelf().getNumberOfShelf()-1] =  shelvesAmount[book.getShelf().getNumberOfShelf()-1]+1;
        }

        System.out.println("Max amount of books on shelf: ");
        System.out.println( Arrays.stream(shelvesAmount).max());


        Map<String, Double> collect = books_1.stream()
                .collect(Collectors.groupingBy(book -> book.getAuthor(),
                        Collectors.averagingInt(book -> book.getPages())));
        System.out.println(collect);

    }
}
