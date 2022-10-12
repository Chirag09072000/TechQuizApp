package techquizapp.pojo;
public class UserProfile {
    private static String username;
    private static String usertype;
    public static String getUserType()
    {
        return usertype;
    }
    public static void setUsername(String username)
    {
        UserProfile.username=username;
    }
    public static void setUserType(String usertype)
    {
        UserProfile.usertype=usertype;
    }

    public static String getUsername() {
        return username;
    }
}
