package cl.tchile.hexagonaltest.application.usercases;

import java.util.Optional;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.UpdateUser;
import cl.tchile.hexagonaltest.domain.ports.out.UserRepositoryPort;

public class UpdateUserImpl implements UpdateUser{

	private UserRepositoryPort userRepositoryPort;
	
	
	
	public UpdateUserImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}



	@Override
	public User updateUser(String id, User user) {

		return userRepositoryPort.updateUser(user);
	}

}
