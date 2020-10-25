package com.mytry.assist;

import org.springframework.stereotype.Component;

@Component
public class MyDivider {
    public Integer div(Integer dividend, Integer divisor) throws ArithmeticException{

        Integer result=0;
        try {
            result=dividend/divisor;
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            throw e;
        }

        return result;
    }//div
}//MyDivider
