
package StringOperations;

/** 
 * The Below class will find the maximum length palindorme..
 * 
 * We will use Dynamic programming to solve this.
 * 
 * create a 2D boolean array with the length equal to the string
 * Now First of all all the one characters are palindrome in itself.. So put all table[i][i]= true
 * 
 * Now try to check all the two letter palindromes.. 
 * Start a loop and check if string.charat[i]==string.charat[i+1]..If yes, put table[i][i+1]=true
 * Also need to put our start there so that we could later retrieve the  string and max length as 2
 * 
 * Now we need to check 3 and more than 3 character palindrome as such
 * 
 * Start a loop starting from 3 till end
 * In first loop we have to go till 0,1,2 character that means j=i+k-1 that is, 0+3-1=2 for second loop it will be from 
 * 1,2,3 so j=1+3-1=3
 * And in this loop we have to check whether the first and last characters are equal 
 * i.e str.charAt(i)==str.charAt(j) 
 * This will give all the three charcter palindrome string
 * 
 * Now when K increases to 4 from the loop..
 * We will be comparing 4 characters at a time..
 * In such a case, j=i+k-1=0+4-1=3 and 1+4-1=4 ..0,1,2,3 and 1,2,3,4
 * Check for first and last character str.charAt(i)==str.charAt(j) at the same time
 * table[i+1][j-1]=true means mid part of it palindrome..
 * 
 * If both are true.. set start=i as there and max length=k
 * 
 * 
 * @author swetavk
 *
 */



public class FindLongestPalindrome {

	public static String test="babad";
	
	public void longestPalindrome(String str)
	{
		int str_length=str.length();
		boolean[][] table = new boolean[str_length][str_length];
		
		
		int max_length=1;
		
		
		//For the diagonal element of the the TwoDArray..
		for(int i=0;i<str_length;i++)
		{
			table[i][i]=true;
		}
		
		
		int start=0;
		for(int i=0;i<str_length-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				table[i][i+1]=true;
				start=i;
				max_length=2;
			}
		}
		
		for(int k=3;k<=str_length;k++)
		{
			for(int i=0;i<str_length-k+1;i++)
			{
				int j=i+k-1;
				
				if(table[i+1][j-1] && str.charAt(i)==str.charAt(j))
				{
					table[i][j]=true;
					
					if(k>max_length)
					{
						start=i;
						max_length=k;
					}
				}
			}
		}
		
		System.out.print("Longest palindrome substring is; "); 
        printSubStr(str, start, start + max_length - 1); 
		
		
		
	}
	
	static void printSubStr(String str, int low, int high) { 
        System.out.println(str.substring(low, high + 1)); 
    } 
	public static void main(String args[])
	{
		FindLongestPalindrome obj = new FindLongestPalindrome();
		obj.longestPalindrome("forgeeksskeegfor");
		
	}
	
}
