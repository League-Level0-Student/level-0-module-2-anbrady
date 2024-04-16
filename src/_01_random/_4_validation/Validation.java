//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		
		String comp0 = "pretty!";
		String comp1 = "nice!";
		String comp2 = "cool!";
		String comp3 = "funny!";
		String comp4 = "interesting!";
		String comp5 = "smart!";
		String comp6 = "caring!";
		String comp7 = "tall!";
		String comp8 = "kind!";
		String comp9 = "fit!";
		
		System.out.print("Wow! You are so ");
		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			System.out.println(comp0);
		} 
		else if (randomNumber == 1) {
			System.out.println(comp1);
		} 
		else if (randomNumber == 2) {
			System.out.println(comp2);
		} 
		else if (randomNumber == 3) {
			System.out.println(comp3);
		} 
		else if (randomNumber == 4) {
			System.out.println(comp4);
		}
		else if (randomNumber == 5) {
			System.out.println(comp5);
		}
		else if (randomNumber == 6) {
			System.out.println(comp6);
		}
		else if (randomNumber == 7) {
			System.out.println(comp7);
		}
		else if (randomNumber == 8) {
			System.out.println(comp8);
		}
		else {
			System.out.println(comp9);
		}

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
