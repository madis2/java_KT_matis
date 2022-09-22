/* Matis Russi IT-21 */

package java_harjutused_matis;

public class Tagurpidinelause_matis {

	 public static void main(String[] args){
	        String str = "Palun lopetage minu piinad, aitah!";
	        String rev = tagurpidi(str);
	        System.out.println(rev);
	  }

	    public static String tagurpidi(String s) {
	    int x = s.indexOf(" ");
	    
	    if(x == -1)
	      return s;
	      
	    return tagurpidi(s.substring(x+1)) +" "+ s.substring(0, x);
	     }
}
