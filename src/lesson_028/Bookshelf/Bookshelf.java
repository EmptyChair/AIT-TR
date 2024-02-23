package lesson_028.Bookshelf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Bookshelf {
    private List<Book> books = new ArrayList<>();

    //static class book

    class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", published in " + year;
        }
    }

    class Iterator {

        int index;

        Iterator () {
            this.index = 0;
        }

        public void checkBookshelf() {
            System.out.println(books.get(index).toString());
            if (this.index+1<books.size()) {
                this.index++;
                System.out.println("Iterator moves forward");
            } else {
                this.index = 0;
                System.out.println("Iterator circles back to the beginning");
            }

        }
    }


    void addBook(String title, String author, int year) {
        books.add(new Book(title, author, year));
    }

    void removeBook(int number) {
        books.remove(number);
    }

    void showBookshelf() {
        System.out.println("__________________________________________");
        System.out.println("These are "+this.books.size()+" books on the bookshelf:");
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("__________________________________________");
    }


}
