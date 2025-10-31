package solution1;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Solution1.Library Management System Menu ---");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Solution1.Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;
                case 2:
                    System.out.print("Enter the ID of the book to remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;
                case 3:
                    System.out.print("Enter the ID of the book to search: ");
                    int searchId = scanner.nextInt();
                    Book foundBook = library.searchBook(searchId);
                    if (foundBook != null) {
                        System.out.println("Solution1.Book found: " + foundBook);
                    } else {
                        System.out.println("Solution1.Book with ID " + searchId + " not found.");
                    }
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
