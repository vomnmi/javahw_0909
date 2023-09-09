public class Bubble {
	public static void main(String args[]) {
		int arr[] = {8, 8, 4, 0, 0, 2, -5, 1, 24};
		boolean swapped = false;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
			if(arr[j-1] > arr[j]) {
				int tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
				swapped = true;
			}
		}
		if(!swapped) {
			break;
		}
		swapped = false;
	}

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}