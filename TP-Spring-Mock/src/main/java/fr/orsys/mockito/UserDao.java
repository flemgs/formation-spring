package fr.orsys.mockito;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public User findUserById(long id) {
		return new User();
	}
}
