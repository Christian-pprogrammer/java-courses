package com.company;

public class DeamonDemo extends Thread{
    @Override
    public void run() {
        try{
            String name = Thread.currentThread().getName();
            System.out.println(name);
            if(Thread.currentThread().isDaemon()) {
                System.out.println("daemon thread");
                if(name.equals("closable")) {
                    System.out.println(name);
                    Thread.currentThread().stop();
                }
                System.out.println("stopping thread");
                Thread.currentThread().stop();
            }
            System.out.println("Not stoped");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
