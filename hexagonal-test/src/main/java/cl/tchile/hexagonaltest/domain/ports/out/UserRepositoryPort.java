package cl.tchile.hexagonaltest.domain.ports.out;

import java.util.List;
import java.util.Optional;

import cl.tchile.hexagonaltest.domain.models.User;

public interface UserRepositoryPort {

	User save(User us);
	
	Optional<User> findById(String id);
	
	List<User> findAll();
	
	User updateUser(User user);
	
	void deleteById(String id);
}
