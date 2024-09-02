import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Main model of the program.
 */
public class Model {
    /**
     * 7 attributes of the class.
     */
    private String keyUser = "admin"; // Fixed generalized admin username.
    private String keyPass = "[1, 2, 3, 4]"; // Fixed  generalized admin password (represented as "1234").
    private String currentUser;

    private Map<String, Teacher> teacherMap = new HashMap<>();
    private Map<String, Student> studentMap = new HashMap<>();

    private List<String> activityLog = new ArrayList<>();
    private List<Subject> subjectList = new ArrayList<>();

    /**
     * The sole constructor of the class.
     */
    public Model() {
        initializeExistingSubs();
    }

    /**
     * initializeExistingSubs method initializes given subjects in the subjectList.
     */
    private void initializeExistingSubs() {
        subjectList.add(new Subject("1010", "English I", "Monday/Thursday", "08:00-10:00","Face-to-Face"));
        subjectList.add(new Subject("1020", "English II", "Wednesday/Saturday", "08:00-10:00", "Online"));
        subjectList.add(new Subject("3098", "Algebra", "Tuesday/Friday", "10:00-12:00","Face-to-Face"));
        subjectList.add(new Subject("5240", "Introduction to Computer Science", "Monday/Thursday", " 13:00-15:00","Online"));
        subjectList.add(new Subject("0021", "World History", "Tuesday/Friday", " 09:00-11:00","Face-to-Face"));
    }

    /**
     * getSubjectList returns the available classes/subjects.
     *
     * @return a String containing all the detailed information from all available classes/subjects.
     */
    public String getSubjectList() {
        StringBuilder subjectInfo = new StringBuilder("=== Subject List ===\n\n");

        // Iterates through the list of Subjects
        for (Subject subject : subjectList) {
            subjectInfo.append("Subject Code: ").append(subject.getCode()).append("\n")
                    .append("Subject Name: ").append(subject.getName()).append("\n")
                    .append("Weekly Schedule: ").append(subject.getSched()).append("\n")
                    .append("Time: ").append(subject.getTime()).append("\n")
                    .append("Mode of Class: ").append(subject.getMode()).append("\n")
                    .append("\n-------------------------------------------------\n\n");
        }

        // Adds a log activity
        addLogActivity("Viewed the Subject List.");

        return subjectInfo.toString();
    }

    /**
     * addClass method allows the user to add a class/subject to the existing subject list.
     *
     * @param classCode - a String value that holds the unique randomized code of a subject.
     * @param className - a String value that holds the user input for the subject's class name.
     * @param classSched - a String value that holds the weekly schedule of a subject.
     * @param classTime - a String value that holds the time of a subject.
     * @param classMode - a String value that holds the modality of a subject for a week.
     */
    public void addClass(String classCode, String className, String classSched, String classTime, String classMode) {
        Subject newSubject = new Subject(classCode, className, classSched, classTime, classMode);
        subjectList.add(newSubject);

        // Adds a log activity
        addLogActivity("Added new class: " + className + " with code: " + classCode);
    }

    /**
     * generationUniqueClassCode method generates a 4-digit unique combination that will be assigned as a subject's code.
     *
     * @return a unique String value from 0000 to 9999.
     */
    public String generateUniqueClassCode() {
        Random random = new Random();
        String classCode;

        // Continuously generates a 4-digit code until the generated code is unique.
        do {
            classCode = String.format("%04d", random.nextInt(10000));
        } while (isClassCodeExists(classCode));

        return classCode;
    }

    /**
     * isClassCodeExists method checks if the generated randomized code of a subject exists or not
     *
     * @param classCode - a String value from the method generateUniqueClassCode.
     * @return true or false
     */
    private boolean isClassCodeExists(String classCode) {
        // Iterates through the subject list
        for (Subject subject : subjectList) {
            // Checks every subject code and compares it to the generated code
            if (subject.getCode().equals(classCode)) {
                return true;
            }
        }
        return false;
    }

    /**
     * monthList method returns a list of months.
     *
     * @return a String array containing all the months.
     */
    public String[] monthList() {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        return months;
    }

