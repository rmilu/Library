import java.util.ArrayList;

public class LibrarySystem {

    private ArrayList<Librarian> librarianName;
    private ArrayList<books> bookName;
    private ArrayList<Customer> customerName;
    private int numberOfBooks;
    private int numberOfEmployees;
    private int numberOfBorrowedBooks;

    public LibrarySystem(ArrayList<Librarian> librarianName, ArrayList<books> bookName, ArrayList<Customer> customerName, int numberOfBooks, int numberOfEmployees, int numberOfBorrowedBooks) {
        this.librarianName = librarianName;
        this.bookName = bookName;
        this.customerName = customerName;e
        this.numberOfBooks = numberOfBooks;
        this.numberOfEmployees = numberOfEmployees;
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }
    public LibrarySystem(Librarian librarianName){
        this.librarianName.add(librarianName);
    }

    public ArrayList<Librarian> getLibrarianName() {
        return librarianName;
    }

    public ArrayList<books> getBookName() {
        return bookName;
    }

    public ArrayList<Customer> getCustomerName() {
        return customerName;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }

    public void setLibrarianName(ArrayList<Librarian> librarianName) {
        this.librarianName = librarianName;
    }

    public void setBookName(ArrayList<books> bookName) {
        this.bookName = bookName;
    }

    public void setCustomerName(ArrayList<Customer> customerName) {
        this.customerName = customerName;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }
}
