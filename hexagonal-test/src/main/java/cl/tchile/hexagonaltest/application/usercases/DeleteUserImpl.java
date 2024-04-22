package cl.tchile.hexagonaltest.application.usercases;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.DeleteUser;
import cl.tchile.hexagonaltest.domain.ports.out.UserRepositoryPort;

public class DeleteUserImpl implements DeleteUser{

	
	private UserRepositoryPort userRepositoryPort;
	
	
	
	public DeleteUserImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}



	public DeleteUserImpl() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void deleteUser(String id) {

		userRepositoryPort.deleteById(id);
	}

}
