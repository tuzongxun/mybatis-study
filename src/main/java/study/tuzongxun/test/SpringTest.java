package study.tuzongxun.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.tuzongxun.mapper.UserMapper;
import study.tuzongxun.model.UserModel;

/**
 * 测试
 * 
 * @author 涂宗勋
 * @date 2018年4月25日
 */
public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		List<UserModel> list = userMapper.findUsers();
		for (UserModel user : list) {
			System.out.println(user);
		}

	}

}
