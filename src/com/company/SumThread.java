package com.company;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class SumThread implements Runnable {


    @Override
    public void run() {
        while(!Controller.rep.isSummed()) {
            int[] two = Controller.rep.removeTwo();
            Thread.yield();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Controller.rep.enterSum(two[0] + two[1]);
            Thread.yield();
            System.out.println(Thread.currentThread().getId());
        }
        }
}
