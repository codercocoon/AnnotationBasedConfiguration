package javaspringexamples.spring.ioc.configuration.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/javaspringexamples/spring/ioc/configuration/annotation/configuration.xml");
		UserService userService = applicationContext.getBean(UserService.class);

		System.out.println("User1 Informations: " + userService.getUserinformation(1));
		System.out.println("User2 Informations: " + userService.getUserinformation(2));

		System.out.println("Locking User1 account");
		userService.lockAccountUser(1);
		System.out.println("User1 Informations: " + userService.getUserinformation(1));
	}

}
