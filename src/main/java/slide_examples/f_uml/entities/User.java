package slide_examples.f_uml.entities;

public class User {
    private static int userCount = 0;
    public static final String DEFAULT_USERNAME = "defaultUser";

    private int userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName){
        if(!isValidString(username)){
            System.out.println("NULL OR BLANK USERNAME - REPLACED WITH DEFAULT VALUE");
            username = User.DEFAULT_USERNAME;
        }

        if(!isValidString(password)){
            System.out.println("NULL OR BLANK PASSWORD - THIS MUST BE CHANGED!!!");
        }

        User.userCount++;
        this.userId = User.userCount;

        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String username, String password){
        this(username, password, "", "");
    }

    private static boolean isValidString(String text){
        if(text == null || text.isBlank()) {
            return false;
        }

        return true;
    }

    public static int getUserCount() {
        return userCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof User user)) {
            return false;
        }

        if(userId != user.userId){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + "********" + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public boolean checkPassword(String password){
        if(!isValidString(password)){
            return false;
        }

        return this.password.equals(password);
    }
}
