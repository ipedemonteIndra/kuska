package cl.tchile.hexagonaltest.domain.ports.in;

import cl.tchile.hexagonaltest.domain.models.User;

public interface CreateUser {
	

	User createUser(User user);
}
