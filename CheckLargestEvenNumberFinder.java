/*
 * The following program tests the LargestEvenNumberFinder class 
 * 
 * @Author: Joan Hickey
 * @Version: 29th April 2020
 */

import java.util.Scanner;

public class CheckLargestEvenNumberFinder {

	public static void main(String[] args) {
		
		System.out.println("Checking first constructor LargestEvenNumberFinder(int[] numArr)...\n");
		int y[] = {2,6,7,9,10,11,4,3,7};
		LargestEvenNumberFinder finder1 = new LargestEvenNumberFinder (y);
		finder1.printArrayContents();
		int largest1 = finder1.getLargestEvenNumber();
		
		System.out.println("The largest even number in array y is " + largest1);
		System.out.println("\n====================\n");
		System.out.println();
		
		System.out.println("Checking second constructor LargestEvenNumberFinder(int arraySize, int largestNum)...\n");
		Scanner scanUserInput = new Scanner(System.in);
		System.out.println("What size should the array be?");
		int arraySize = scanUserInput.nextInt();
		System.out.println("What is the largest possible number the array may contain?");
		int largestNum = scanUserInput.nextInt();
		System.out.println();
		LargestEvenNumberFinder finder2 = new LargestEvenNumberFinder(arraySize, largestNum); 
		finder2.printArrayContents();
		int largest2 = finder2.getLargestEvenNumber();
		
		System.out.println("The largest even number in the array is " + largest2);
		System.out.println("\n====================\n");
		System.out.println();
		
		scanUserInput.close();
		System.out.println("END");
	}
}
