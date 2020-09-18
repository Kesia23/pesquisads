package com.kesia.pesquisads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kesia.pesquisads.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
