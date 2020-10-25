package com.mytry.task.iml;



import com.mytry.assist.MyDivider;
import com.mytry.task.CommandTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;


@Service
@Scope("prototype")
public class QuerryPartStatusTask implements CommandTask {

    @Autowired
    MyDivider myDivider;
    @Override
    public void execute() throws ArithmeticException{
        Integer result = null;
/*        try {
            result = myDivider.div(15, 0);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            throw e;
        }*/

        result = myDivider.div(15, 0);

        System.out.println("execute querry part status task and return result, simulated divide result: "+result);
    }//execute

}//class