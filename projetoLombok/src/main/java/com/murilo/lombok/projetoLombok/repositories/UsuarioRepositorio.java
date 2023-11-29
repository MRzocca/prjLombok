package com.murilo.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.lombok.projetoLombok.entities.*;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
}