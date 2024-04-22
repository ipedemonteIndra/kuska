package cl.tchile.hexagonaltest.application.usercases;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.GetUser;
import cl.tchile.hexagonaltest.domain.ports.out.UserRepositoryPort;
import cl.tchile.hexagonaltest.infraestructure.repositories.JpaUserRepositoryAdapter;

public class GetUserImpl implements GetUser {

	@Autowired
	private JpaUserRepositoryAdapter jpaUserRepositoryAdapter;
	
	
	
	@Override
	public Optional<User> getUser(String id) {

		jpaUserRepositoryAdapter = new JpaUserRepositoryAdapter();
		return jpaUserRepositoryAdapter.findById(id);
	}

}
