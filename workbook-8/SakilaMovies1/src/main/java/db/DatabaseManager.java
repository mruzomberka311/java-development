package db;
import models.Actor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private DataSource dataSource;

    public DatabaseManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Actor> actorByName(String lastName) {
        List<Actor> actors = new ArrayList<>();

        try (Connection connection = dataSource.getConnection()
             PreparedStatement pre){


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