    /**
     * schedList method returns a list of given schedules for a class.
     *
     * @return a String array containing all the weekly schedules.
     */
    public String[] schedList() {
        String[] sched = {
                "Monday/Thursday", "Tuesday/Friday", "Wednesday/Saturday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"
        };

        return sched;
    }

    /**
     * modalities method returns a list of modalities for a class.
     *
     * @return a String array containing all the modalities.
     */
    public String[] modalities() {
        String[] modes = {
                "Face-To-Face", "Online", "Hybrid (F2F + Online)"
        };

        return modes;
    }

    /**
     * timeList method returns a list of given timeslots per day for a class.
     *
     * @return a String array containing all the timeslots.
     */
    public String[] timeList() {
        String[] time = {
                "07:30 - 09:00",
                "09:00 - 10:30",
                "10:30 - 12:00",
                "12:00 - 13:30",
                "13:30 - 15:00",
                "15:00 - 16:30",
                "16:30 - 18:00"
        };

        return time;
    }

    /**
     * profTypes method returns a list of professor types.
     *
     * @return a String array containing all the types.
     */
    public String[] profTypes() {
        String[] types = {"Full-time Professor", "Part-time Lecturer"};

        return types;
    }

    /**
     * yearStudent method returns a list of a student's year level.
     *
     * @return a String array containing all the year levels.
     */
    public String[] yearStudent() {
        String[] years = {"Freshman", "Sophomore", "Junior", "Senior"};

        return years;
    }

    /**
     * authorizeAdmin method checks if the login credentials match the keyUser and keyPass.
     *
     * @param adminUser - a String value that holds the user input for the admin username from the login page.
     * @param adminPass - a String value that holds the user input for the admin password from the login page.
     * @return true or false
     */
    public boolean authorizeAdmin(String adminUser, String adminPass) {
        String username = adminUser.trim();
        String password = adminPass.trim();

        // Checks if both the inputs match the keyUser and keyPass
        if(username.equals(keyUser) && password.equals(keyPass)) {
            addLogActivity("Admin logged in successfully!");
            return true;
        }

        // Adds a log activity
        addLogActivity("Admin failed to log in.");
        return false;
    }

    /**
     * authorizeStudentLogin method checks if the login credentials match a student's ID number and its password.
     *
     * @param userId - a String value that holds the user input for the student username from the login page.
     * @param password - a String value that holds the user input for the student password from the login page.
     * @return true or false
     */
    public boolean authorizeStudentLogin(String userId, String password) {
        // Iterate through the student map
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            String userPass = new String(student.getPassword()).trim();
            String trimmedUserId = userId.trim();
            String trimmedPassword = password.trim();

            // Checks if both the inputs match a student's ID number and its corresponding password
            if (entry.getKey().trim().equals(trimmedUserId) && userPass.equals(trimmedPassword)) {
                addLogActivity("Student " + userId + " logged in successfully!");
                return true;
            }
        }

