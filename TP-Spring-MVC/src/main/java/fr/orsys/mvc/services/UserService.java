package fr.orsys.mvc.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.orsys.mvc.dao.UserDao;
import fr.orsys.mvc.dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void add(User user) {
		userDao.persist(user);
	}
	
	@Transactional
	public void addAll(Collection<User> users) {
		for(User user : users) {
			userDao.persist(user);
		}
	}
	
	@Transactional(readOnly=true)
	public List<User> listAll() {
		return userDao.findAll();
	}
	
	@Transactional(readOnly=true)
	public User findUserByLoginPassword(String login, String password) {
		return userDao.findUserByLoginPassword(login, password);
	}
	
	@Transactional
	public void remove(User user) {
		userDao.deleteUser(user);
	}
}
