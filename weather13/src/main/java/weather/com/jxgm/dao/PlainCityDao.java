package com.jxgm.dao;

import java.util.*;

import java.sql.*;

import com.jxgm.entities.City;

//城市
public class PlainCityDao implements CityDao {
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
    public List<City> findByPid(String pid) {
        City c;
        List<City> cities = new ArrayList<>();
        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement("select code, name from pcity where pid = ?");
            pstmt.setString(1, pid);

            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                String code = result.getString("code");
                String name = result.getString("name");

                c = new City();
                c.setPid(pid);
                c.setCode(code);
                c.setName(name);
                cities.add(c);
            }
            pstmt.close();
        } catch (SQLException ex) {
        } finally{
            closeConnection(connection);
        }
        return cities;
    }
}