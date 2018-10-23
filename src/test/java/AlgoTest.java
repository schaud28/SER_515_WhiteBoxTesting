package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	
	public boolean isArraySorted(Item[] a) {
		boolean flag = false;
		
		if(a.length == 0) {
			return true;
		}
		
		int j =0;
		for(int i =0; i< (a.length-1); i++) {
			j =i+1;
			if(a[i].key <= a[j].key) {
				flag = true;
			//	return flag;
			}
			else {
				flag = false;
			}
			
		}
		return flag;
	}
	
	SortDemoData testData = new SortDemoData();
	SortDemoData qctestData = new SortDemoData();

	// CONDITION COVERAGE AND NODE COVERAGE
	@Test
	public void normalBubbleSortTest() {
		
		testData.initializeArray("40 50 25 12 34 26 7");

		SortAlgos.bubbleSort(testData.myArray);
      
		assertTrue("Array which is sent to bubble sort algo must be sorted!", isArraySorted(testData.myArray));

	}
	
	// CONDITION COVERAGE AND NODE COVERAGE
	@Test
	public void normalMergeSortTest() {
	

		testData.initializeArray("40 50 25 12 34 26 7");
		
		SortAlgos.mergeSort(testData.myArray);

		assertTrue("Array which is sent to merge sort algo must be sorted!", isArraySorted(testData.myArray));
	}

	// CONDITION COVERAGE AND NODE COVERAGE
	@Test
	public void normalHeapSortTest() {
	    testData.initializeArray("40 50 25 12 34 26 7");
		
		SortAlgos.heapSort(testData.myArray);

		assertTrue("Array which is sent to heap sort algo must be sorted!", isArraySorted(testData.myArray));

	}
	// CONDITION COVERAGE AND NODE COVERAGE
	@Test
	public void normalInsertionSortTest() {
	

        testData.initializeArray("40 50 25 12 34 26 7");
		
		SortAlgos.insertionSort(testData.myArray);

		assertTrue("Array which is sent to insertion  sort algo must be sorted!", isArraySorted(testData.myArray));

	}
	
	// CONDITION COVERAGE AND NODE COVERAGE
    @Test
	public void normalQuickSortTest() {
	    
		testData.initializeArray("40 50 25 12 34 26 7");
		
		SortAlgos.quickSort(testData.myArray);

		assertTrue("Array which is sent to quick sort algo must be sorted!", isArraySorted(testData.myArray));
	}

     // CONDITION COVERAGE AND NODE COVERAGE
	@Test
	public void normalSelectionSortTest() {

        testData.initializeArray("40 50 25 12 34 26 7");
		
		SortAlgos.selectionSort(testData.myArray);

		assertTrue("Array which is sent to selection sort algo must be sorted!", isArraySorted(testData.myArray));

	}		
	
	
	// CONDITION COVERAGE AND NODE COVERAGE
	@Test
	public void TestingForArrayWith2Objects() {

         qctestData.initializeArray("50 40");
		
		SortAlgos.quickSort(qctestData.myArray);

		assertTrue("Array with only two objects sent to Quick sort algo must be sorted!", isArraySorted(qctestData.myArray));

	}	
	
	
	// EDGE COVERAGE CASES ARE WRITTEN BELOW (Covers null checks)
	@Test (expected=java.lang.NullPointerException.class)
	public void TestingForArrayWithNoObjectsInQuicksort() {		
		SortAlgos.quickSort(null);
	}	
	
	@Test (expected=java.lang.NullPointerException.class)
	public void TestingForArrayWithNoObjectsInHeapsort() {		
		SortAlgos.heapSort(null);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void TestingForArrayWithNoObjectsInSelectionsort() {		
		SortAlgos.selectionSort(null);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void TestingForArrayWithNoObjectsInInsertionsort() {		
		SortAlgos.insertionSort(null);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void TestingForArrayWithNoObjectsInMergesort() {		
		SortAlgos.mergeSort(null);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void TestingForArrayWithNoObjectsInBubblesort() {		
		SortAlgos.bubbleSort(null);
	}	

}
