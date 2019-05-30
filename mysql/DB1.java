import java.util.*;

public class DB1{
    public static void main(String[] args) throws Exception{
        Connection con;
        Statement st;
        ResultSet rs;

        String url = "jdbc:postgresql://localhost:5432/shop";
        String user = "hjh";
        String passward = "1234";

        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, user, passward);
        st = con.createStatement();

        rs = st.executeQuery("select product_id, product_name from product");

        while (rs.next()) {
            System.out.print(rs.getString("product_id") + ", ");
            System.out.println(rs.getString("product_name"));
        }

        rs.close();
        st.close();
        con.close();
    }
}