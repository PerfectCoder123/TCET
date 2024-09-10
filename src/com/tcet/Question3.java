package com.tcet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		ProgramDriver3 programDriver3 = new ProgramDriver3();
		programDriver3.execute();

	}

}

/*
 * This is a program driver class
 * */
class ProgramDriver3{
	public void execute() {
		try (Scanner inptScanner = new Scanner(System.in)) {
			System.out.println("Enter the Strings");
			String inputString = inptScanner.nextLine();
			FrequencyCounter frequencyCounter = new FrequencyCounter();
			frequencyCounter.countFrequency(inputString);
		}
	}
}

class FrequencyCounter{
	public void countFrequency(String words){
		
		// split the words
		String word[] = words.split(" ");
		
		// put the words in hashmap
		Map<String, Integer> countMap = new HashMap<>();
		for(String w : word) {
			countMap.put(w, countMap.getOrDefault(w, 0) + 1);
		}
		
		// find the count of words from hashmap
		for(String key : countMap.keySet()) {
			System.out.println(key + " : " + countMap.get(key));
		}
	}
}