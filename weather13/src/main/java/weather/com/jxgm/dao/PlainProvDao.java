package com.jxgm.dao;

import java.util.*;

import java.sql.*;

import com.jxgm.entities.Province;

//省
public class PlainProvDao implements ProvDao {
    static {
        try{
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
        } 
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/shop",
            "hjh", "1234");
    }

    private void closeConnection(Connection connection) {
        if(connection == null) {
            return;
        }
        try {
            connection.close();
        } catch (SQLException ex) {
        }
    }

    @Override
    public Province findById(String id) {
        Province p = new Province();
        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement("select name from province where id = ?");
            pstmt.setString(1, id);

            ResultSet result = pstmt.executeQuery();

            if (result.next()) {
                String name = result.getString("name");

                p.setId(id);
                p.setName(name);

            }
            pstmt.close();
        } catch (SQLException ex) {
        } finally{
            closeConnection(connection);
        }
        return p;
    }
}