package Task_05_Book.Logic;

import Task_01_Student.Models.Student;
import Task_05_Book.Models.Book;

public class BooksFilters {


    public Book[] byAuthor(Book[] books, String author) {

        Book[] resultBooks = new Book[0];

        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            String[] authors = currentBook.getAuthors();
            for (int j = 0; j < authors.length; j++) {
                String currentAuthor = authors[j];
                if (currentAuthor.equals(author)) {

                    Book[] tmpArr = new Book[resultBooks.length + 1];
                    for (int q = 0; q < resultBooks.length; q++) {
                        tmpArr[q] = resultBooks[q];
                    }
                    tmpArr[tmpArr.length - 1] = currentBook;
                    resultBooks = tmpArr;
                    break;
                }
            }
        }
        return resultBooks;
    }


    public Book[] byPublisher( Book[] books,String publisher){

        Book[] resultBooks= new Book[0];

        for (int i=0;i<books.length;i++){
            Book currentBook=books[i];

            if (currentBook.getPublisher().equals(publisher)){

                Book[] tmpArr= new Book[resultBooks.length+1];
                for (int j=0;j<resultBooks.length;j++){
                    tmpArr[j]=resultBooks[j];
                }
                tmpArr[tmpArr.length-1]=currentBook;
                resultBooks=tmpArr;
            }
        }
        return resultBooks;
    }

    public Book[] afterYear( Book[] books,int year){

        Book[] resultBooks= new Book[0];

        for (int i=0;i<books.length;i++){
            Book currentBook=books[i];

            if (currentBook.getPublishingYear().getYear()>year){

                Book[] tmpArr= new Book[resultBooks.length+1];
                for (int j=0;j<resultBooks.length;j++){
                    tmpArr[j]=resultBooks[j];
                }
                tmpArr[tmpArr.length-1]=currentBook;
                resultBooks=tmpArr;
            }
        }
        return resultBooks;
    }
}
