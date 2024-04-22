package cl.tchile.hexagonaltest.infraestructure.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cl.tchile.hexagonaltest.domain.models.User;
import cl.tchile.hexagonaltest.infraestructure.entities.UserEntities;


public interface JpaUserRepository extends JpaRepository<User, String>{



}
