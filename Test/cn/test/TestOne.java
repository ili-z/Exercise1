package cn.test;

import org.junit.Test;

public class TestOne {
	@Test
	public void test01() {
		Thread thread = new Thread();
		System.out.println(thread.getClass());
	}
}
