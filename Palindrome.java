import java.util.*;
public class Main {
	 ArrayList<String> palindromes = new ArrayList<>(); 
	public void ispalindrome(String str) {
		int c=0;
	
		//int end=str.length()-1;
		int start=0;
		char ch[]= str.toCharArray();
		int end=ch.length-1;
		//ArrayList<String> palindromes = new ArrayList<>();
//		for(int i=0;i<ch.length;i++) {
			while(start<ch.length && end>=0){
			if(ch[start]==ch[end])	{
			c++;
			}
		   start++;
		   end--;
			}
		if(c ==ch.length) {
			addpalindromes(str);
		}
	}
	public void addpalindromes( String str){
	   
	    palindromes.add(str);
	   // for(String palindrome:palindromes)
	   // System.out.println(palindrome);
	   
	}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s =sc.next();
		Main m = new Main();
		String subs = new String();
		
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++){
				if(j>i) {
				subs=s.substring(i,j);
				//System.out.println(subs);
				m.ispalindrome(subs);
				}
			}
		}
				String lar = new String();
			int max=m.palindromes.get(0).length();
			for(int k=1;k<m.palindromes.size();k++){
			    if(m.palindromes.get(k).length()>max){
			    max=m.palindromes.get(k).length();
			    lar=m.palindromes.get(k);
			        
			    }
			    
	}
	System.out.println(lar);
}
}