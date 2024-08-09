package com.api.cinema.repository;

import com.api.cinema.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CredentialRepository extends JpaRepository<Credential, Long> {
}
