package cl.tchile.hexagonaltest.application.usercases;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.CreateUser;
import cl.tchile.hexagonaltest.domain.ports.out.UserRepositoryPort;
import cl.tchile.hexagonaltest.infraestructure.repositories.JpaUserRepositoryAdapter;
import cl.tchile.hexagonaltest.infraestructure.repositories.MongoUserRepository;

public class CreateUserImpl implements CreateUser {

	@Autowired
	private JpaUserRepositoryAdapter jpaUserRepositoryAdapter;
	
	MongoUserRepository mongo;
	


	public CreateUserImpl(MongoUserRepository mongo) {
		super();
		this.mongo = mongo;
	}



	@Override
	public User createUser(User user) {
		jpaUserRepositoryAdapter = new JpaUserRepositoryAdapter(this.mongo);
		return jpaUserRepositoryAdapter.save(user);
	}

}
