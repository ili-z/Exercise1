package cn.test;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import cn.dao.Product_Category_Dao;
import cn.dao.ProductionDao;
import cn.pojo.EasybuyProduct;
import cn.pojo.EasybuyProductCategory;
import cn.utils.Pager;

public class MyTest {

	private static final String String = null;

	public SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource="mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	//num++  和   ++num
	@Test
	public void test06() throws Exception{
		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = num++;
		}
		System.out.println(num);
	}

	@Test
	public void test55() throws Exception{
		
	}
	
	@Test
	public void test33() throws Exception{
//		Cat cat1 = new Cat("哈哈");
//		Cat cat2 = new Cat("哈哈");
//		System.out.println("cat1:"+cat1.hashCode()+"\ncat2:"+cat2.hashCode());
//		System.out.println(cat1==cat2);
//		System.out.println(cat1.equals(cat2));
		
		String a = "爸爸你是我";
		char[] c = new char[a.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = a.charAt(i);
			if(i == c.length-1) {
				for (int j = c.length-1; j >= 0; j--) {
					System.out.print(c[j]);
				}
			}
		}
		
		/*
		 * public boolean equals(Object obj) { return (this == obj); }
		 */
		/*
		 * public boolean equals(Object anObject) { if (this == anObject) { return true;
		 * } if (anObject instanceof String) { String anotherString = (String)anObject;
		 * int n = value.length; if (n == anotherString.value.length) { char v1[] =
		 * value; char v2[] = anotherString.value; int i = 0; while (n-- != 0) { if
		 * (v1[i] != v2[i]) return false; i++; } return true; } } return false; }
		 */
	}
	//反转字符串
	@Test
	public void test19() {
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("abcdef");
		System.out.println(strbuf.reverse());//fedcba
	}
	//两个对象的hashCode()相等，那.equals()相不相等？
	//答：不相等
	@Test
	public void test18() {
		String str1 = "通话";
		String str2 = "重地";
//		String str1 = new String("通话");
//		String str2 = new String("重地");
		System.out.println(String.format("str1：%d | str2：%d",  str1.hashCode(),str2.hashCode()));
		System.out.println(str1.equals(str2));
	}
	
	//i的值
	@Test
	public void test44() throws Exception{
		int i = 1;
		i = i++;
		int j = i++;
		int k = i + ++i * i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);

	}
	
	//排序
	@Test
	public void test07() throws Exception{
		
		  int[] num = {5,1,8,3,2,9}; 
		  
		  for (int i = 0; i < num.length-1;i++) { 
			  for (int j = 0; j < num.length-i-1; j++) { 
				  if (num[j] > num[j+1]) {
					  int temp = num[j]; num[j] = num[j+1]; num[j+1] = temp; }
				  } 
			  } 
		  for (int i = 0; i < num.length; i++) {
			  System.out.print(num[i]+"\t");
		  }
		
	}

	@Test
	public void test08() throws Exception{
		boolean b0 = new String() instanceof Object;//true
		boolean b1 = new String() instanceof String;//true 一个对象当然是他的实例了
//		boolean b2 = 'A' instanceof Character;
//		boolean b3 = new Date() instanceof String;
		boolean b4 = new Object() instanceof String;//false
		boolean b5 = null instanceof String;//false   instanceo特有的规则:若左操作数为null,结果就直接返回false,不再运算右操作数是什么类。
		boolean b6 = (String)null instanceof String;//false
		System.out.println(b0);
		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
		
		
	
	//享元模式
	@Test
	public void test01() throws Exception{
		Integer a = 127;
		Integer b = 127;
		System.out.println(a == b);
		System.out.println(a.equals(b));

		String sa = new String();
		
		Integer e = 128;
		Integer f = 128;
		System.out.println(e == f);
		System.out.println(e.equals(f));
	}

	@Test
	public void test02() throws Exception{
		double d1 = 0.999999999;
		double d2 = 1;
		double d3 = Math.abs(d2-d1);
		System.out.println(d3);
		System.out.println(Math.abs(d1));
		if(d3 < 1e-6) {
			System.out.println("相等");
		} else {
			System.out.println("不相等");
		}
	}

	@Test
	public void test03() throws Exception{
		/*
		 * Integer a = 10; Integer b = 10;
		 * 
		 * Integer a1 = 128; Integer b1 = 128;
		 * 
		 * System.out.println(a==b);//true System.out.println(a1==b1);//false
		 */		

		String a2 = new String("我是H");
		String b2 = new String("我是H");
		System.out.println(a2==b2);
		System.out.println(a2.equals(b2));
		
	}

	//电话号码
	@Test
	public void test04() throws Exception{
		int[] figure = {8,5,1,7};
		int[] index = {2,0,1,1,1,0,0,2,0,3,2};
		String phone = "";
		for (int i = 0; i < index.length; i++) {
			phone += figure[index[i]];
		}
		System.out.print(phone);
	}

	@Test
	public void test05() throws Exception{
		//		List<Object> list = new ArrayList<Object>();
		//		list.add("AA");list.add("BB");list.add("CC");
		//		String a ="BB";
		//		System.out.println(a.hashCode());

		String[] n=new String[] {"1","2","3","4","5"};
		String i = "1";
		System.out.println(i.hashCode());

		HashMap<String, Object> hash = new HashMap<String, Object>();
	}
}
