package yoPackage;

public class AnagramString {

	public static void main(String[] args) {
		
		String a = "aab";
		String b = "aba";
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char c : a.toCharArray())
		{
			int index = (int) c;
			al[index]++;
		}
		for(char c : b.toCharArray())
		{
			int index = (int) c;
			al[index]--;
		}
		for(int i=0;i<al.length;i++)
		{
			if(al[i]!=0)
			{
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram)
		{
			System.out.println("These strings are Anagram");
		}
		else
			System.out.println("These Strings are not Anagram");
	}

}
