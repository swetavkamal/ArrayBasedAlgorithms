package StringOperations;

import java.util.ArrayList;

public class LongestCommonSubstring {

	
	public static ArrayList<String> FindSubSequence(String S1, String S2)
	{
		Integer[][] match = new Integer[S1.length()][S2.length()];
		
		int len1=S1.length();
		int len2= S2.length();
		int max=Integer.MIN_VALUE;
		
		ArrayList<String> sol=null;
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2;j++)
			{
				if(S1.charAt(i)==S2.charAt(j))
				{
					if( i==0 || j==0 )
						match[i][j]=0;
					else
					{
						match[i][j]=(match[i-1][j-1]+1);
					}
					
					if(match[i][j]>max)
					{
						sol= new ArrayList<String>();
						max=match[i][j];
						sol.add(S1.substring(i-max,i+1));
					}
					else if(match[i][j]== max)
					{
						sol.add(S1.substring(i-max,i+1));
					}
				}
				else
					match[i][j]=0;
			}
			
			
		}
		return sol;
		
		
	}
	
	
	
	public static void main(String args[])
	{
		String S1= "caba";
		String S2="abac";
		
		LongestCommonSubstring obj = new LongestCommonSubstring();
		ArrayList<String> result= obj.FindSubSequence(S1, S2);
		
		System.out.println(result.toString());
	}
}
