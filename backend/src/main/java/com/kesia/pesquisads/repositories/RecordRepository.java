package com.kesia.pesquisads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kesia.pesquisads.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
