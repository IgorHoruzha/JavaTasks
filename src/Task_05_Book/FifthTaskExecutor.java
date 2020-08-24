package Task_05_Book;

import Library.ArrayTools;
import Task_05_Book.Logic.BooksFilters;
import Task_05_Book.Models.Book;

import java.time.LocalDate;

public class FifthTaskExecutor {
    public static void start() {

        System.out.println("Task 5:");


        Book[] books = new Book[]{
                new Book(1, "Name1",
                        new String[]{"Author1"},
                        "Publisher1", LocalDate.of(1990, 1, 1), (short) 134, 101, "Binding1"),
                new Book(2, "Name2",
                        new String[]{"Author1", "Author2", "Author3"},
                        "Publisher2", LocalDate.of(1992, 1, 1), (short) 134, 102, "Binding2"),
                new Book(3, "Name3",
                        new String[]{"Author1", "Author3"},
                        "Publisher3", LocalDate.of(1994, 1, 1), (short) 134, 103, "Binding3"),
                new Book(4, "Name4",
                        new String[]{ "Author2", "Author3"},
                        "Publisher1", LocalDate.of(1993, 1, 1), (short) 134, 104, "Binding4"),

        };

        BooksFilters booksFilters= new BooksFilters();

        System.out.println("a:");
        Book[] byAuthor= booksFilters.byAuthor(books,"Author2");
        ArrayTools.display(byAuthor);

        System.out.println("b:");
        Book[] byPublisher= booksFilters.byPublisher(books,"Publisher1");
        ArrayTools.display(byPublisher);

        System.out.println("c:");
        Book[] publishAfterYear= booksFilters.afterYear(books,1992);
        ArrayTools.display(publishAfterYear);

        System.out.println("==================");
    }
}
