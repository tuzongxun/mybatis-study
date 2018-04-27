package study.tuzongxun.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import study.tuzongxun.mapper.UserMapper;
import study.tuzongxun.model.UserModel;

/**
 * 不适用spring
 * 
 * @author 涂宗勋
 * @date 2018年4月26日
 */
public class MybatisTest {

	public static void main(String[] args) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession(true);

			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<UserModel> list = userMapper.findUsers();
			for (UserModel user : list) {
				System.out.println(user);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}

}
