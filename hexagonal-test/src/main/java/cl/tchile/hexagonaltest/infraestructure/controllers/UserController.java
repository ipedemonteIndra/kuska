package cl.tchile.hexagonaltest.infraestructure.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.tchile.hexagonaltest.application.services.UserService;
import cl.tchile.hexagonaltest.application.usercases.CreateUserImpl;
import cl.tchile.hexagonaltest.application.usercases.DeleteUserImpl;
import cl.tchile.hexagonaltest.application.usercases.GetUserImpl;
import cl.tchile.hexagonaltest.application.usercases.UpdateUserImpl;
import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.GetUser;
import cl.tchile.hexagonaltest.infraestructure.repositories.JpaUserRepositoryAdapter;
import cl.tchile.hexagonaltest.infraestructure.repositories.MongoUserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private GetUser getUser;
	

	public UserController(UserService userService) {
//		this.userService = userService;
	}
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		
//		User userCreate = userService.createUser(user);
		
//		return new ResponseEntity<>(userCreate, HttpStatus.CREATED);
		return null;
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable String userId){
		System.out.println(">>>> getUser "+userId);
//		userService = new UserService(new CreateUserImpl(null), new DeleteUserImpl(null) , new GetUserImpl(new JpaUserRepositoryAdapter(null)), new UpdateUserImpl(null));
		return new ResponseEntity(userService.getUser(userId), HttpStatus.OK);
		
//		return null;
	}
	
	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user){
		
//		return new ResponseEntity<>(userService.updateUser(user.getId(), user), HttpStatus.CREATED);
		return null;
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable String id){
		System.out.println(">>>> deleteUser");
//		 userService.deleteUser(id);
		 return new ResponseEntity<>(new User(), HttpStatus.CREATED);	

	}
	
}
