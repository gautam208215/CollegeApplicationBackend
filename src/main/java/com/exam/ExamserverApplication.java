package com.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{
//	@Autowired
//	private UserService userService;
	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting Code");
		
		/*User user=new User();
		user.setFirstName("Anurag");
		user.setLastName("Mishra");
		user.setUsername("truly.anurag");
		user.setPassword(this.bCryptPasswordEncoder.encode("Hello"));
		user.setEmail("anurag@gmail.com");
		user.setProfile("abc.png");
		
		Role role1=new Role();
		
		role1.setRoleId(22L);
		role1.setRoleName("ADMIN");
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		
		User user1=this.userService.createUser(user,userRoleSet);
		
		System.out.println(user1.getUsername());
		*/
		
	}

}
