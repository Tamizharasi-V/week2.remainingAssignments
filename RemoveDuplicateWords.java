package week2.remainingAssignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] eachWord = text.split(" ");
		
		for ( int i = 0; i< eachWord.length; i++)
		{
			for ( int j= i+1; j<eachWord.length; j++)
			{
				if (eachWord[i].equalsIgnoreCase(eachWord[j]))
				{
					eachWord[j]="";
					count++;
				}
			}
			
		}
		if(count>=1)
			for( String v : eachWord) {
				System.out.print(v + " ");
			}
	}

}
