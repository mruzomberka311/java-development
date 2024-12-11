package db;




import javax.sql.DataSource;
import java.beans.BeanProperty;
import java.util.stream.BaseStream;

@Configuration
public class DatabaseConfig {

    private BasicDataSource datasource;


    @Bean
    public DataSource dataSource(){
        return datasource;
    }


    datasource = new BasicDataSource();
    datasource.setUrl(url);
    datasource.setUsername(username);
    datasource.setPassword(password);

    System.out.println(url + " : " + username " : " + password);
}
