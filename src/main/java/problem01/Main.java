package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		int max = 0;
		int maxIndex1 = 0, maxIndex2 = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]*arr[j] > max) {
					max = arr[i]*arr[j];
					maxIndex1 = i;
					maxIndex2 = j;
				}
			}
		}
		
		System.out.println("["+arr[maxIndex2]+","+arr[maxIndex1]+"]");
		
	}
}
