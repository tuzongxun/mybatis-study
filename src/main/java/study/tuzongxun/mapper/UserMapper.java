package study.tuzongxun.mapper;

import java.util.List;

import study.tuzongxun.model.UserModel;

public interface UserMapper {
	public List<UserModel> findUsers();

	public UserModel findUserForName(String name);
}
