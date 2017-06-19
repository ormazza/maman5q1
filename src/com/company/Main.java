package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static Repository rep;
    public static void main(String[] args) {
        //System.out.println("enter length of array");
        //int n = Integer.parseInt(System.console().readLine());


        int n = Integer.parseInt(JOptionPane.showInputDialog("enter the length of array (N)"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("enter the amount of thread (M)"));
 /*       System.out.println("enter amount of thread");
        int m = Integer.parseInt(System.console().readLine());*/

        int[] nums =  new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            nums[i]  = rand.nextInt(10)+1;
        }
        rep = new Repository(nums);

        ExecutorService exec = Executors.newFixedThreadPool(m);
        for (int i = 0; i < m; i++) {
            exec.execute(new SumThread());
        }
        exec.shutdown();
        try {
            exec.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,rep.getFirst());
    }
}
