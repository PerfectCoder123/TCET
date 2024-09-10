package com.tcet;


/*
 *This is a functional interface consisting of one abstract method say
 **/
@FunctionalInterface
interface Sayable {
    String say(String message);
}

/*
 * This is a program driver class
 * */
class ProgramDriver1{
	public void execute() {
		// Implementing Sayable using a lambda expression and passing a message
        Sayable sayable = (message) -> "Hello, " + message + "!";

        // Executing the lambda implementation
        String greeting = sayable.say("Jahid");
        System.out.println(greeting);
	}
}

public class Question1 {
	public static void main(String[] args) {
		ProgramDriver1 driver1 = new ProgramDriver1();
	    driver1.execute();
	}
}

