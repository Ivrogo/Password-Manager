package dev.ivrogo.passwordmanager.Repository;

import dev.ivrogo.passwordmanager.Model.Password;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PasswordRepository extends JpaRepository<Password, UUID> {
    List<Password> findByUserId(UUID userId);
    List<Password> findByWebsiteId(UUID websiteId);
}
