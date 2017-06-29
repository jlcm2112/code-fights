/* "Given an array of integers, find the pair of adjacent elements that has the largest product and return that product." */
public class adjacentElementsProduct {

	int adjacentElementsProduct(int[] inputArray) {
		int largest = inputArray[0] * inputArray[1];
		     
		        for (int j=0; j<inputArray.length -1; j++) {
		            if (inputArray[j] * inputArray[j+1] > largest) {
		                largest = inputArray[j] * inputArray[j+1];
		            }
		        }
		    
		    return largest;
		}

}
