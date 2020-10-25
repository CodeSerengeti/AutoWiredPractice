package com.mytry;

import com.mytry.dao.MyDaoImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    MyDaoImpl myDao;

    public static void main(String[] args) {


        SpringApplication.run(DemoApplication.class, args);
//        myDao.querryData();
        System.out.println("this is DemoApplication main method");

    }

    @Test
    public void myMethod(){
        myDao.querryData();
    }
}
