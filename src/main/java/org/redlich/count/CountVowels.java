/**
* CountVowels.java
* @version 1.0.0 9/25/2002
* @author Michael P. Redlich
*/

package org.redlich.count;

public class CountVowels {
	private String string;
	private int letterA = 0;
	private int letterE = 0;
	private int letterI = 0;
	private int letterO = 0;
	private int letterU = 0;

	public CountVowels(String string) {
		this.string = string;
		}

	public String getString() {
		return string;
		}

	public String getVowelCount() {
		int count = 0;
		int n = string.length();
		for(int i = 0;i < n;++i) {
			char character = string.charAt(i);
			switch(character) {
				case 'a':
					++letterA;
					break;
				case 'e':
					++letterE;
					break;
				case 'i':
					++letterI;
					break;
				case 'o':
					++letterO;
					break;
				case 'u':
					++letterU;
					break;
				default:
					break;
				}
			}
		return "There are " + letterA + " a's, " + letterE + " e's, " + letterI + " i's, " + letterO + " o's, and " + letterU + " u's in " + "\r\n" + getString();
		}
	}
