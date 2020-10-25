package com.mytry.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.SourceLocation;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MesUtils {

    @Before(value ="execution(public void com.mytry.task.iml.QuerryPartStatusTask.execute())")
    public static void logStartTime(){
        System.out.println("start time: "+System.currentTimeMillis());
    }//logStartTime

    @After(value="execution(public void com.mytry.task.iml.QuerryPartStatusTask.execute())")
    public static void logEndTimeNormal(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("signature: "+signature);
        Object[] args = joinPoint.getArgs();
        System.out.println("args: "+Arrays.toString(args));
        Object target = joinPoint.getTarget();
        System.out.println("target: "+target);
        String kind = joinPoint.getKind();
        System.out.println("kind: "+kind);

        Object aThis = joinPoint.getThis();
        System.out.println("aThis: "+aThis);

        SourceLocation sourceLocation = joinPoint.getSourceLocation();
        System.out.println("sourceLocation: "+sourceLocation);

        JoinPoint.StaticPart staticPart = joinPoint.getStaticPart();
        System.out.println("staticPart: "+staticPart);

        System.out.println("end time when normal: "+System.currentTimeMillis());
    }//logEndTimeNormal

    @AfterThrowing(value="execution(public void com.mytry.task.iml.QuerryPartStatusTask.execute())")
    public static void logEndTimeWithException(){
        System.out.println("end time when exception happens: "+System.currentTimeMillis());
    }//logEndTimeWithException
}
