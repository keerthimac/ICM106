class Example {
	public static void main(String asrg[]) {
		int x;
		x= 7 % 10 / 2 * 2;
		System.out.println(x);
		x= 7 % (10 / 2) * 2;
		System.out.println(x);
		x= 7 % 10 / (2 * 2);
		System.out.println(x);
		x= 7 % (10 / (2 * 2));
		System.out.println(x);
		x= 7 % ((10 / 2) * 2);
		System.out.println(x);
	}
}
