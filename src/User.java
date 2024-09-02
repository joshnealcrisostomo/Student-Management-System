/**
 * User class that holds the basic and general info of a user. This class is also the superclass for both Student and Teacher Class.
 */
public abstract class User {
    private String firstName, lastName, key, gender, password, month;
    private int day, year;

    /**
     * The sole constructor of the User Class.
     *
     * @param firstName - a String value that holds the current user's first name.
     * @param lastName - a String value that holds the current user's last name.
     * @param key - a String value that holds the current user's id number.
     * @param gender - a String value that holds the current user's gender.
     * @param password - a String value that holds the current user's password.
     * @param month - a String value that holds the current user's birth month.
     * @param day - an integer value that holds the current user's day of birth.
     * @param year - an integer value that holds the current user's birth year.
     */
    public User(String firstName, String lastName, String key, String gender, String password, String month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.key = key;
        this.gender = gender;
        this.password = password;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getKey() {
        return key;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }
    public String getMonth() {
        return  month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
