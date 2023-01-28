import java.util.ArrayList;

public class Customer {

    private int age;
    private ArrayList<books> bookName;
    private String email;
    private String phone;
    private String adress;
    private boolean penalties;

    public Customer(int age, ArrayList<books> bookName, String email, String phone, String adress, boolean penalties) {
        this.age = age;
        this.bookName = bookName;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.penalties = penalties;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<books> getBookName() {
        return bookName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public boolean isPenalties() {
        return penalties;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookName(ArrayList<books> bookName) {
        this.bookName = bookName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPenalties(boolean penalties) {
        this.penalties = penalties;
    }
}
