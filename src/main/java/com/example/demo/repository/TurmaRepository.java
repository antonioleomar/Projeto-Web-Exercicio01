package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Turma;



@Repository
public interface TurmaRepository extends JpaRepository<Turma, String> {

}
