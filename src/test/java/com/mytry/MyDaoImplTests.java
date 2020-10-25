package com.mytry;

import com.mytry.dao.MyDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyDaoImplTests {

    @Autowired
    MyDaoImpl myDao;

    @Test
    public void testQuerryData(){
        System.out.println("myDao:"+myDao);
        myDao.querryData();
    }//testQuerryData
}//this class
