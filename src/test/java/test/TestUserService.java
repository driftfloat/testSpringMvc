package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fallwater.testSpringMvc.entity.User;
import com.fallwater.testSpringMvc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring-context.xml"
		})
@WebAppConfiguration
public class TestUserService {
	@Resource
	private UserService userService;
	
//	@Test
//	public void login() {
//		String username = "username1";
//		String password = "password";
//		User user = new User();
//		user.setUsername(username);
//		user.setPassword(password);
//		System.out.println(userService.login(user));
//	}
	
	@Test
	public void query() {
		String username = "username";
//		String password = "password";
		User user = new User();
		user.setUsername(username);
//		user.setPassword(password);
		System.out.println(userService.query(user));
	}
}
;