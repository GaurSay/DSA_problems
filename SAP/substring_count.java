package SAP;

public class substring_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "aabaa"; 
		boolean b1=true;
		boolean b2=false,b3=true;
		if(b1 & b2 | b2 & b3 | b2 | b1)
		{
			System.out.println("helo");
		}
		System.out.println(CountPS(str, str.length()));

	}
	public static int CountPS(String str, int n) 
	{ 
	int dp[][] = new int[n][n]; 
	
	// P[i][j] = true if substring str[i..j] is palindrome, 
	// else false 
	boolean P[][] = new boolean[n][n]; 

	// palindrome of single length 
	for (int i= 0; i< n; i++) 
		P[i][i] = true; 

	// palindrome of length 2 
	for (int i=0; i<n-1; i++) 
	{ 
		if (str.charAt(i) == str.charAt(i+1)) 
		{ 
			P[i][i+1] = true; 
			dp[i][i+1] = 1 ; 
		} 
	} 
	for (int gap=1 ; gap<n; gap++) 
	{ 
		// Pick starting point for current gap 
		for (int i=0; i<n-gap; i++) 
		{ 
			// Set ending point 
			int j = gap + i; 

			// If current string is palindrome 
			if (str.charAt(i) == str.charAt(j) && P[i+1][j-1] ) 
				P[i][j] = true; 

			if (P[i][j] == true) 
				dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1 - dp[i+1][j-1]; 
			else
				dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1]; 
		}
	}
	return dp[0][n-1]; 
	}


}
