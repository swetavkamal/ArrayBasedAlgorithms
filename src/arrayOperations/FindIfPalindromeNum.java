package arrayOperations;

/**
 * Find whether the given number is a palindrome number
 * 
 * TO check whether it is a palindrome number.. we will convert the array to char array
 * Then we will take two pointers one at start and other at end
 * We will move both the pointer till start<end
 * if element at both the pointer keep on matching and there is no point where they mismatch, it is 
 * a palindrome and if they mismatch at any point it is not a palindrome..
 * @author swetavk
 *
 */



public class FindIfPalindromeNum {
	
	public static boolean FindPalindrome(int N)
	{
		
		String N1= Integer.toString(N);
		char[] t= N1.toCharArray();
		int s=0;
		int e= N1.length()-1;
		for(int i=0;i<t.length;i++)
		{
			while(s<e)
			{
				if(t[s] != t[e])
					return false;
				s++;
				e--;
			}
			
			
		}
		return true;
	}
	
	public static void main(String args[])
	{
		int input=11021;
		if(new FindIfPalindromeNum().FindPalindrome(input) == true)
		System.out.println("It is a palindrome number");
		else
			System.out.println("it's not a palindrome");
		
	
	}

}
