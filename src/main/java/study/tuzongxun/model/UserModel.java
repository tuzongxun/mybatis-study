package study.tuzongxun.model;

/**
 * 用户实体类
 * 
 * @author 涂宗勋
 * @date 2018年4月25日
 */
public class UserModel {
	private int id;

	private String name;

	private int age;

	private int role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", age=" + age + ", role=" + role + "]";
	}

}
