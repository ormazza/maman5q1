package com.company;



public class SumThread extends Thread {


    @Override
    public void run() {
        while(!Main.rep.isSummed()) {
            int[] two = Main.rep.removeTwo();
            Thread.yield();
            Main.rep.enterSum(two[0] + two[1]);
            Thread.yield();
        }
        }
}
