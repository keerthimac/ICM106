import java.util.*;

class Example {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i++);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(++i);
		}
		System.out.println();

		int j = 0;
		while (j < 10) {
			System.out.print(j);
			j++;
		}
		System.out.println();

		int k = 0;
		while (k < 10) {
			System.out.print(k++);
		}
		System.out.println();

		int m = 0;
		while (m < 10) {
			System.out.print(++m);
		}
		System.out.println();

		int n = 0;
		while (n++ < 10) {
			System.out.print(n);
		}
		System.out.println();

		int p = 0;
		while (++p < 10) {
			System.out.print(p);
		}
		System.out.println();

		int q = 0;
		do {
			System.out.print(q++);
		} while (q < 10);
		System.out.println();

		int s = 0;
		do {
			System.out.print(++s);
		} while (s < 10);
		System.out.println();

		int t = 0;
		do {
			System.out.print(t);
		} while (t++ < 10);
		System.out.println();

		int u = 0;
		do {
			System.out.print(u);
		} while (++u < 10);
		System.out.println();
	}
}
