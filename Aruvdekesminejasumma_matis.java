/* Matis Russi IT-21 */

package java_harjutused_matis;

import java.util.stream.*;

public class Aruvdekesminejasumma_matis {

	public static void main(String[] args) {
		int[] numbrid = {3,4,12,51,623,2,4,23,523,4,754};
		int sum = IntStream.of(numbrid).sum();
		int keskmine = sum/numbrid.length;
		
		System.out.println("Summa: "+sum+"\nKeskmine: "+keskmine);
	}

}
