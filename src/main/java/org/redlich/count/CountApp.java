/**
* CountApp.java
* @version 1.0.0 8/15/2002
* @author Michael P. Redlich
*/

package org.redlich.count;

import java.io.*;

public class CountApp {
	public static void main(String[] args) throws IOException {
		// if(args.length < 2) {
			// System.out.println("usage: java count.CountApp {string} {character}");
			// System.exit(1);
			// }
		// Count count = new Count(args[0],args[1]);
		Count count = new Count("Mike","i");
		char character = count.getCharacter();
		int numChars = count.getCount();
		System.out.println();
		if(numChars == 1)
			System.out.println("There is " + numChars + " occurence of the character '" + character + "'");
		else
			System.out.println("There are " + numChars + " occurences of the character '" + character + "'");
		System.out.println("within the string, \"" + count.getString() + ".\"");
		// CountVowels vowels = new CountVowels(args[0]);
		CountVowels vowels = new CountVowels("Mike");
		System.out.println(vowels.getVowelCount());
		}
	}
