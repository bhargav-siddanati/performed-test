package com.bhargav.java.interview.infosys;

public class SingletonClass {
    private static SingletonClass singleton;
    private SingletonClass(){}

    public static SingletonClass getSingleton(){
        if(singleton == null){
            synchronized(SingletonClass.class){
                if(singleton == null){
                    singleton = new SingletonClass();
                }
            }
        }
        return singleton;
    }
}
