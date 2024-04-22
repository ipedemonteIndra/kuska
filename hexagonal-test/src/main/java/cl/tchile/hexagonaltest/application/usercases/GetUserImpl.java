package cl.tchile.hexagonaltest.application.usercases;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.domain.ports.in.GetUser;
import cl.tchile.hexagonaltest.domain.ports.out.UserRepositoryPort;
import cl.tchile.hexagonaltest.infraestructure.repositories.JpaUserRepositoryAdapter;
import cl.tchile.hexagonaltest.infraestructure.repositories.MongoUserRepository;

public class GetUserImpl implements GetUser {

	@Autowired
	private JpaUserRepositoryAdapter jpaUserRepositoryAdapter;
	
	
	MongoUserRepository mongo;
	
	
	
	public GetUserImpl(MongoUserRepository mongo) {
		super();
		this.mongo = mongo;
	}



	@Override
	public Optional<User> getUser(String id) {

		jpaUserRepositoryAdapter = new JpaUserRepositoryAdapter(this.mongo);
		return jpaUserRepositoryAdapter.findById(id);
	}

}
