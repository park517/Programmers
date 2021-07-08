package practice;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		String a = "Good+evning";
		String b = "Bad+Morning";
		int index1 = a.indexOf("+");
		int index2 = b.indexOf("+");
		String c = a.substring(0, index1)+b.substring(index2,b.length());
		System.out.println(c);
		int temp = 0;
		int[] num = {0,3,2,1,6,7,8};
		for(int i = 0 ; i< num.length-1 ; i++) {
			for(int j=i+1 ; j< num.length ; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int i : num) {
			System.out.print(i+" ");
		}
		Arrays.sort(num);
		System.out.println();
		for(int i : num) {
			System.out.print(i+" ");
		}
	}

}
