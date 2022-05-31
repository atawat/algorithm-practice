package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
    }


    public void printA(){
        List<Integer> arrayList = new ArrayList<>();
        findTarget(arrayList, (Integer i)-> i == 5, ()->{
            System.out.println("a");
        });

    }

    public <T> void findTarget(Iterable<T> source, Predicate<T> filter, Runnable action){
        source.forEach(i->{
            if(filter.test(i)){
                action.run();
            }
        });
    }
}
