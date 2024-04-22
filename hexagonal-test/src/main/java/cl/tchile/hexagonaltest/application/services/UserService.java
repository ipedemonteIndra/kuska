package cl.tchile.hexagonaltest.application.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tchile.hexagonaltest.application.usercases.CreateUserImpl;
import cl.tchile.hexagonaltest.application.usercases.DeleteUserImpl;
import cl.tchile.hexagonaltest.application.usercases.GetUserImpl;
import cl.tchile.hexagonaltest.application.usercases.UpdateUserImpl;
import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.CreateUser;
import cl.tchile.hexagonaltest.domain.ports.in.DeleteUser;
import cl.tchile.hexagonaltest.domain.ports.in.GetUser;
import cl.tchile.hexagonaltest.domain.ports.in.UpdateUser;
import cl.tchile.hexagonaltest.infraestructure.repositories.JpaUserRepository;
import cl.tchile.hexagonaltest.infraestructure.repositories.MongoUserRepository;

@Service
public class UserService implements CreateUser, DeleteUser, GetUser, UpdateUser{

	private CreateUser createUser = null;
	
	private DeleteUser deleteUser = null;
	
	private GetUser getUser = null;
	
	private UpdateUser updateUser = null;
	
	@Autowired
	MongoUserRepository mongo;

	
	JpaUserRepository jpaUserRepository;
	
	public UserService() {
		
	}

	
	public UserService(CreateUser createUser, DeleteUser deleteUser, GetUser getUser, UpdateUser updateUser) {
		this.createUser = createUser;
		this.deleteUser = deleteUser;
		this.getUser = getUser;
		this.updateUser = updateUser;
	}



	@Override
	public User updateUser(String id, User user) {
		updateUser = new UpdateUserImpl(this.mongo); 
		return updateUser.updateUser(id, user);
	}

	@Override
	public Optional<User> getUser(String id) {
//		return jpaUserRepository.getById(id);
		getUser = new GetUserImpl(this.mongo);
		return getUser.getUser(id);
//		return mongo.findById(id);
	}

	@Override
	public void deleteUser(String id) {
		this.deleteUser = new DeleteUserImpl();
		deleteUser.deleteUser(id);
	}

	@Override
	public User createUser(User user) {
		this.createUser = new CreateUserImpl(this.mongo);
		return createUser.createUser(user);
	}
	
	
}
