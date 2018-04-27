package study.tuzongxun.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import study.tuzongxun.model.UserModel;

/**
 * 单纯jdbc操作数据库
 * 
 * @author 涂宗勋
 * @date 2018年4月26日
 */
public class JDBCTest {

	public static void main(String[] args) {
		try {
			// 1、加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2、获取连接
			String url = "jdbc:mysql://localhost:3306/test";
			String username = "tuzongxun";
			String password = "123456";
			Connection connection = DriverManager.getConnection(url, username, password);
			// 3、创建statement
			Statement statement = connection.createStatement();
			// 4、执行sql
			String sql = "select * from user";
			ResultSet resultSet = statement.executeQuery(sql);
			// 5、处理结果
			while (resultSet.next()) {
				UserModel user = new UserModel();
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("name"));
				user.setAge(resultSet.getInt("age"));
				user.setRole(resultSet.getInt("role"));
				System.out.println(user);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
