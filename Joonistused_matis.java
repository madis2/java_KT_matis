/* Matis Russi IT-21 */

package java_harjutused_matis;

public class Joonistused_matis {

	public static void main(String[] args) {
		
		for (int i= 0; i<= 3-1 ; i++)
        {
            for (int j=0; j<=i; j++) { System.out.print("*"+ " "); } System.out.println(""); } for (int i=3-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int i= 5-1; i>=0 ; i--){
        	for (int j=0; j<=i; j++){
        		System.out.print("*");
        		}
        	System.out.println(" ");
            }
        
        System.out.println();
        
        for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}	
        
        System.out.println();
        
        for (int i= 5-1; i>=0 ; i--){
        	for (int j=0; j<=i; j++){
        		System.out.print("*");
        		}
        	System.out.println(" ");
            }
        
        for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}	
        
	}

}
