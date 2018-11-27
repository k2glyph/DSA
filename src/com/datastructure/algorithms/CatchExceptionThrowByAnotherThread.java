package com.datastructure.algorithms;

public class CatchExceptionThrowByAnotherThread {

    public static void main(String[] args) {
        Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread th, Throwable ex) {
                ex.printStackTrace();
            }
        };
        // create another thread
        Thread otherThread = new Thread() {
            public void run() {
                System.out.println("Sleeping ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted.");

                }
                System.out.println("Throwing exception ...");
                throw new RuntimeException();
            }
        };
        otherThread.setUncaughtExceptionHandler(handler);
        otherThread.start();
    }

}
