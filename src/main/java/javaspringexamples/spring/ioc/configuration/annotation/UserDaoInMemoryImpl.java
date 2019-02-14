package javaspringexamples.spring.ioc.configuration.annotation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */

@Repository
public class UserDaoInMemoryImpl implements UserDao {

	private Map<Integer, User> usersMap = new HashMap<>();

	{
		User user1 = new User();
		user1.setId(1);
		user1.setFisrtName("FirstName 1");
		user1.setLastName("LastName 1");
		user1.setAccountlocked(false);

		User user2 = new User();
		user2.setId(2);
		user2.setFisrtName("FirstName 2");
		user2.setLastName("LastName 2");
		user2.setAccountlocked(false);

		usersMap.put(user1.getId(), user1);
		usersMap.put(user2.getId(), user2);

	}

	@Override
	public void insert(User user) {
		usersMap.put(user.getId(), user);
	}

	@Override
	public void update(User user) {
		usersMap.put(user.getId(), user);
	}

	@Override
	public void delete(int userId) {
		usersMap.remove(userId);
	}

	@Override
	public User find(int userId) {
		return usersMap.get(userId);
	}

	@Override
	public void lockAccount(int userId, boolean locked) {
		User user = usersMap.get(userId);
		user.setAccountlocked(locked);
		update(user);
	}
}
