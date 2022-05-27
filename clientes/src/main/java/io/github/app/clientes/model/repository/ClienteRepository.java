package io.github.app.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.app.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
