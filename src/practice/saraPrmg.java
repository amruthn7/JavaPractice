package practice;

import java.util.LinkedHashSet;

public class saraPrmg {

	public static void main(String[] args) {
		String str = "aaabbbccc"; //a3b3c3
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if(ch==str.charAt(i)) {
					count++;
				}
			}
			System.out.print(ch+""+count);

		}
	}

}
