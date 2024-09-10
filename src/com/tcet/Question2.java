package com.tcet;


/*
 * This class is responsible for printing numbers from 1 to 5.
 */

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
/*
 * This is a program driver class
 * */
class ProgramDriver2 {
    public void execute() {
        // Creating a Runnable object
        NumberPrinter numberPrinter = new NumberPrinter();

        // Creating a Thread object with the Runnable object
        Thread thread = new Thread(numberPrinter);

        // Starting the thread
        thread.start();
    }
}

public class Question2 {

	public static void main(String[] args) {
		ProgramDriver2 programDriver2 = new ProgramDriver2();
		programDriver2.execute();
	}
}

