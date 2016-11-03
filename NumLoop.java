
/**
 * 
 * Luis Cervantes <br>
 * 11/3/16<br>
 * This program runs various types of Loops including For, Do while.. and a diamond.
 *
 */

public class NumLoop {
	public static void main(String args[] ){
		
		int i;
		
		for(i=1;i<=100;i++){
			
		if(i%2!=0)
		{
			
		System.out.print(i + "  " );
			}
		}
		
		
		System.out.println("\n");
		
		
		int e = 2;
		
		while (e <= 100) {
		  System.out.print(e + "  ");
		  e += 2;
		}
		
		
		System.out.println("\n");
		
		
		int d = 0;
		
		while (d < 1 ) {
			System.out.println("  *" + "\n");
			d++; 
		}
		while ( d < 2 ) {
			System.out.println(" ***"+ "\n");
			d++;
		}
		while ( d == 2 ) {
			System.out.println("*****"+ "\n");
			d--;
		}
		while ( d == 1 ) {
			System.out.println(" ***"+ "\n");
			d--;
		}
		while ( d == 0 ) {
			System.out.println("  *");
			d--;
		}				
	}
}
