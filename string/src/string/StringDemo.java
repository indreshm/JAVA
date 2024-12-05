package string;
import java.util.Scanner;
public class StringDemo {
	
	public static void printSubstrings(String str) {
		for(int start = 0;start<str.length();start++) {
			for(int end = start;end<str.length();end++) {
				System.out.println(str.substring(start, end+1));
			}
		}
	}
	
	public static void printChars(String str) {
		for(int i =0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static String reverseString(String str) {
		String reverseString = "";
//		for(int i = str.length()-1;i>=0;i--) {
//			reverseString+=str.charAt(i);
//		}
		//or
		for(int i = 0 ; i<str.length(); i++) {
			reverseString = str.charAt(i) + reverseString;
		}
		
		
		return reverseString;
	}
	
	
	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordStart = 0;
		for(int i =0;i<str.length();i++) {
			//reverse the current token from string
			if(str.charAt(i)==' ') {
				int currentWordEnd = i-1;
				String reverseWord="";
				for(int j = currentWordStart;i<=currentWordEnd;j++) {
					reverseWord = str.charAt(j) + reverseWord ; 
				}
				
				//Add to the string ans
				ans+=reverseWord+" ";
				currentWordStart=i+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String str1 = "Coding ";
//        System.out.println(str1.length());
//        System.out.println(str1.charAt(2));
//        String str = "";
//        String st = " ";
//        System.out.println(str.length());
//        System.out.println(st.length());
//        String str2 = "is fun";
//        
//        System.out.println(str1+str2);   //concatenation Or
//        String str3 = str1.concat(str2);
//        System.out.println(str3);
//        
//        System.out.println(str1.equals(str2));
//        
//        System.out.println(str1.compareTo(str2));
//        
//        System.out.println(str1.contains("ing"));
//        
//        System.out.println(str1.substring(2));
//        System.out.println(str1.substring(1,5));
//        System.out.println(str1.substring(1,6));
//        System.out.println(str1.substring(5));
//        
//        Scanner s = new Scanner(System.in);
//        String str4 = s.next();
//        
//        System.out.println(str4);
//        
//        String str5 = s.nextLine();
//        System.out.println(str5+" "+str5.length());
//        
//        printChars(str5);
//        System.out.println(reverseString(str5));
//        
//        
		
//		String s = "abc def ghi";
//		System.out.println(reverseEachWord(s));
		
//		String str = "pqrs";
//		printSubstrings(str);
		
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0, 'd');
		str.append("def");
		System.out.println(str+" "+str.length());
        
       
	}

}
