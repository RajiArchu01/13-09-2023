package org.data;

public class AverageInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=  new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		float avg = 0;
		for(int array:a) {
			sum = sum + array;
		}
		avg = sum/(a.length);
		System.out.println("sum = "+ sum);

		System.out.println("average = "+ avg);
	}

}
