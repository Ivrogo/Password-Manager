package dev.ivrogo.passwordmanager.Repository;

import dev.ivrogo.passwordmanager.Model.Password;
import dev.ivrogo.passwordmanager.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PasswordRepository extends JpaRepository<Password, UUID> {

    Optional<User> findByUser(String username);

}
