package controller;

import util.DBUtil;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        DBUtil dbconect= DBUtil.getInstance();
        Connection connection= dbconect.getConnection();
        String sql= "INSERT INTO Products(Name, Description, Price, Discount_Price, Stock, Sold, Create_date, Status) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement= connection.prepareStatement(sql);
        preparedStatement.setString(1,"Test1");
        preparedStatement.setString(2,"Test1");
        preparedStatement.setBigDecimal(3, BigDecimal.valueOf(5000));
        preparedStatement.setBigDecimal(4,BigDecimal.valueOf(5000));
        preparedStatement.setInt(5,10);
        preparedStatement.setInt(6,3);
        preparedStatement.setString(7,"2021/05/05");
        preparedStatement.setInt(8,0);


        preparedStatement.executeUpdate();

        //Giang
    }
}
