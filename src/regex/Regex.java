package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the Regular Expression ..");
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		Pattern pattern = Pattern.compile(input);
		System.out.println("Enter the Text..");
		input =sc.nextLine();
		
		
		Matcher matcher = pattern.matcher(input);
		if(matcher.find()) {
		
			System.out.println(" matching");
		
		}else {
			System.out.println(" Not a match, enter again .. ");
			input =sc.nextLine();
		}
//		while(matcher.find()) {
//		}

	}

}
