package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller {
    static Repository rep;
    public Controller(){
        rep = new Repository(new int[]{14, 23, 4, 5,23,31,46,2,55,8,9,2,54,26,74,87,36,134214,213,124,6,7657,97,6,32432,235,7,7,9,0,4,54,4});
        ExecutorService excutor = Executors.newScheduledThreadPool(10);
        excutor.execute(new SumThread());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Controller.rep.size());
        System.out.println(Controller.rep.getFirst());
    }
}
