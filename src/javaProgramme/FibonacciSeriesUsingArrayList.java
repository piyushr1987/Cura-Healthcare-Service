package javaProgramme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeriesUsingArrayList {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> fibo_data = new ArrayList<Integer>();
		int a = 0;
		int b = 1;
		int c = 0;
		fibo_data.add(a);
		fibo_data.add(b);

		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			fibo_data.add(c);
		}
		System.out.println(fibo_data);
		sc.close();

	}

}
