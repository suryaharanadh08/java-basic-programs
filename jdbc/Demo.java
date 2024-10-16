import java.sql.*;
class Demo{
    public static void main(String args[]) throws SQLException{
        String sql = "SELECT * FROM cricket ";
        String url = "jdbc:mysql://localhost:3306/games ";
        String userName = "root";
        String Password = "M1racle@123";

        Connection conn = Drivermanager.getConnection(url,userName,Password);
        statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);

    }
}