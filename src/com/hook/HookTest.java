package com.hook;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/12/27.
 */
public class HookTest {
    public void start(){
        Runtime.getRuntime().addShutdownHook(new Thread( () -> System.out.println("Excute Hook....")));
    }

    public static void main(String[] args){
        new HookTest().start();
        System.out.println("The Application is doing something");

        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
