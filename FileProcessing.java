import java.io.BufferedReader;
import java.io.FileReader;

public class FileProcessing 
{
	static char[] lowerCaseConstonants ={'b','c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r' , 's' , 't', 'v', 'w', 'x', 'y', 'z'};
	static char[] upperCaseConstonants= {'B','C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R' , 'S' , 'T', 'V', 'W', 'X', 'Y', 'Z'};
	
	static boolean IsConstonant (char alphabet)
	{
		int constonantSetSize = lowerCaseConstonants.length;
		for (int i=0; i< constonantSetSize; i++)
		{
			if(alphabet == lowerCaseConstonants[i] || alphabet == upperCaseConstonants[i])
				return true;
		}
			return false;
	} 
	
	static int LineCount (String fullFileName) throws Exception
	{
		FileReader fr= new FileReader (fullFileName);
		BufferedReader br= new BufferedReader (fr);
		int numberOfLines =0;
		while(br.readLine() !=null)
			numberOfLines =numberOfLines +1;
		br.close();
		return numberOfLines;
		
	}
	
	static String[] ReadFile(String fullFileName, int lineCount) throws Exception
	{
		FileReader fr=new FileReader (fullFileName);
		BufferedReader br= new BufferedReader (fr);
		String[] textData = new String[lineCount];
		for(int i=0; i<lineCount; i++)
			textData[i]= br.readLine();
		br.close();
		return textData; 
	}
	
	static int vowelCount (String line)
	{
		int numberOfVowels=0;
		int lineSize= line.length();
		for(int i=0; i<lineSize; i++)
		{
			char alphabet =line.charAt(i);
			if(alphabet == 'a'|| alphabet == 'e'|| alphabet == 'i'|| alphabet == 'o'|| alphabet == 'u'|| 
					alphabet == 'A'|| alphabet == 'E'|| alphabet == 'I'|| alphabet == 'O'|| alphabet == 'U')
				numberOfVowels =numberOfVowels +1;
		}
		return numberOfVowels;
	}
	
	static int characterCount (String line)
	{
		int numberOfCharacters=0;
		int lineSize= line.length();
		for(int i=0; i<lineSize; i++)
		{
			numberOfCharacters =numberOfCharacters +1;
		}
		return numberOfCharacters;
	}
	
	
	
	static int ConstonantCount (String word)
	{
		int numConstonant =0;
		int numAlphabets= word.length();
		for (int i=0; i< numAlphabets; i++)
			{
				char alphabet = word.charAt(i);
				if(IsConstonant(alphabet)) numConstonant =numConstonant +1;
			}
		return numConstonant;
	}
	
	
	
	static int wordCount (String line)
	{
		int numberOfWords=0;
		int lineSize= line.length();
		for(int i=0; i<lineSize; i++)
		{
			char alphabet =line.charAt(i);
			if(alphabet == ' ')
				numberOfWords =numberOfWords +1;
		}
		return numberOfWords;
	}
	
	static int sentenceCount (String line)
	{
		int numberOfSentences=0;
		int lineSize= line.length();
		for(int i=0; i<lineSize; i++)
		{
			char alphabet =line.charAt(i);
			if(alphabet == '.' || alphabet == '!' ||alphabet == '?')
				numberOfSentences =numberOfSentences +1;
		}
		return numberOfSentences;
	}
	
	static int exclamationCount (String line)
	{
		int numberOfexclamations=0;
		int lineSize= line.length();
		for(int i=0; i<lineSize; i++)
		{
			char alphabet =line.charAt(i);
			if( alphabet == '!' )
				numberOfexclamations =numberOfexclamations +1;
		}
		return numberOfexclamations;
	}
	
	
	

	public static void main(String[] args) throws Exception 
	{
		String fullFileName = "c://Temp//kingLear.txt";
		int lines = LineCount (fullFileName);
		System.out.println("Number of Lines: " + lines);
		
		String[] kingLearLines = ReadFile(fullFileName, lines);
		
		int vowels = 0;
		for (int i=0; i<lines; i++)
			vowels= vowels + vowelCount (kingLearLines[i]);
		System.out.println ("Number of Vowels: " + vowels );
		
		int words =0;
		for(int i=0; i<lines; i++)
			words= words + wordCount(kingLearLines[i]);
		System.out.println ("Number of Words: " + words);
		
		int constanents =0;
		for(int i=0; i<lines; i++)
			constanents= constanents + ConstonantCount(kingLearLines[i]);
		System.out.println ("Number of Constanents: " +  constanents);
		
		int characters =0;
		for(int i=0; i<lines; i++)
			characters= characters + characterCount(kingLearLines[i]);
		System.out.println ("Number of Characters: " +  characters);
		
		int sentences = 0;
		for(int i=0; i<lines; i++)
			sentences= sentences + sentenceCount(kingLearLines[i]);
		System.out.println ("Number of Sentences: " +  sentences);
		
		int exclamations= 0;
		for(int i=0; i<lines; i++)
			exclamations= exclamations + exclamationCount(kingLearLines[i]);
		System.out.println ("Number of Exclamations: " +  exclamations);
		
		
	}
	
	

}
