package jb;

import models.CustomerOrderHistory;

import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
private DataSource dataSource;


    public DatabaseManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

public List<CustomerOrderHistory> custOrderHistoryProcedure(){
    ArrayList<CustomerOrderHistory> orders = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("{CALL CustOrderHistory(?)}");
             ){
            CallableStatement stmt = connection.prepareCall(preparedStatement);
            stmt.setString(1,"");

            ResultSet results = stmt.executeQuery();

            while (results.next()){

            }

        }catch (Exception e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
}




}
