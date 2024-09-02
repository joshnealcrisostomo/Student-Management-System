import java.util.ArrayList;
import java.util.List;

/**
 * Subclass of the User Class
 */
public class Teacher extends User{
    private String profType;
    private List<String> friends;
    private List<String> friendRequests;

    /**
     * The sole constructor of the Teacher Class.
     *
     * @param firstName - a String value that holds the current teacher's first name.
     * @param lastName - a String value that holds the current teacher's last name.
     * @param key - a String value that holds the current teacher's username.
     * @param gender - a String value that holds the current teacher's gender.
     * @param password - a String value that holds the current teacher's password.
     * @param month - a String value that holds the current teacher's birth month.
     * @param day - an integer value that holds the current teacher's day of birth.
     * @param year - an integer value that holds the current teacher's birth year.
     * @param profType - a String value that holds the current teacher's professor type.
     */
    public Teacher(String firstName, String lastName, String key, String gender, String password, String month, int day, int year, String profType) {
        super(firstName, lastName, key, gender, password, month, day, year);
        this.profType = profType;
        this.friends = new ArrayList<>();
        this.friendRequests = new ArrayList<>();
    }

    /**
     * getFriends method returns a list of a teacher's friends.
     *
     * @return friends
     */
    public List<String> getFriends() {
        return friends;
    }

    /**
     * getFriendRequests method returns a list of a teacher's friend requests.
     *
     * @return friendRequests
     */
    public List<String> getFriendRequests() {
        return friendRequests;
    }

    /**
     * addFriendRequest method adds a friend request in the friend request list.
     *
     * @param username - a String value that holds the username that a teacher wants to add as friends.
     */
    public void addFriendRequest(String username) {
        friendRequests.add(username);
    }

    /**
     * acceptFriendRequest method accepts a pending friend request.
     *
     * @param username - a String value that holds the username where the request came from.
     */
    public void acceptFriendRequest(String username) {
        if(friendRequests.contains(username)) {
            friendRequests.remove(username);
            friends.add(username);
        }
    }

    /**
     * getProfType method returns a teacher's professor type.
     *
     * @return profType
     */
    public String getProfType() {
        return profType;
    }

    /**
     * setProfType method lets a user modify a teacher's professor type.
     *
     * @param profType - a String value that holds the modified professor type.
     */
    public void setProfType(String profType) {
        this.profType = profType;
    }
}
