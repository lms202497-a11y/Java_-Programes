import java.util.Scanner;

public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static String bookName;
    static String memberName;
    static int availableBooks;
    static int issuedBooks;
    static int overdueDays;

    static void addBook() {
        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Number of Available Books: ");
        availableBooks = sc.nextInt();
        sc.nextLine();

        System.out.println("Book added successfully!");
    }

    static void issueBook() {
        System.out.print("\nEnter Member Name: ");
        memberName = sc.nextLine();

        if (availableBooks > 0) {
            availableBooks--;
            issuedBooks++;

            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book is not available.");
        }
    }

    static void calculateFine() {
        System.out.print("\nEnter overdue days: ");
        overdueDays = sc.nextInt();

        double fine = overdueDays * 5;

        System.out.println("Overdue Fine: Rs." + fine);
    }

    static void showBookDetails() {
        System.out.println("\n===== LIBRARY DETAILS =====");
        System.out.println("Book Name: " + bookName);
        System.out.println("Available Books: " + availableBooks);
        System.out.println("Issued Books: " + issuedBooks);
        System.out.println("Member Name: " + memberName);
    }

    public static void main(String[] args) {

        addBook();
        issueBook();
        calculateFine();
        showBookDetails();

        sc.close();
    }
}