        // Adds a log activity
        addLogActivity("Student " + userId + " failed to log in.!");
        return false;
    }

    /**
     * authorizeTeacherLogin method checks if the login credentials match a teacher's username and its password.
     *
     * @param userId - a String value that holds the user input for the teacher username from the login page.
     * @param password - a String value that holds the user input for the teacher password from the login page.
     * @return true or false
     */
    public boolean authorizeTeacherLogin(String userId, String password) {
        // Iterate through the student map
        for (Map.Entry<String, Teacher> entry : teacherMap.entrySet()) {
            Teacher teacher = entry.getValue();
            String userPass = new String(teacher.getPassword()).trim();
            String trimmedUserId = userId.trim();
            String trimmedPassword = password.trim();

            // Checks if both the inputs match a teacher's username and its corresponding password
            if (entry.getKey().trim().equals(trimmedUserId) && userPass.equals(trimmedPassword)) {
                addLogActivity(teacher.getProfType() + " " + userId + " logged in successfully!");
                return true;
            }
        }

        // Adds a log activity
        addLogActivity("Teacher " + userId + " failed to log in.!");
        return false;
    }

    /**
     * isPasswordValid method checks if the created password complies with the password requirements.
     *
     * @param password - a String value that holds the user input for the password creation during the account creation.
     * @return true or false
     */
    public boolean isPasswordValid(String password) {
        boolean hasDigit = false, hasUppercase = false, hasSpecialSymbol = false;
        String specialSymbols = "!*:%#";

        // Checks if the password is at least 8 characters in length
        if (password.length() < 8) {
            return false;
        }

        // Iterates through the input's characters
        for (char ch : password.toCharArray()) {
            // Checks if the current character is a digit
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) { // Checks if the current character is an uppercase letter
                hasUppercase = true;
            } else if (specialSymbols.indexOf(ch) != -1) { // Checks if the current character has one of the special symbols
                hasSpecialSymbol = true;
            }
        }

        return hasDigit && hasUppercase && hasSpecialSymbol;
    }

    /**
     * isTextFldEmpty method checks if a text field is empty.
     *
     * @param field1 - a String value, that can be null, obtained from a text field.
     * @return true or false
     */
    public boolean isTextFldEmpty(String field1) {
        return field1.isEmpty();
    }

    /**
     * Overloaded isTextFldEmpty method checks if two existing text fields are empty.
     *
     * @param field1 - a String value, that can be null, obtained from a text field.
     * @param field2 - a String value, that can be null, obtained from a text field.
     * @return true or false
     */
    public boolean isTextFldEmpty(String field1, String field2) {
        return field1.isEmpty() || field2.isEmpty();
    }

    /**
     * Overloaded isTextFldEmpty method checks if two existing text fields are empty.
     *
     * @param field1 - a String value, that can be null, obtained from a text field.
     * @param field2 - a String value, that can be null, obtained from a text field.
     * @param field3 - a String value, that can be null, obtained from a text field.
     * @return true or false
     */
    public boolean isTextFldEmpty(String field1, String field2, String field3) {
        return field1.isEmpty() || field2.isEmpty() || field3.isEmpty();
    }

    /**
     * Overloaded isTextFldEmpty method checks if two existing text fields are empty.
     *
     * @param field1 - an integer value, that can be null, obtained from a text field.
     * @param field2 - an integer value, that can be null, obtained from a text field.
     * @param field3 - a String value, that can be null, obtained from a text field.
     * @return true or false
     */
    public boolean isTextFldEmpty(int field1, int field2, String field3) {
        return (field1 == 0 && field2 == 0 && field3.isEmpty());
    }

    /**
     * doesPassMatch method is used to confirm a password during the account creation.
     *
     * @param password - a String value obtained from the first password input.
     * @param confirmPass - a String value obtained from the second password input and used for confirmation.
     * @return true or false
     */
    public boolean doesPassMatch(String password, String confirmPass) {
        return password.equals(confirmPass);
    }

    /**
     * isDateValid method checks if the input is a valid date.
     *
     * @param month - a String value obtained from a dropdown box that contains the user choice for month.
     * @param day - an integer value input from the user.
     * @param year - an integer value input from the user.
     * @return true or false
     */
    public boolean isDateValid(String month, int day, int year) {
        String tempMonth = month.toUpperCase();

        // Checks if the input year is valid
        if(isYearValid(year)) {
            switch(tempMonth) {
                case "JANUARY":
                case "MARCH":
                case "MAY":
                case "JULY":
                case "AUGUST":
                case "OCTOBER":
                case "DECEMBER":
                    return day >= 1 && day <= 31;

                case "APRIL":
                case "JUNE":
                case "SEPTEMBER":
                case "NOVEMBER":
                    return day >= 1 && day <= 30;

                case "FEBRUARY":
                    if (isLeapYear(year)) {
                        return day >= 1 && day <= 29;
                    } else {
                        return day >= 1 && day <= 28;
                    }

                default:
                    return false;
            }
        }

        return false;
    }

    /**
     * isLeapYear method checks if the input year is a leap year or not.
     *
     * @param year - an integer value from the user input.
     * @return true or false
     */
    public boolean isLeapYear(int year) {
        // Checks if the year is divisible by four since leap years happen every four years
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * isTeacherUsernameExists method checks if the username input for a teacher during the account creation is unique or not.
     *
     * @param username - a String value from the user input.
     * @return true or false
     */
    public boolean isTeacherUsernameExists(String username) {
        return teacherMap.containsKey(username);
    }

    /**
     * isStudentIdNumExists method checks if the ID Number input for a student during the account creation is unique or not.
     *
     * @param idNum - a String value from the user input.
     * @return true or false
     */
    public boolean isStudentIdNumExists(String idNum) {
        return studentMap.containsKey(idNum);
    }

    /**
     * addTeacher method adds a new instance of a teacher to the teacher hashmap.
     *
     * @param username - a String value that holds the user input for the teacher's username.
     * @param firstName - a String value that holds the user input for the teacher's first name.
     * @param lastName - a String value that holds the user input for the teacher's last name.
     * @param gender - a String value that holds the user input for the teacher's gender.
     * @param password - a String value that holds the user input for the teacher's password.
     * @param month - a String value that holds the user input for the teacher's birth month.
     * @param day - an integer value that holds the user input for the teacher's day of birth.
     * @param year - an integer value that holds the user input for the teacher's birth year.
     * @param profType - a String value that holds the user input for the teacher's professor type.
     */
    public void addTeacher(String username, String firstName, String lastName, String gender, String password, String month, int day, int year, String profType) {
        Teacher newTeacher = new Teacher(firstName, lastName, username, gender, password, month, day, year, profType);

        // Adds a teacher in a hashmap that assigns the username as the key and the remaining inputs as the values
        teacherMap.put(username, newTeacher);

        // Adds a log activity
        addLogActivity("(" + profType + ") " + firstName + " " + lastName + " was successfully added!");
    }

    /**
     * addStudent method adds a new instance of a student to the student hashmap.
     *
     * @param idNum - a String value that holds the user input for the student's ID number.
     * @param firstName - a String value that holds the user input for the student's first name.
     * @param lastName - a String value that holds the user input for the student's last name.
     * @param gender - a String value that holds the user input for the student's gender.
     * @param password - a String value that holds the user input for the student's password.
     * @param month - a String value that holds the user input for the student's birth month.
     * @param day - an integer value that holds the user input for the student's day of birth.
     * @param year - an integer value that holds the user input for the student's birth year.
     * @param studentYear - a String value that holds the user input for the student's current year level.
     */
    public void addStudent(String idNum, String firstName, String lastName, String gender, String password, String month, int day, int year, String studentYear) {
        Student newStudent = new Student(firstName, lastName, idNum, gender, password, month, day, year, studentYear);

        // Adds a student in a hashmap that assigns the ID number as the key and the remaining inputs as the values
        studentMap.put(idNum, newStudent);

        // Adds a log activity
        addLogActivity("(" + studentYear + " student) " + firstName + " " + lastName + " was successfully added!");
    }

    /**
     * findPerson method search for the person the user wants to search.
     *
     * @param searchInput - a String value that contains the teacher's username, student's id number, or a person's name.
     * @return a String containing the person's basic information.
     */
    public String findPerson(String searchInput) {
        StringBuilder result = new StringBuilder();

        // Normalize search input for case-insensitive comparison
        String normalizedSearchInput = searchInput.trim().toLowerCase();

        // Check in teacherMap
        for (Map.Entry<String, Teacher> entry : teacherMap.entrySet()) {
            Teacher teacher = entry.getValue();
            String fullName = (teacher.getFirstName() + " " + teacher.getLastName()).toLowerCase();

            if (entry.getKey().equals(normalizedSearchInput) || fullName.equals(normalizedSearchInput)) {
                result.append("=== Teacher Information ===\n")
                        .append("Username: ").append(teacher.getKey()).append("\n")
                        .append("Name: ").append(teacher.getFirstName()).append(" ").append(teacher.getLastName()).append("\n")
                        .append("Gender: ").append(teacher.getGender()).append("\n")
                        .append("Birthdate: ").append(teacher.getMonth()).append(" ").append(teacher.getDay()).append(", ").append(teacher.getYear()).append("\n")
                        .append("Age: ").append(calculateAge(teacher.getYear(), teacher.getMonth(), teacher.getDay())).append("\n")
                        .append("Profession Type: ").append(teacher.getProfType()).append("\n")
                        .append("------------------------------\n");

                addLogActivity("Searched for a " + teacher.getProfType() + ": " + teacher.getFirstName() + " " + teacher.getLastName());
                return result.toString(); // Return immediately if found
            }
        }

        // Check in studentMap
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();
            String fullName = (student.getFirstName() + " " + student.getLastName()).toLowerCase();

            if (entry.getKey().equals(normalizedSearchInput) || fullName.equals(normalizedSearchInput)) {
                result.append("=== Student Information ===\n")
                        .append("ID Number: ").append(student.getKey()).append("\n")
                        .append("Name: ").append(student.getFirstName()).append(" ").append(student.getLastName()).append("\n")
                        .append("Gender: ").append(student.getGender()).append("\n")
                        .append("Birthdate: ").append(student.getMonth()).append(" ").append(student.getDay()).append(", ").append(student.getYear()).append("\n")
                        .append("Age: ").append(calculateAge(student.getYear(), student.getMonth(), student.getDay())).append("\n")
                        .append("Year Level: ").append(student.getStudentYear()).append("\n")
                        .append("------------------------------\n");

                addLogActivity("Searched for a " + student.getStudentYear() + " student: " + student.getFirstName() + " " + student.getLastName());
                return result.toString(); // Return immediately if found
            }
        }

        // If not found in both maps
        addLogActivity("Search Failed: " + searchInput);
        return "Person was not found.";
    }

    /**
     * calculateAge method automatically calculates a person's age based on the current real-world year.
     *
     * @param birthYear - an integer value containing the person's birth year.
     * @param birthMonth - a String value containing the person's birth month.
     * @param birthDay - an integer value containing the person's day of birth.
     * @return an integer value containing the person's calculated age.
     */
    private int calculateAge(int birthYear, String birthMonth, int birthDay) {
        LocalDate today = LocalDate.now();
        int monthValue;

        // Use a switch statement to get the month value
        switch (birthMonth.toLowerCase()) {
            case "january":
                monthValue = 1;
                break;
            case "february":
                monthValue = 2;
                break;
            case "march":
                monthValue = 3;
                break;
            case "april":
                monthValue = 4;
                break;
            case "may":
                monthValue = 5;
                break;
            case "june":
                monthValue = 6;
                break;
            case "july":
                monthValue = 7;
                break;
            case "august":
                monthValue = 8;
                break;
            case "september":
                monthValue = 9;
                break;
            case "october":
                monthValue = 10;
                break;
            case "november":
                monthValue = 11;
                break;
            case "december":
                monthValue = 12;
                break;
            default:
                // Handle invalid month names
                System.err.println("Invalid month name: " + birthMonth);
                return -1; // Or handle it as appropriate
        }

        // Validate the day
        if (birthDay < 1 || birthDay > LocalDate.of(birthYear, monthValue, 1).lengthOfMonth()) {
            System.err.println("Invalid day: " + birthDay);
            return -1; // Or handle it as appropriate
        }

        // Create the birthdate using the month value
        LocalDate birthDate = LocalDate.of(birthYear, monthValue, birthDay);

        // Calculate the age
        Period period = Period.between(birthDate, today);
        return period.getYears();
    }

    /**
     * isYearValid method checks if the year is valid or realistic.
     *
     * @param year - an integer value containing the year.
     * @return true or false
     */
    public boolean isYearValid(int year) {
        int currentYear = LocalDate.now().getYear();
        return year >= 1900 && year <= currentYear;
    }

    /**
     * getTeacherList method returns the list of all teachers.
     *
     * @return a String value containing all the names of the teachers.
     */
    public String getTeacherList() {
        StringBuilder teacherList = new StringBuilder();
        int i = 0;

        // Checks if the teacher hashmap is empty or not
        if(!(teacherMap.isEmpty())) {
            teacherList.append("=== Teacher List ===\n\n");

            // Iterates through the entire hashmap
            for (Map.Entry<String, Teacher> entry : teacherMap.entrySet()) {
                Teacher teacher = entry.getValue();
                i++;

               teacherList.append(i).append(".) ").append(teacher.getFirstName()).append(" ").append(teacher.getLastName()).append("\n");
            }

            teacherList.append("-------------------------------------------------\n");
            // Adds a log activity
            addLogActivity("Viewed the Teacher List.");
            return teacherList.toString();
        }

        // Adds a log activity
        addLogActivity("Viewed the Teacher List (Empty).");
        return "No Teachers Available.";
    }

    /**
     * getStudentList method returns the list of all students.
     *
     * @return a String value containing all the names of the students.
     */
    public String getStudentList() {
        StringBuilder studentList = new StringBuilder();
        int i = 0;

        // Checks if the student hashmap is empty or not
        if(!(studentMap.isEmpty())) {
            studentList.append("=== Student List ===\n\n");

            // Iterates through the entire hashmap
            for(Map.Entry<String, Student> entry : studentMap.entrySet()) {
                Student student = entry.getValue();
                i++;

                studentList.append(i).append(".) ").append(student.getFirstName()).append(" ").append(student.getLastName()).append("\n");
            }

            studentList.append("-------------------------------------------------\n");
            // Adds a log activity
            addLogActivity("Viewed the Student List.");
            return  studentList.toString();
        }

        // Adds a log activity
        addLogActivity("Viewed the Student List (Empty).");
        return "No Students Available.";
    }

    /**
     * addLogActivity method adds a String value to the log activity list with the current date and time.
     *
     * @param activity - a String value containing the log activity.
     */
    public void addLogActivity(String activity) {
        // Use a formatter to format the date and time as desired
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd || HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        // Add the formatted timestamp and activity to the log
        activityLog.add(timestamp + " -- " + activity);
    }

    /**
     * viewLogActivity method displays all the logged activities.
     *
     * @return a String value containing all the logged activities and the date and time.
     */
    public String viewLogActivity() {
        StringBuilder logActivities = new StringBuilder();

        // Iterates through the list of log activities
        for (String logEntry : activityLog) {
            logActivities.append(logEntry).append("\n\n");
        }

        return logActivities.toString();
    }

    /**
     * studentInfo method displays the basic information of a student.
     *
     * @param studentId - a String value containing the ID number or the key of a hash value.
     * @return a String the contains the basic information of a student.
     */
    public String studentInfo(String studentId) {
        StringBuilder result = new StringBuilder();

        // Iterates through the hashmap
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            Student student = entry.getValue();

            // Checks if the ID number match a key
            if (entry.getKey().equals(studentId)) {
                result.append(String.format("ID NUMBER: %s%n", student.getKey()))
                        .append(String.format("NAME: %s %s%n", student.getFirstName(), student.getLastName()))
                        .append(String.format("GENDER: %s%n", student.getGender()))
                        .append(String.format("BIRTHDATE: %s %d, %d%n", student.getMonth(), student.getDay(), student.getYear()))
                        .append(String.format("AGE: %d%n", calculateAge(student.getYear(), student.getMonth(), student.getDay())))
                        .append(String.format("YEAR LEVEL: %s%n", student.getStudentYear()))
                        .append("--------------------------------------------------------\n");

                addLogActivity(student.getStudentYear() + " student: " + student.getFirstName() + " " + student.getLastName() + " viewed his/her profile.");
            }
        }

        return result.toString();
    }

    /**
     * teacherInfo method displays the basic information of a teacher.
     *
     * @param username - a String value containing the username or the key of a hash value.
     * @return a String the contains the basic information of a teacher.
     */
    public String teacherInfo(String username) {
        StringBuilder result = new StringBuilder();

        // Iterates through the hashmap
        for (Map.Entry<String, Teacher> entry : teacherMap.entrySet()) {
            Teacher teacher = entry.getValue();

            // Checks if the ID number match a key
            if (entry.getKey().equals(username)) {
                result.append(String.format("USERNAME: %s%n", teacher.getKey()))
                        .append(String.format("NAME: %s %s%n", teacher.getFirstName(), teacher.getLastName()))
                        .append(String.format("GENDER: %s%n", teacher.getGender()))
                        .append(String.format("BIRTHDATE: %s %d, %d%n", teacher.getMonth(), teacher.getDay(), teacher.getYear()))
                        .append(String.format("AGE: %d%n", calculateAge(teacher.getYear(), teacher.getMonth(), teacher.getDay())))
                        .append(String.format("PROFESSOR TYPE: %s%n", teacher.getProfType()))
                        .append("--------------------------------------------------------\n");

                addLogActivity(teacher.getProfType() + " " + teacher.getFirstName() + " " + teacher.getLastName() + " viewed his/her profile.");
            }
        }

        return result.toString();
    }

    /**
     * updateStudentName method lets the user update or change a student's name.
     *
     * @param newFirstName - a String value that contains the new first name from the user input.
     * @param newLastName - a String value that contains the new last name from the user input.
     */
    public void updateStudentName(String newFirstName, String newLastName) {
        String currentUser = getCurrentUser();

        // Checks if the current user exists
        if (currentUser != null && studentMap.containsKey(currentUser)) {
            Student student = studentMap.get(currentUser);
            student.setFirstName(newFirstName);
            student.setLastName(newLastName);
            addLogActivity("Student " + currentUser + " updated their name.");
        }
    }

    /**
     * updateStudentGender method lets the user update or change a student's gender.
     *
     * @param newGender - a String value that contains the new gender from the user input.
     */
    public void updateStudentGender(String newGender) {
        String currentUser = getCurrentUser();

        // Checks if the current user exists
        if (currentUser != null && studentMap.containsKey(currentUser)) {
            Student student = studentMap.get(currentUser);
            student.setGender(newGender);
            addLogActivity("Student " + currentUser + " updated their gender.");
        }
    }

    /**
     * updateStudentYear method lets the user update or change a student's year level.
     *
     * @param newYear - a String value that contains the new year level from the user input.
     */
    public void updateStudentYear(String newYear) {
        String currentUser = getCurrentUser();

        // Checks if the current user exists
        if (currentUser != null && studentMap.containsKey(currentUser)) {
            Student student = studentMap.get(currentUser);
            student.setStudentYear(newYear);
            addLogActivity("Student " + currentUser + " updated their year level.");
        }
    }

    /**
     * updateTeacherName method lets the user update or change a teacher's name.
     *
     * @param newFirstNameT - a String value that contains the new first name from the user input.
     * @param newLastNameT - a String value that contains the new last name from the user input.
     */
    public void updateTeacherName(String newFirstNameT, String newLastNameT) {
        String currentUser = getCurrentUser();

        // Checks if the current user exists
        if (currentUser != null && teacherMap.containsKey(currentUser)) {
            Teacher teacher = teacherMap.get(currentUser);
            teacher.setFirstName(newFirstNameT);
            teacher.setLastName(newLastNameT);
            addLogActivity("Teacher " + currentUser + " updated their name.");
        }
    }

    /**
     * updateTeacherGender method lets the user update or change a teacher's gender.
     *
     * @param newGenderT - a String value that contains the new gender from the user input.
     */
    public void updateTeacherGender(String newGenderT) {
        String currentUser = getCurrentUser();

        // Checks if the current user exists
        if (currentUser != null && teacherMap.containsKey(currentUser)) {
            Teacher teacher = teacherMap.get(currentUser);
            teacher.setGender(newGenderT);
            addLogActivity("Teacher " + currentUser + " updated their gender.");
        }
    }

    /**
     * updateTeacherType method lets the user update or change a teacher's professor type.
     *
     * @param newProfType - a String value that contains the new professor type from the user input.
     */
    public void updateTeacherType(String newProfType) {
        String currentUser = getCurrentUser();

        // Checks if the current user exists
        if (currentUser != null && teacherMap.containsKey(currentUser)) {
            Teacher teacher = teacherMap.get(currentUser);
            teacher.setProfType(newProfType);
            addLogActivity("Teacher " + currentUser + " updated their professor type.");
        }
    }

    /**
     * sendFriendRequest method lets a teacher send a friend request to another teacher.
     *
     * @param fromUsername - a String value that contains the username of the teacher that sent a friend request.
     * @param toUsername - a String value that contains the username of the teacher that a teacher wants to add.
     */
    public void sendFriendRequest(String fromUsername, String toUsername) {
        // Checks if both usernames exist
        if (teacherMap.containsKey(toUsername) && teacherMap.containsKey(fromUsername)) {
            Teacher toTeacher = teacherMap.get(toUsername);
            Teacher fromTeacher = teacherMap.get(fromUsername);

            // Check if they are already friends
            if (fromTeacher.getFriends().contains(toUsername)) {
                addLogActivity(fromUsername + " and " + toUsername + " are already friends.");
            } else if (toTeacher.getFriendRequests().contains(fromUsername)) {
                addLogActivity(fromUsername + " has already sent a friend request to " + toUsername + ".");
            } else {
                toTeacher.addFriendRequest(fromUsername);
                addLogActivity(fromUsername + " sent a friend request to " + toUsername);
            }
        } else {
            addLogActivity("Friend request failed. One or both usernames do not exist.");
        }
    }

    /**
     * acceptFriendRequest lets a teacher accept a friend request from another teacher.
     *
     * @param currentUser - a String value that contains the current teacher using the program.
     * @param fromUsername - a String value that contains the username of the teacher that sent a friend request.
     */
    public void acceptFriendRequest(String currentUser, String fromUsername) {
        // Checks if the current user exists
        if (teacherMap.containsKey(currentUser)) {
            Teacher currentTeacher = teacherMap.get(currentUser);

            if (currentTeacher.getFriendRequests().contains(fromUsername)) {
                // Add both teachers as friends to each other's friend lists
                currentTeacher.acceptFriendRequest(fromUsername);

                if (teacherMap.containsKey(fromUsername)) {
                    Teacher fromTeacher = teacherMap.get(fromUsername);
                    fromTeacher.getFriends().add(currentUser);
                }

                addLogActivity(currentUser + " accepted a friend request from " + fromUsername);
            } else {
                addLogActivity(currentUser + " has no friend request from " + fromUsername);
            }
        } else {
            addLogActivity("Accept friend request failed. Username " + currentUser + " does not exist.");
        }
    }

    /**
     * viewFriends method displays a teacher's friend list.
     *
     * @param username - a String value that contains a teacher's username.
     * @return a String where the usernames are separated by newlines.
     */
    public String viewFriends(String username) {
        // Checks if the user exists
        if (teacherMap.containsKey(username)) {
            List<String> friends = teacherMap.get(username).getFriends();
            StringBuilder sb = new StringBuilder();

            // Iterates through the user's friends
            for (String friend : friends) {
                sb.append(friend).append("\n");
            }
            return sb.toString().trim(); // .trim() to remove the trailing newline
        }

        return "No Friends Found.";
    }

    /**
     * viewFriendRequests method displays a teacher's friend request list.
     *
     * @param username - a String value that contains a teacher's username.
     * @return a String where the usernames are separated by newlines.
     */
    public String viewFriendRequests(String username) {
        if (teacherMap.containsKey(username)) {
            List<String> friendRequests = teacherMap.get(username).getFriendRequests();
            StringBuilder sb = new StringBuilder();
            for (String request : friendRequests) {
                sb.append(request).append("\n");
            }
            return sb.toString().trim(); // .trim() to remove the trailing newline
        }
        return "No Pending Friend Requests.";
    }

    /**
     * displayUsernameAndName method displays all the teacher's username and full name.
     *
     * @return a String containing the username and full name of teachers.
     */
    public String displayUsernameAndName() {
        StringBuilder teacherList = new StringBuilder();
        int i = 0;

        // Checks if the teacher hashmap is empty or not
        if(!(teacherMap.isEmpty())) {
            teacherList.append("=== Teacher List ===\n\n");

            // Iterates through the entire hashmap
            for (Map.Entry<String, Teacher> entry : teacherMap.entrySet()) {
                Teacher teacher = entry.getValue();
                i++;

                teacherList.append(i).append(".) ").append(teacher.getKey())
                        .append(" -- ")
                        .append(teacher.getFirstName()).append(" ").append(teacher.getLastName()).append("\n");

            }

            teacherList.append("-------------------------------------------------\n");
            return teacherList.toString();
        }

        return "No Teachers Available.";
    }

    /**
     * setCurrentUser method sets the current user of the program.
     *
     * @param userId - a String value that contains a teacher's username or a student's ID number.
     */
    public void setCurrentUser(String userId) {
        this.currentUser = userId;
    }

    /**
     * getCurrentUser returns the value of currentUser
     *
     * @return currentUser
     */
    public String getCurrentUser() {
        return currentUser;
    }

}
