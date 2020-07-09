
public class Abo {
	
	public static long rAbo(long n) {
        if (n <= 0) {
        	return 0;
        } else if (n == 1) {
        	return 1;
        } else {
            if (n%2 == 0) // even
            	return 1 + rAbo(n/2);
            else
            	return 2 +rAbo((n+1)/2);
        }
    }

	
	
	public static void main(String args[]) {
		System.out.println("Recursive:");
		for (int i = 0; i < 20; i++)
			System.out.println("Abo " + i + ": " + rAbo(i));
			
	}
}
