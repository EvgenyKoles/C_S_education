//import student.Student;

import java.util.Collections;
import java.util.PriorityQueue;

public class TestStudent {

	public static void main(String[] args) {


		// PhDStudent s = new PhDStudent();
		// s.displayDetails();
		 PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Existing heap elements
        int[] heapElements = {15, 13, 9, 5, 12, 8, 7, 4, 0, 6, 2, 1};
        
        // Add elements to the max-heap
        for (int element : heapElements) {
            maxHeap.add(element);
        }

        // Perform the MAX-HEAP-INSERT operation to insert element '10'
       // maxHeap.add(10);

		for (int element : maxHeap) {
            System.out.print(element + " ");
        }
	}
}
