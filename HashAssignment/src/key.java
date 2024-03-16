
import java.util.HashMap;
import java.util.List;
import java.util.
class Key {
    private final String firstName;
    private final String lastName;

    public Key(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return firstName.equals(key.firstName) && lastName.equals(key.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    private String year;

    public Student(String firstName, String lastName, double gpa, String year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}



