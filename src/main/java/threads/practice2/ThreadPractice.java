package threads.practice2;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
//        final Object obj = new Object();
//        synchronized (obj) {
//            obj.wait();
//        }
//
//        synchronized (obj) {
//            new Object().wait();
//        }
//        synchronized (obj) {
//            synchronized (new Object()) {
//                obj.wait();
//            }
//        }

//        SynchCar synchCar = new SynchCar();
//        synchCar.print();

//        ThreadPractice threadPractice = new ThreadPractice();
//        MyThread thread1 = new MyThread(1, threadPractice);
//        MyThread thread2 = new MyThread(2, threadPractice);
//        MyThread thread3 = new MyThread(3, threadPractice);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        Thread.sleep(10000);
//
//        synchronized (threadPractice) {
//            threadPractice.notifyAll();
//        }

        Class clazz = ThreadPractice.class;
        synchronized (clazz){
            clazz.wait();
        }
    }

    public synchronized void printRun(int key) throws InterruptedException {
        System.out.println("b: " + key);
//        Thread.sleep(1000);
        this.wait();
        System.out.println("e: " + key);
    }
}