package com.paypal.rayho;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

        Talk someTalk = (String name) -> { System.out.println("Hello " + name);};

        someTalk.sayHello("Raymond");

        someTalk = (String name) -> { System.out.println("Hello man," + name);};

        someTalk.sayHello("Raymond");
    }
}
