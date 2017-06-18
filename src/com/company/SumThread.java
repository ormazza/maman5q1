package com.company;

public class SumThread implements Runnable {



    @Override
    public void run() {
        int[] two = Controller.rep.removeTwo();
        Controller.rep.enterSum(two[0]+two[1]);
    }
}
