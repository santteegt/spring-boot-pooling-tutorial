package com.ucuenca.spring;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by santteegt on 13/03/2018.
 */

@SpringBootApplication
public class SpringBootServiceApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootServiceApplication.class, args);

    }
}
