package com.ucuenca.spring;

import com.ucuenca.spring.dao.CustomerRepository;
import com.ucuenca.spring.model.Customer;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by santteegt
 */
@Controller
@RequestMapping(path = "/customer")
public class SimpleController {

    @Autowired
    DataSource dataSource;

    @Autowired
    private CustomerRepository customerRepository;

    private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> createCustomer(@RequestParam(required = true) String name,
                                            @RequestParam(required = true) String email) {
        customerRepository.addCustomer(name, email);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> getCustomers() {
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        logger.info("DATASOURCE = " + dataSource);

        // If you want to check the HikariDataSource settings
        if(dataSource instanceof HikariDataSource) {
            HikariDataSource newds = (HikariDataSource)dataSource;
            logger.info("USING DATASOURCE WITH HIKARICP -> Max pool size = " + newds.getMaximumPoolSize());
        }
        return "Hello World!";
    }

}