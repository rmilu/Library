public class Librarian {
    private String name;
    private int age;
    private char sex;
    private double salary;
    private int shift
    private int daysOff;

    public Customer(String name, int age, char sex, double salary, int shift, int daysOff) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.shift = shift;
        this.daysOff = daysOff;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }

    public int getShift() {
        return shift;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }
}
