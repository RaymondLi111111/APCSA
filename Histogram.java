package unit10;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count = new ArrayList();
	private ArrayList<Character> letters = new ArrayList();
	private char[] countedletters;
	private String fileName;

	public Histogram()
	{
	}

	public Histogram(char[] values, String fName)
	{
		for (int i = 0; i < values.length; i++){
			letters.add(values[i]);
		}
		fileName = fName;
		loadAndAnalyzeFile();
		out.println("search letters = "+letters);
		for (int i = 0; i < letters.size(); i++) {
			count.add(0);
		}
	}

	public void loadAndAnalyzeFile()
	{
		try{
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit10\\"+fileName));
		String a = file.nextLine();
		int b = Integer.parseInt(a);
		String c = "";
		for (int i = 0; i < b; i++) {
			c = c+file.nextLine();
		}
		countedletters = new char[c.length()];
		for (int i = 0; i < c.length();i++) {
			countedletters[i] = c.charAt(i);
		}
		}
		catch(Exception e)
		{
			out.println(e);
		}



	}

	public char mostFrequent()
	{
		for (int i = 0; i < count.size(); i++) {
			count.set(i, 0);
		}
		int index = -1;
		for (int i = 0; i < countedletters.length; i++) {
			index = -1;
			for (int j = 0; j < letters.size(); j++) {
				if (letters.get(j) == countedletters[i]) {
					index = j;
				}
			}
			if (index > -1) {
				count.set(index, count.get(index)+1);
			}
		}
		int maxindex = 0;
		for (int k = 0; k<count.size();k++) {
			if (count.get(k) > count.get(maxindex)) {
				maxindex = k;
			}
		}
		return letters.get(maxindex);
	}

	public char leastFrequent()
	{
		for (int i = 0; i < count.size(); i++) {
			count.set(i, 0);
		}
			int index = -1;
			for (int i = 0; i < countedletters.length; i++) {
				index = -1;
				for (int j = 0; j < letters.size(); j++) {
					if (letters.get(j) == countedletters[i]) {
						index = j;
					}
				}
				if (index > -1) {
					count.set(index, count.get(index)+1);
				}
			}
			int minindex = 0;
			for (int k = 0; k<count.size();k++) {
				if (count.get(k) < count.get(minindex)) {
					minindex = k;
				}
			}
			return letters.get(minindex);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}