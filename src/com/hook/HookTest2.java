package com.hook;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/12/27.
 */
public class HookTest2 {
    public void start(){
        Runtime.getRuntime().addShutdownHook(new Thread( () -> System.out.println("Excute Hook....")));
    }

    public static void main(String[] args){
        new HookTest2().start();
        System.out.println("The Application is doing something");
        byte[] b = new byte[500*1024*1024];
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
