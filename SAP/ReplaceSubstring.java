package SAP;

public class ReplaceSubstring {
///Replace two substrings (of a string) with each other
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "aab"; 
        String A = "aa"; 
        String B = "bb"; 
  
        System.out.println(updateString(S, A, B)); 
	}
	
	 public static String updateString(String S, String A, String B)
	 {
		 int l=A.length();
		 for(int i=0;i+l<=S.length();i++)
		 {
			 String curr=S.substring(i,i+l);
			 if(curr.equals(A))
			 {
				 String newString=S.substring(0,i)+B+S.substring(i+l,S.length());
				 S=newString;
				 i=i+l-1;
			 }
			 else
			 {
				 String newString=S.substring(0,i)+A+S.substring(i+l,S.length());
				 S=newString;
				 i=i+l-1;
			 }
		 }
		 return S;
	 }

}
