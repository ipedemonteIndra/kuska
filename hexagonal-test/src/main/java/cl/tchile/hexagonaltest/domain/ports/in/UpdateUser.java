package cl.tchile.hexagonaltest.domain.ports.in;

import java.util.Optional;

import cl.tchile.hexagonaltest.domain.models.User;

public interface UpdateUser {

	User updateUser(String id, User user);
}
