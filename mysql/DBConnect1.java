import java.sql.*;

public class DBConnect1 {
    public static void main(String[] args) throws Exception {
        Connection con;
        Statement st;
        ResultSet rs;

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "hjh";
        String passward = "1234";

        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, user, passward);
        st = con.createStatement();

        rs = st.executeQuery("SELECT 1 AS col_1");
        rs.next();
        System.out.print(rs.getInt("col_1"));

        rs.close();
        st.close();
        con.close();
    }
}