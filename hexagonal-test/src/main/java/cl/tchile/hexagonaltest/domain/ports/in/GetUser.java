package cl.tchile.hexagonaltest.domain.ports.in;

import java.util.Optional;

import cl.tchile.hexagonaltest.domain.models.User;

public interface GetUser {

	Optional<User> getUser(String id);
}
