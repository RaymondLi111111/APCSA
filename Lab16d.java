package unit10;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab16d
{
	public static void main( String args[] )
	{
		String madLibFile = System.getProperty("user.dir")+"src\\unit10\\story.dat";/*\\madlib.dat";
		String nounFile = System.getProperty("user.dir")+"src\\unit10\\madlib.dat";
		String verbFile = System.getProperty("user.dir")+"src\\unit10\\madlib.dat";
		String adjectiveFile = System.getProperty("user.dir")+"src\\unit10\\madlib.dat";*/
		MadLib adam = new MadLib(madLibFile);
		System.out.println(adam);
		
		
		out.println("\n");
	}
}