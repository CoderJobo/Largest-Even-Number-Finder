/*
 * Write a section of Java code that identifies the biggest even number in the 
 * following array.  For the array shown the program output would be 10.
 * 
 * int y[] = {2,6,7,9,10,11,4,3,7};
 */

import java.util.Random;

public class LargestEvenNumberFinder {
	
	int largestEvenNumber;
	int[] numArray;
	
	public LargestEvenNumberFinder() {
	}
	
	public LargestEvenNumberFinder(int[] numArr) {
		numArray = numArr;
		largestEvenNumber = findLargestEvenNumber(numArray);
	}
	
	public LargestEvenNumberFinder(int arraySize, int largestNum) {
		populateArray(arraySize, largestNum);
		largestEvenNumber = findLargestEvenNumber(numArray);
	}
	
	public int findLargestEvenNumber(int[] numArr) {
		int largest = 0;
		for (int i = 0; i < numArr.length; i++) {
			if(numArr[i] % 2 == 0 && numArr[i] > largest) {
				largest = numArr[i];
			}
		}
		return largest;
	}
	
	public void populateArray(int size, int largest) {
		numArray = new int[size];		
		Random randomGenerator = new Random();
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = randomGenerator.nextInt(largest);
		}
	}
	
	public int getLargestEvenNumber() {
		return largestEvenNumber;
	}
	
	public int[] getNumArray() {
		return numArray;
	}
	
	public void printArrayContents() {
		System.out.println("Printing array contents...");
		System.out.print("[");
		for(int i = 0; i < numArray.length; i++) {
			if(i != numArray.length-1){
				System.out.print(numArray[i] + ", ");
			}
			else {
				System.out.print(numArray[i]);
			}
		}
		System.out.println("]");
		System.out.println();
	}
}
