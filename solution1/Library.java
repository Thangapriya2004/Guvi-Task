package solution1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Solution1.Book added: " + book.getTitle());
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                books.remove(i);
                System.out.println("Solution1.Book with ID " + bookID + " removed.");
                return;
            }
        }
        System.out.println("Solution1.Book with ID " + bookID + " not found.");
    }

    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("--- All Books in the Solution1.Library ---");
            for (Book book : books) {
                System.out.println(book);
            }
            System.out.println("--------------------------------");
        }
    }
}
