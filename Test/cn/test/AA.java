package cn.test;

public class AA extends SSSS{
	private int i = test();
	private static int j = method();
	
	static {
		System.out.println("6");
	}
	AA() {
		System.out.println("7");
	}
	{
		System.out.println("8");
	}
	public int test() {
		System.out.println("9");
		return 1;
	}
	public static int method() {
		System.out.println("10");
		return 1;
	}
	
	public static void main(String[] args) {
		AA a1 =new AA();
		System.out.println();
		AA a2 =new AA();
	}
}
