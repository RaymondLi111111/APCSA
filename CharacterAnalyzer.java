package unit5;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar('5');

	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar >= 'A' && theChar <= 'Z'){
			return true;
		}
		return false;
	}

	public boolean isLower( )
	{
		if (theChar >= 'a' && theChar <= 'z'){
			return true;
		}
		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar >= '0' && theChar <= '9'){
			return true;
		}


		return false;
	}	

	public int getASCII( )
	{
		int a = (int) theChar;
		return a;
	}

	public String toString()
	{
		if (isUpper()) {
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		if (isLower()) {
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n"; 
		}
		if (isNumber()) {
			return ""+getChar() + " is a digit. ASCII == " + getASCII() + "\n"; 
		}
		else {
			return ""+getChar() + " is a special character. ASCII == " + getASCII() + "\n"; 
		}
	}
}