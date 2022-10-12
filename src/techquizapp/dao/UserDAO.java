package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.Student;
import techquizapp.pojo.User;

public class UserDAO {
    public static boolean validateUser(User user) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
        ps.setString(1,user.getUserid());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static boolean registerStudent(Student std) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?)");
        ps.setString(1,std.getUserid());
        ps.setString(2,std.getPassword());
        ps.setString(3,std.getUserType());
        int ans=ps.executeUpdate();
        return ans==1;
    }
    public static boolean updatePassword(Student std) throws SQLException
    {
        String qry="update users set password=? where userid=? and usertype=?";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,std.getPassword());
        ps.setString(2,std.getUserid());
        ps.setString(3,std.getUserType());
        int ans=ps.executeUpdate();
        return ans==1;
    }
    
}
