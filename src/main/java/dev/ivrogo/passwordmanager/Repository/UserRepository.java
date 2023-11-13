package dev.ivrogo.passwordmanager.Repository;

import dev.ivrogo.passwordmanager.Model.Password;
import dev.ivrogo.passwordmanager.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<Password> findByPassword(String password);
}
