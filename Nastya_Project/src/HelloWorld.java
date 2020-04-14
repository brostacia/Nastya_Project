//вывести элементы массива в обратном порядке

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] a = {5, 10, 12, 30, 45, 67, 89, 100};
		int temp;
		for(int i = 0;i < a.length / 2;i++) {
			temp = a[a.length-i-1];
			a[a.length-i-1] = a[i];
			a[i] = temp;
	    }
		System.out.println(Arrays.toString(a));
	}
}	
