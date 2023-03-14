package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,7,6,8};

		Arrays.sort(num);
		int len = num.length;
		for (int i = 0; i < len; i++) {
			 if (i+1!=num[i]) {
				System.out.println("Missing element in an array is :"+(i+1));
				break;
			 }
		}
	}

}
