public class books {

    private int year;
    private String genre;
    private String title;
    private String author;
    private boolean isInStock;

    public books(int year, String genre, String title, String author, char isInStock) {
        this.age = age;
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.isInStock = isInStock;

    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setAge(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
