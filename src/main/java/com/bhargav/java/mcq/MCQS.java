package com.bhargav.java.mcq;

import java.util.Optional;
import java.util.concurrent.Executors;

public class MCQS {
    public static void main(String[] args){
        String s[] = new String[5];
        s[2] = "Java";
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        Optional<String> value = Optional.of(s[2]);
        System.out.println(value);
    }
    /*ExecutorService excalibur = Executors.newFixedThreadPool(2);
    Reentrant lock = new ReentrantLock();
    excalibur.submit(() -> {
        lock.lock();
        try{
            sleep(2);
        }finally{
            lock.unlock();
        }
    });
    excalibur.submit(() -> {lock.lock()});
    stop.excalibur(excalibur);
    Answer is TryLock()
    */
}
