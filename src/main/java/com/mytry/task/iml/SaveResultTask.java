package com.mytry.task.iml;


import com.mytry.task.CommandTask;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SaveResultTask implements CommandTask {
    @Override
    public void execute() {
        System.out.println("execute save task and return pass/fail boolean");
    }
}
