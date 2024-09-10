package com.tcet;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		ProgramDriver5 programDriver5 = new ProgramDriver5();
		programDriver5.execute();
	}

}

/*
 * This is a program driver class
 * */
class ProgramDriver5{
	public void execute() {
		OrganizeCrates organizeCrates = new OrganizeCrates();
		organizeCrates.createOrganizer(new int[] {0,0,1,2,4,1,0,0, 0,2,2,0,1,0});
	}
}

/*
 * The approach which i have followed is I assumed that all the non zero number will start from zero index and next number will be followed so on and rest will be filled with zeros
 * */
class OrganizeCrates {
    public void createOrganizer(int[] crates) {
        System.out.println("Crates Before organizing");
        System.out.println(Arrays.toString(crates));
        
        int n = crates.length;
        int nonZeroIndex = 0; 
        
        for (int i = 0; i < n; i++) {
            if (crates[i] != 0) {
                crates[nonZeroIndex] = crates[i];
                nonZeroIndex++;
            }
        }
       
        while (nonZeroIndex < n) {
            crates[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        System.out.println();
        System.out.println("Crates After organizing");
        System.out.println(Arrays.toString(crates));
    }
}
