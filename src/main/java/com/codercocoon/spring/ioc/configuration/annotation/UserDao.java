package com.codercocoon.spring.ioc.configuration.annotation;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
public interface UserDao {

	User find(int userId);

	void insert(User user);

	void update(User user);

	void delete(int userId);

	void lockAccount(int userId, boolean locked);

}
