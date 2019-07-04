package regex;


	import java.io.Console;
	import java.io.PrintStream;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class bckup {
	    public static void main(String[] args) {
	        Console console = System.console();
	        if (console == null) {
	            System.err.println("No console.");
	            System.exit(1);
	        }
	        do {
	            Pattern pattern = Pattern.compile(console.readLine("%nEnter your regex: ", new Object[0]));
	            Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: ", new Object[0]));
	            boolean found = false;
	            while (matcher.find()) {
	                console.format("I found the text \"%s\" starting at index %d and ending at index %d.%n", matcher.group(), matcher.start(), matcher.end());
	                found = true;
	            }
	            if (found) continue;
	            console.format("No match found.%n", new Object[0]);
	        } while (true);
	    }
	
}
