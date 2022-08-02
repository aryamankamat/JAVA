class Library {
    public String[] Books;
    int no_of_books;

    Library() {
        this.Books = new String[20];
        this.no_of_books = 0;
    }

    public void addBook(String book) {
        this.Books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "has been added.");
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.Books.length; i++) {
            if (this.Books[i].equals(book)) {
                System.out.println("The book has been issued");
                this.Books[i] = null;

                return;
            }
        }
        System.out.println("This Book is not there in Library!!!");
    }

    public void returnBook(String book) {
        addBook(book);
    }

    public void showAvailableBooks() {
        System.out.println("The Avaiable Books are : ");
        for (String book : this.Books) {
            if (book == null) {
                continue;
            }
            System.out.println("-->" + book);
        }
    }

}

public class Book_store {
    public static void main(String[] args) {

        /*
         * You have to implement a library using Java Class "Library"
         * Methods: addBook, issueBook, returnBook, showAvailableBooks
         * Properties: Array to store the available books,
         * Array to store the issued books
         * 
         */

        Library CLibrary = new Library();
        System.out.println("\n");
        CLibrary.addBook("Think and grow Rich");
        CLibrary.addBook("The Subtle art of not giving a fuck");
        CLibrary.addBook("How to win friends and influence people.");

        System.out.println("\n");

        CLibrary.showAvailableBooks();

        System.out.println("");

        CLibrary.issueBook("The Subtle art of not giving a fuck");

        System.out.println("\n");

        CLibrary.showAvailableBooks();

        System.out.println("");

        CLibrary.returnBook("The Subtle art of not giving a fuck");

        System.out.println("\n");

        CLibrary.showAvailableBooks();

    }
}
