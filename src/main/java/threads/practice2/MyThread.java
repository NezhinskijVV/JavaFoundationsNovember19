package threads.practice2;

import collections.listPractice.MyLinkedList;

public class MyThread extends Thread {
    private int key;
    private ThreadPractice threadPractice;

    public MyThread(int key, ThreadPractice threadPractice){
        this.key = key;
        this.threadPractice = threadPractice;
    }

    @Override
    public void run() {
        try {
            threadPractice.printRun(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
