/**
 * Subject class that holds different information regarding a subject or class.
 */
public class Subject {
    private String code, name, sched, time, mode;

    /**
     * The sole constructor of the Subject Class.
     *
     * @param code - a String value that holds a unique randomized class code.
     * @param name - a String value that holds the name of the class.
     * @param sched - a String value that holds the weekly schedule of the class.
     * @param time - a String value that holds the daily (hourly) schedule of the class.
     * @param mode - a String value that holds the modality of the class across a week.
     */
    public Subject(String code, String name, String sched, String time, String mode) {
        this.code = code;
        this.name = name;
        this.sched = sched;
        this.time = time;
        this.mode = mode;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSched() {
        return sched;
    }

    public String getMode() {
        return mode;
    }

    public String getTime() {
        return time;
    }
}
