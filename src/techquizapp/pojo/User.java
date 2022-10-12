package techquizapp.pojo;
public class User {
    private String userid;
    private String password;
    private String userType;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User(String userid, String password, String userType) {
        this.userid = userid;
        this.password = password;
        this.userType = userType;
    }

    public User() {
    }
    
}
