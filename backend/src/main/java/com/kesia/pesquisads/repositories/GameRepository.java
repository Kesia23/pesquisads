package com.kesia.pesquisads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kesia.pesquisads.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
