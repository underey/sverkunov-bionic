package homework2;

import java.util.Arrays;

public class Runner {
	static int number = 77;// desired number

	public static void main(String[] args) {
		int[] mass = new int[20];// create array for 20 elements

		System.out.println("Unsorted array: ");
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int) (Math.random() * 100);
			System.out.print(mass[i] + " ");
		}

		System.out.println();
		
		Arrays.sort(mass);
		System.out.println("Sorted array: ");

		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}

		System.out.println();

		BinarySearch bs = new BinarySearch(mass);
		int result = bs.find(number);

		if (result == number) {
			System.out.println("Number " + number + " was found out in array");
		} else {
			System.out.println("Number " + number + " doesen't appear in array");
		}
	}
}
