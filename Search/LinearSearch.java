class LinearSearch {
	
	/**
	 * Linear search is simplest search algorithm.
	 * Compares each item in the array to find for the given element.
	 * Time Complexity = O(n)
	 * @author Priyansh Parekh
	*/
	
	public int find(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (element == array[i]) {
				return i;
			}
		}
		return -1;
	}

}