package javacollection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
       
	final static int NUM_Digits = 5;
	public static void main(String[] arg) {
		try {
			if(arg.length !=1 ||arg[0].length() !=NUM_Digits)
				throw new IllegalArgumentException();
		}catch(IllegalArgumentException nfe) {
			
		}
		String guessStr = arg[0];
		System.out.println("Guess"+guessStr);
		List<Integer> secretSolution = new ArrayList<Integer>();
		secretSolution.add(5);
		secretSolution.add(3);
		secretSolution.add(2);
		secretSolution.add(7);
		secretSolution.add(2);
		List<Integer> guess = new ArrayList<Integer>();
		for(int i = 0 ;i<guessStr.length();i++)
			guess.add(Character.getNumericValue(guessStr.charAt(i)));
		
		List<Integer> duplicated = new ArrayList<Integer>(secretSolution);
		int numOfDigitIncluded = 0;
		for(int i = 0;i<NUM_Digits;i++)
			if(duplicated.remove(guess.get(i)))
				numOfDigitIncluded++;
		System.out.println(numOfDigitIncluded+"digits correctly included");
		
	}
}
