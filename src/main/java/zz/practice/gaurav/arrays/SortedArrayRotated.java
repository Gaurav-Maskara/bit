package zz.practice.gaurav.arrays;

public class SortedArrayRotated {

	public static void main(String[] args) {

//	    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//		int foundAt = binarySearchRecursively(arr, 19, high - 1, low);
//		System.out.println(foundAt);

//		int[] arr = { 11, 12, 15, 18, 19, 2, 5, 6, 8 };
//		int low = 0;
//		int high = arr.length;
//		int sortedArrayRotatedBy = findSortedArrayRotation(arr, high-1, low);
//		System.out.println("sortedArrayRotatedBy ---> "+ sortedArrayRotatedBy);
		
		
		
		
		
		
		
	}
	
	

	public static int findSortedArrayRotation(int[] arr, int high, int low) {

		int foundAtIndex = -1;

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		int next = (mid + 1) % high;
		int prev = (mid + high - 1) % high;

		if (arr[mid] <= arr[prev] && arr[mid] < arr[next]) {
			foundAtIndex = mid;
		} else if (arr[mid] <= arr[high]) {
			return findSortedArrayRotation(arr, mid - 1, low);
		}else if(arr[mid] >= arr[high]) {
			return findSortedArrayRotation(arr, high, mid+1);
		}

		return foundAtIndex;
	}

	
	
	
	public static int binarySearchRecursively(int[] arr, int valueToFind, int high, int low) {

		int foundAtIndex = -1;
		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (valueToFind == arr[mid]) {
			foundAtIndex = mid;
		} else if (valueToFind < arr[mid]) {
			return binarySearchRecursively(arr, valueToFind, mid - 1, low);
		} else if (valueToFind > arr[mid]) {
			return binarySearchRecursively(arr, valueToFind, high, mid + 1);
		}

		return foundAtIndex;
	}
	
	
	
	public int searchElementInACircularlySortedArray() {
		
		return 0;
	}
	
	
	
	

}
