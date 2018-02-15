package unit6;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(420);

	}

	public Prime(int num)
	{
		setPrime(num);

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
			}
		}
		if (number == 1) {
			prime = false;
		}
		return prime;
		
	}

	public String toString()
	{
		String output="";
		if (isPrime()) {
			output = number + " is prime.";
		}
		else {
			output = number + " is not prime.";
		}
		return output;
	}
}