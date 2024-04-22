package cl.tchile.hexagonaltest.application.usercases;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.UpdateUser;
import cl.tchile.hexagonaltest.domain.ports.out.UserRepositoryPort;
import cl.tchile.hexagonaltest.infraestructure.repositories.JpaUserRepositoryAdapter;
import cl.tchile.hexagonaltest.infraestructure.repositories.MongoUserRepository;

public class UpdateUserImpl implements UpdateUser{

	@Autowired
	private JpaUserRepositoryAdapter jpaUserRepositoryAdapter;
	
	MongoUserRepository mongo;
	
	
	public UpdateUserImpl(MongoUserRepository mongo) {
		super();
		this.mongo = mongo;
	}



	@Override
	public User updateUser(String id, User user) {
		jpaUserRepositoryAdapter = new JpaUserRepositoryAdapter(this.mongo);
		return jpaUserRepositoryAdapter.save(user);
	}

}
