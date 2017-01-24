
public class WordProcessing 
{
	static char[] lowerCaseVowels ={'a','e','i','o','u'};
	static char[] upperCaseVowels ={'A','E','I','O','U'};
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
	
	static boolean IsSpace (char alphabet)
	{
		if (alphabet == ' ')
			return true;
		else
			return false;			
	}
	
	static boolean IsVowel2 (char alphabet)
	{
		int vowelSetSize = lowerCaseVowels.length;
		for(int i= 0; i< vowelSetSize; ++i)
		{
			if(alphabet == lowerCaseVowels[i] || alphabet == upperCaseVowels[i])
				return true;
		}
		return false;
	}
	
			
	static boolean IsVowel (char alphabet)
	{
		if (alphabet == 'a' || alphabet == 'A')
			return true;
		else if (alphabet == 'e' || alphabet == 'E')
			return true;
		else if (alphabet == 'i' || alphabet == 'I')
			return true;
		else if (alphabet == 'o' || alphabet == 'O')
			return true;
		else if (alphabet == 'u' || alphabet == 'U')
			return true;
		else if (alphabet == 'y' || alphabet == 'Y')
			return true;
		else return false;
	}
	
	static int wordCount (String word)
	{
		int numWords =1;
		int numAlphabets = word.length();
		for (int i=0; i< numAlphabets; i++)
		{
			char alphabet = word.charAt(i);
			if(IsSpace(alphabet)) numWords =numWords +1;
		}
		return numWords;
	}
	
	static int VowelCount (String word)
	{
		int numVowels =0;
		int numAlphabets = word.length();
		for (int i=0; i< numAlphabets; i++)
		{
			char alphabet = word.charAt(i);
			if(IsVowel2(alphabet)) numVowels =numVowels +1;
		}
		return numVowels;
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
	
	static boolean compareStrings (String word1, String word2)
	{
		int Size1= word1.length();
		int Size2 = word2.length();
		if (Size1 != Size2)
			return false;
		for ( int i=0; i<Size1; i++)
		{
			if (word1.charAt(i) != word2.charAt(i))
				return false;
		}
		return true;
	}
	
	/*public boolean isOdd (int n){
		if (n%2==0)
			return false;
		else return true;
	}
	*/
	
	public static void main(String[] args) 
	{
		String word = "Bill Nye the Science Guy Bill Nye the Science Guy Bill, Bill, Bill, Bill, Bill, Bill Bill Nye the Science Guy (Science rules) Bill Nye the Science Guy (Inertia is a property of matter) Bill, Bill, Bill, Bill, Bill, Bill Bill Nye the Science Guy Bill, Bill, Bill,(T-minus seven seconds) Bill, Bill, Bill, Bill, Bill, Bill, Bill, Bill Nye, the Science Guy";
		int numVowels= VowelCount(word);
		int numConstonant = ConstonantCount(word);
		int numWords = wordCount(word);
		System.out.println("numVowels= "+ numVowels);
		System.out.println("numConstonant= " + numConstonant);
		System.out.println("wordCount= " + numWords);
		

	}

}
