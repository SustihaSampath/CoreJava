package org.sustiha.singleton;

/**
 * Created by sustihashreesampath on 12/18/16.
 */
public class SingletonClass {

    private static SingletonClass singletonClass = null;

    public static SingletonClass getInstance()
    {

        System.out.println("inside getinstance");
        if(singletonClass == null)
        {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
