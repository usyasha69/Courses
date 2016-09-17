package com.company.hometask;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("My thread!");
    }

    public static void main(String[] args) {
        System.out.println("Main thread!");
        new MyThread().start();
    }
}
