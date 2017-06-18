package com.company;

import java.util.ArrayList;

public class Repository {
    private ArrayList<Integer> list;

    public Repository(int[] array) {
        list = new ArrayList<Integer>();
        for (int num:array
             ) {
            list.add(num);
        }
    }

    public synchronized int[] removeTwo() {
        int[] res = new int[2];
        for (int i = 0; i < 2; i++) {
            if (!list.isEmpty()) {
                res[i] = list.remove(0);
            } else {
                res[i] = 0;
            }
        }

        return res;
    }
    public boolean isSummed(){
        if(list.size()==1){
            return true;
        }
        return false;
    }

    public synchronized void enterSum(int num) {
        list.add(num);
    }
    public  int getFirst(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
}
