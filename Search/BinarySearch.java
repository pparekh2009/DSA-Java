import java.util.Arrays;

class BinarySearch {

	public static int find(int[] arr, int element) {
		int first = 0;
		int last = arr.length;
		Arrays.sort(arr);
		return find(arr, element, first, last);
	}

	private static int find(int[] arr, int element, int first, int last) {
		int mid = (int) Math.floor((first + last) / 2);

		System.out.println(Arrays.toString(arr));

		if (arr[mid] == element) {
			return mid;
		}

		if (element < arr[mid]) {
			find(arr, element, first, mid-1);
		} else {
			find(arr, element, mid+1, last);
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(find(new int[]{8, 2, 6, 9, 7, 3, 5, 1, 4}, 4));
	}
}