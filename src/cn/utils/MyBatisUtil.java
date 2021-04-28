 package cn.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ������
 * @author Lenovo
 *
 */
public class MyBatisUtil {
	private static SqlSessionFactory factory;
	static{//�ھ�̬�����£�factoryֻ�ᱻ����һ��
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	����SqlSession����͹ر�SqlSession
	public static SqlSession createSqlSession() {
		return factory.openSession(false);//trueΪ�Զ��ύ����
	}
	public static void closeSqlSession(SqlSession sqlSession) {
		if(null != sqlSession) {
			sqlSession.close();
		}
	}
}
