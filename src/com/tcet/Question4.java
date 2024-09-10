package com.tcet;

import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
	public static void main(String[] args) {
		ProgramDriver4 programDriver4  = new ProgramDriver4();
		programDriver4.execute();
	}
}

/*
 * This is a program driver class
 * */
class ProgramDriver4{
	public void execute() {
		EvenInteger evenInteger = new EvenInteger();
		evenInteger.filterEvenInteger(List.of(2,3,4,5,6,76,7,41,53));
	}
}

class EvenInteger{
	public void filterEvenInteger(List<Integer> list) {
		//Filtering the Even numbers
		List<Integer> filteredList = list.stream().filter(number -> number%2 == 0).collect(Collectors.toList());
		
		//Normal List
		System.out.println("This is the unfiltered List");
		System.out.println(list);
		System.out.println();
		
		
		//Printing the even numbers List
		System.out.println("This is the filtered List");
		System.out.println(filteredList);
	}
}