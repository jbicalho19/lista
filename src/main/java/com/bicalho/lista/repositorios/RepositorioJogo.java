package com.bicalho.lista.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bicalho.lista.entidades.Jogo;

public interface RepositorioJogo extends JpaRepository<Jogo, Long> {

}
