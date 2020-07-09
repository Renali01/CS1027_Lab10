import java.util.Scanner; // import scanner class

public class Permutations {
	public static void main(String[] args) throws Exception{
		System.out.print("Enter a string : "); 
		Scanner keyboard = new Scanner(System. in); //create scanner object
		String suffix = keyboard. nextLine();
		String prefix = "";
		permutations(prefix, suffix);
	
		}
	
	public static void permutations(String prefix, String suffix) {
		if (suffix.length() == 0) {
			System.out.println(prefix);
		}
		else {
			for (int i = 0 ; i < suffix.length(); i++) {
				char c = suffix.charAt(i);
				String suff = removeChar(suffix,i);
				String pre = prefix + c;
				permutations(pre, suff);
			}
		}
		
	}
	private static String removeChar(String s, int i) {
		   return s.substring(0,i) + s.substring(i+1,s.length());
		}
}
