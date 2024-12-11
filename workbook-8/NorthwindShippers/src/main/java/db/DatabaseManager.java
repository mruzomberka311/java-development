package db;

import models.Shipper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DatabaseManager {
    private DataSource dataSource;

    public DatabaseManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

public void insertShipperData(String name, String phone){
        try (Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO 'CompnayName', 'Phone' VALUES = (?), (?)");){
            preparedStatement.setString(2,name);
            preparedStatement.setString(3, phone);

            preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
}


public static void displayAllShippers(){
    try (Connection connection = dataSource.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM shippers");){

       ResultSet rows = preparedStatement.executeQuery();
        while(rows.next()){
            System.out.println(rows);
        }

    }catch (Exception e){
        System.out.println("An error has occurred");
        e.printStackTrace();
    }
}

public void updateShippers(int shipperId, String updatedPhone){
    try (Connection connection = dataSource.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement("UPDATE shippers SET phone = ? WHERE shipperId = ? ");){
        preparedStatement.setInt(1,shipperId);
        preparedStatement.setString(3, updatedPhone);

        preparedStatement.executeUpdate();

    }catch (Exception e){
        System.out.println("An error has occurred");
        e.printStackTrace();
    }
}






}
