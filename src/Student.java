/**
 * Subclass of the User Class
 */
public class Student extends User {
    private String studentYear;

    /**
     * The sole constructor of the Student Class.
     *
     * @param firstName - a String value that holds the current student's first name.
     * @param lastName - a String value that holds the current student's last name.
     * @param key - a String value that holds the current student's id number.
     * @param gender - a String value that holds the current student's gender.
     * @param password - a String value that holds the current student's password.
     * @param month - a String value that holds the current student's birth month.
     * @param day - an integer value that holds the current student's day of birth.
     * @param year - an integer value that holds the current student's birth year.
     * @param studentYear - a String value that holds the current student's current year level.
     */
    public Student(String firstName, String lastName, String key, String gender, String password, String month, int day, int year, String studentYear) {
        super(firstName, lastName, key, gender, password, month, day, year);
        this.studentYear = studentYear;
    }

    /**
     * getStudentYear method returns the current year level of a student.
     *
     * @return studentYear
     */
    public String getStudentYear() {
        return studentYear;
    }

    /**
     * setStudentYear method lets the user modify the year level of a student.
     *
     * @param studentYear - a String value that contains the year level.
     */
    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }
}
