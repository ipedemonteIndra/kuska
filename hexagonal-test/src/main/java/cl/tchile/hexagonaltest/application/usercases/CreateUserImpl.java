package cl.tchile.hexagonaltest.application.usercases;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.CreateUser;
import cl.tchile.hexagonaltest.domain.ports.out.UserRepositoryPort;

public class CreateUserImpl implements CreateUser {

	private UserRepositoryPort userRepositoryPort;
	
	
	
	public CreateUserImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}



	@Override
	public User createUser(User user) {
		
		return userRepositoryPort.save(user);
	}

}
