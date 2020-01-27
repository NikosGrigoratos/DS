package gr.hua.dit.ds1.dao;

import java.util.List;

import gr.hua.dit.ds1.entity.User;

public interface UserDAO {
	public List<User> getUsers();
	public String addUser(User user);
	public String deleteUser(int id);
}
