package fr.orsys.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMaintenanceService {

	@Autowired
	private UserDao userDao;
	
	public User findUserById(long id) {
		return userDao.findUserById(id);
	}
}
