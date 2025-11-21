package week2.remainingAssignments;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] word = test.split(" ");
		for ( int i = 0; i<word.length; i++) {
			if(i%2!=0)
			{
				String reversed = "";
				for (int j = word[i].length() - 1; j >=0; j--)
				{
					reversed = reversed + word[i].charAt(j);
				}
				word[i] = reversed;
			}
		}
		for (int i =0; i< word.length; i++)
		{
			System.out.print(word[i] + " ");
		}
	}

}
