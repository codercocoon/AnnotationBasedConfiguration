package com.codercocoon.spring.ioc.configuration.annotation;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
public interface UserService {

	String getUserinformation(int userId);

	void lockAccountUser(int userId);

	void unlockAccountUser(int userId);
}
