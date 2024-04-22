package cl.tchile.hexagonaltest.infraestructure.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cl.tchile.hexagonaltest.domain.models.User;

@Repository
public interface MongoUserRepository extends MongoRepository<User, String> {

}
