package config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataConfig {

    private BasicDataSource datasource;


    @Bean
    public DataSource dataSource(){
        return datasource;
    }
   public DataConfig(@Value("${datasource.url}") String url,
                     @Value ("${datasource.username}") String username,
                     @Value ("${datasource.password}" )String password){

        datasource = new BasicDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
       System.out.println(url + " : " + username + " : " + password);
   }



}
