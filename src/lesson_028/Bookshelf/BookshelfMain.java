package lesson_028.Bookshelf;


public class BookshelfMain {
    public static void main(String[] args) {
        //create Bookshelf
        Bookshelf bookshelf1 = new Bookshelf();
        bookshelf1.addBook("Fate of a Man", "Mikhail Sholokhov", 1956);
        bookshelf1.addBook("Fate of a Man", "Mikhail Sholokhov", 1956);
        bookshelf1.addBook("Two Towers", "J.R.R. Tolkien", 1954);
        bookshelf1.addBook("The History of Crusades", "Pepe the Frog", 2016);
        bookshelf1.addBook("Accounting for the Beginners", "Lida Styles", 2022);
        bookshelf1.showBookshelf();
        System.out.println("Removing book with index 2");
        bookshelf1.removeBook(2);
        bookshelf1.showBookshelf();


        System.out.println("Create Iterator");
        Bookshelf.Iterator myIterator = bookshelf1.new Iterator();
        System.out.println("Run through all the books with Iterator");

        for (int i = 0; i<bookshelf1.getSize();i++)
            System.out.println("It is "+myIterator.checkBookshelf());

        System.out.println("_______________________________________________________");
        System.out.println("Run through 7 the books with Iterator");

        for (int i = 0; i< 7;i++)
            System.out.println(myIterator.checkBookshelf());




        //add a few books
        //remove one book
        //Let itrator show all the books on the shelf

    }
}
