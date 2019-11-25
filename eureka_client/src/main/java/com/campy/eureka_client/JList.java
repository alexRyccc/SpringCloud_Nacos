package com.campy.eureka_client;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ran_ych
 * @create 2019-11-23  12:04
 * @desc
 */
public class JList {
    public byte[] b1 =new byte[1024*1024];

    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep");
        fill(1000);
    }
    public static void fill(int n){
        List <JList> jlist =new ArrayList<>();
        for (int i=0;i<n;i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                jlist.add(new JList());
            }
        }


    }
}
