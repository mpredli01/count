/**
* Count.java
* @version 1.0.0 8/15/2002
* @author Michael P. Redlich
*/

package org.redlich.count;

public class Count {
	private String string;
	private char character;

	public Count(String string,String value) {
		this.string = string;
		character = value.charAt(0);
		}

	public String getString() {
		return string;
		}

	public char getCharacter() {
		return character;
		}

	public int getCount() {
		int count = 0;
		int n = string.length();
		for(int i = 0;i < n;++i)
			if(string.charAt(i) == character)
				++count;
		return count;
		}
	}
