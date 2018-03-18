package org.sustiha.singleton;

/**
 * Created by sustihashreesampath on 12/18/16.
 */
public class SingletonTest implements Runnable{

    @Override
    public void run() {

        System.out.println("started thread" + Thread.currentThread());
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);
    }

    public static void main(String [] args)
    {
        SingletonTest singletonTest = new SingletonTest();
       Thread thread1 = new Thread(singletonTest);
       thread1.start();
       Thread thread2 = new Thread(singletonTest);
       thread2.start();


    }
}
