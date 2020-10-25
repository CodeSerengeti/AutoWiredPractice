package com.mytry;

import com.mytry.task.iml.QuerryPartStatusTask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommandTaskTests {
    @Autowired
    QuerryPartStatusTask querryPartStatusTask;

    @Test
    public void testExecute(){
        try {
            querryPartStatusTask.execute();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

//        querryPartStatusTask.execute();
    }//testExecute
}//CommandTaskTests
