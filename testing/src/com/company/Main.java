package com.company;

public class Main {

    public static void main(String[] args) {
        DeamonDemo thread1 = new DeamonDemo();
        DeamonDemo thread2 = new DeamonDemo();
        DeamonDemo thread3 = new DeamonDemo();
        thread1.setName("closable");
        thread1.setDaemon(true);
        thread2.setName("any name");
        thread2.setDaemon(true);
        thread3.setName("any name two");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
