//Zoho Interview Round 1

package coding;

import java.util.Scanner;

public class LetterPattern {
	
	public static void letterPattern1(String word){
		int mid = word.length()/2;
		String s1="";
		int l =0;
		for(int i=mid;i<mid+word.length();i++){
			for(int j=word.length()-1;j>l;j--){
				System.out.print(" ");
			}
			s1=s1+word.charAt(i%word.length());
			System.out.print(" "+s1);
			l++;
			System.out.println();
		}
		
	}
	
		public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		letterPattern1(word);

	}

}
