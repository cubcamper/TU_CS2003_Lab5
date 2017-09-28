/**
@author george-patterson
**/

package palindrome;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Palindrome {
	
	
	public static void main(String[] args) {
		String[] expressions = {"Anna", "391", "404", "bal lab", "foo", 
				"goof", "bar", "toot", "a", "Able was I ere I saw Elba", "amanaplanacanalpanama",
				"bootcalllactoob", "trulalurt", "2002", "1444", "to", "oo"};
		
		
		testPalindrome(5);
		
		testPalindrome(expressions);
		
		
	}
	
	/**
	 * Boolean method returns true if a word is spelled the same way backwards as it is spelled forwards
	 * @param expr
	 */
	
	public static boolean isaPalindrome(String expr) {
		
		expr=expr.toLowerCase();		//make all of the characters in a word the came case
		
		int n=expr.length();
		
		if (n<2) {						// base case: in case of reaching middle of odd number lettered word: n=1, even number letter: n = 0
			return true;				// returns true because it reaches the middle of a word without finding letters that don't match
		}
		else {
			if (expr.charAt(0) == expr.charAt(n-1)) {  				//if first and last letter are the same
					isaPalindrome(expr.substring(1,n-1));		    //run method on the word minus its first and last characters
					return true;
			}
			else {
				return false;									//returns false when first and last letters are different
			}
		}
		
	}
	
	
	/**
	 * Loops through an array of possible palindromes to tell user if each word is a palindrome or not
	 * @param tests
	 */
	
	public static void testPalindrome(String[] tests) {
		System.out.println("Here are some more palindromes that we tested for you!");
		for (String s: tests) {
			if (isaPalindrome(s)) {
				System.out.println(s + " is a palindrome!");		//prints to user if a word is a palindrome
			}
			else {
				System.out.println(s + " is NOT a palindrome!");	//prints to user if a word is not a palindrome

			}
		}
	}
	
	/**
	 * Lets the user know if a String is a palindrome
	 * @param s
	 */
	public static void testPalindrome(String s) {
			if (isaPalindrome(s)) {
				System.out.println(s + " is a palindrome!");		//prints to user if a word is a palindrome
			}
			else {
				System.out.println(s + " is NOT a palindrome!");	//prints to user if a word is not a palindrome

			}
	}
	
	/**
	 * Solicits user for n number of strings and checks each one individually to see if it is a palindrome
	 * @param n
	 */
	public static void testPalindrome(int n) {
		Scanner board = new Scanner(System.in);
		System.out.println("Give me " + n + " palindromes!");
		int i=0;
		while (i<n) {
			System.out.println("Palindrome " + (i+1) + ":");
			String word = board.next();
			testPalindrome(word);
			i++;
		}
		
	}
	
	
}