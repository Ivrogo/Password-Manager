package dev.ivrogo.passwordmanager.Repository;

import dev.ivrogo.passwordmanager.Model.Website;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface WebsiteRepository extends JpaRepository<Website, UUID> {
    Optional<Website> findByName(String name);
}
