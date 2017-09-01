package com.ucuenca.spring;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;

/**
 * Created by santteegt
 */
@Controller
@EnableAutoConfiguration
public class SimpleController {

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World!";
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleController.class, args);
    }
}