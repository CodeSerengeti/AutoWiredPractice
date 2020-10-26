package com.mytry;

import com.entity.PartQueryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PartQueryInfoJsonTests {
    @Autowired
    PartQueryInfo partQueryInfo;

    public void testObjectToJson(){
        partQueryInfo.setQueryPartNumber("scu001");
        partQueryInfo.setQueryOrderNumber("order001");
        partQueryInfo.setQueryStation("coating");
        partQueryInfo.setTask("new task");

    }//testObjectToJson
}//class
